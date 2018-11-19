/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.controller;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import model.Address;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.transaction.UserTransaction;
import model.Account;
import model.controller.exceptions.NonexistentEntityException;
import model.controller.exceptions.PreexistingEntityException;
import model.controller.exceptions.RollbackFailureException;

/**
 *
 * @author PANUPONG INTHILAD
 */
public class AccountJpaController implements Serializable {

    public AccountJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Account account) throws PreexistingEntityException, RollbackFailureException, Exception {
        if (account.getAddressList() == null) {
            account.setAddressList(new ArrayList<Address>());
        }
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            List<Address> attachedAddressList = new ArrayList<Address>();
            for (Address addressListAddressToAttach : account.getAddressList()) {
                addressListAddressToAttach = em.getReference(addressListAddressToAttach.getClass(), addressListAddressToAttach.getAddressno());
                attachedAddressList.add(addressListAddressToAttach);
            }
            account.setAddressList(attachedAddressList);
            em.persist(account);
            for (Address addressListAddress : account.getAddressList()) {
                Account oldAccountnoOfAddressListAddress = addressListAddress.getAccountno();
                addressListAddress.setAccountno(account);
                addressListAddress = em.merge(addressListAddress);
                if (oldAccountnoOfAddressListAddress != null) {
                    oldAccountnoOfAddressListAddress.getAddressList().remove(addressListAddress);
                    oldAccountnoOfAddressListAddress = em.merge(oldAccountnoOfAddressListAddress);
                }
            }
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            if (findAccount(account.getAccountno()) != null) {
                throw new PreexistingEntityException("Account " + account + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Account account) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Account persistentAccount = em.find(Account.class, account.getAccountno());
            List<Address> addressListOld = persistentAccount.getAddressList();
            List<Address> addressListNew = account.getAddressList();
            List<Address> attachedAddressListNew = new ArrayList<Address>();
            for (Address addressListNewAddressToAttach : addressListNew) {
                addressListNewAddressToAttach = em.getReference(addressListNewAddressToAttach.getClass(), addressListNewAddressToAttach.getAddressno());
                attachedAddressListNew.add(addressListNewAddressToAttach);
            }
            addressListNew = attachedAddressListNew;
            account.setAddressList(addressListNew);
            account = em.merge(account);
            for (Address addressListOldAddress : addressListOld) {
                if (!addressListNew.contains(addressListOldAddress)) {
                    addressListOldAddress.setAccountno(null);
                    addressListOldAddress = em.merge(addressListOldAddress);
                }
            }
            for (Address addressListNewAddress : addressListNew) {
                if (!addressListOld.contains(addressListNewAddress)) {
                    Account oldAccountnoOfAddressListNewAddress = addressListNewAddress.getAccountno();
                    addressListNewAddress.setAccountno(account);
                    addressListNewAddress = em.merge(addressListNewAddress);
                    if (oldAccountnoOfAddressListNewAddress != null && !oldAccountnoOfAddressListNewAddress.equals(account)) {
                        oldAccountnoOfAddressListNewAddress.getAddressList().remove(addressListNewAddress);
                        oldAccountnoOfAddressListNewAddress = em.merge(oldAccountnoOfAddressListNewAddress);
                    }
                }
            }
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = account.getAccountno();
                if (findAccount(id) == null) {
                    throw new NonexistentEntityException("The account with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Account account;
            try {
                account = em.getReference(Account.class, id);
                account.getAccountno();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The account with id " + id + " no longer exists.", enfe);
            }
            List<Address> addressList = account.getAddressList();
            for (Address addressListAddress : addressList) {
                addressListAddress.setAccountno(null);
                addressListAddress = em.merge(addressListAddress);
            }
            em.remove(account);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Account> findAccountEntities() {
        return findAccountEntities(true, -1, -1);
    }

    public List<Account> findAccountEntities(int maxResults, int firstResult) {
        return findAccountEntities(false, maxResults, firstResult);
    }

    private List<Account> findAccountEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Account.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Account findAccount(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Account.class, id);
        } finally {
            em.close();
        }
    }
    public Account findAccountEmail(String email){
        EntityManager em = getEntityManager();
        Query query = em.createNamedQuery("Account.findByEmail");
        query.setParameter("email", email);
        try{
            return (Account) query.getSingleResult();
        }catch(NoResultException ex) {
            return null;
        }finally {
            em.close();
        }
    }

    public int getAccountCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Account> rt = cq.from(Account.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
