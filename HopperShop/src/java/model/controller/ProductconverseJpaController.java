/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.controller;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.UserTransaction;
import model.Productconverse;
import model.controller.exceptions.NonexistentEntityException;
import model.controller.exceptions.PreexistingEntityException;
import model.controller.exceptions.RollbackFailureException;

/**
 *
 * @author Student
 */
public class ProductconverseJpaController implements Serializable {

    public ProductconverseJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Productconverse productconverse) throws PreexistingEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            em.persist(productconverse);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            if (findProductconverse(productconverse.getProductno()) != null) {
                throw new PreexistingEntityException("Productconverse " + productconverse + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Productconverse productconverse) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            productconverse = em.merge(productconverse);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = productconverse.getProductno();
                if (findProductconverse(id) == null) {
                    throw new NonexistentEntityException("The productconverse with id " + id + " no longer exists.");
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
            Productconverse productconverse;
            try {
                productconverse = em.getReference(Productconverse.class, id);
                productconverse.getProductno();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The productconverse with id " + id + " no longer exists.", enfe);
            }
            em.remove(productconverse);
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

    public List<Productconverse> findProductconverseEntities() {
        return findProductconverseEntities(true, -1, -1);
    }

    public List<Productconverse> findProductconverseEntities(int maxResults, int firstResult) {
        return findProductconverseEntities(false, maxResults, firstResult);
    }

    private List<Productconverse> findProductconverseEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Productconverse.class));
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

    public Productconverse findProductconverse(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Productconverse.class, id);
        } finally {
            em.close();
        }
    }

    public int getProductconverseCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Productconverse> rt = cq.from(Productconverse.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
