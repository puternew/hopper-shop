/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.controllor;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.UserTransaction;
import model.Productgucci;
import model.controllor.exceptions.NonexistentEntityException;
import model.controllor.exceptions.PreexistingEntityException;
import model.controllor.exceptions.RollbackFailureException;

/**
 *
 * @author PANUPONG INTHILAD
 */
public class ProductgucciJpaController implements Serializable {

    public ProductgucciJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Productgucci productgucci) throws PreexistingEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            em.persist(productgucci);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            if (findProductgucci(productgucci.getProductno()) != null) {
                throw new PreexistingEntityException("Productgucci " + productgucci + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Productgucci productgucci) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            productgucci = em.merge(productgucci);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = productgucci.getProductno();
                if (findProductgucci(id) == null) {
                    throw new NonexistentEntityException("The productgucci with id " + id + " no longer exists.");
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
            Productgucci productgucci;
            try {
                productgucci = em.getReference(Productgucci.class, id);
                productgucci.getProductno();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The productgucci with id " + id + " no longer exists.", enfe);
            }
            em.remove(productgucci);
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

    public List<Productgucci> findProductgucciEntities() {
        return findProductgucciEntities(true, -1, -1);
    }

    public List<Productgucci> findProductgucciEntities(int maxResults, int firstResult) {
        return findProductgucciEntities(false, maxResults, firstResult);
    }

    private List<Productgucci> findProductgucciEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Productgucci.class));
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

    public Productgucci findProductgucci(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Productgucci.class, id);
        } finally {
            em.close();
        }
    }

    public int getProductgucciCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Productgucci> rt = cq.from(Productgucci.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
