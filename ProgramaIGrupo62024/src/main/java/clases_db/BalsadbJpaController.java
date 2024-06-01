/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_db;

import clases_db.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author vmora
 */
public class BalsadbJpaController implements Serializable {

    public BalsadbJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Balsadb balsadb) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(balsadb);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Balsadb balsadb) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            balsadb = em.merge(balsadb);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = balsadb.getIdBalsa();
                if (findBalsadb(id) == null) {
                    throw new NonexistentEntityException("The balsadb with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Balsadb balsadb;
            try {
                balsadb = em.getReference(Balsadb.class, id);
                balsadb.getIdBalsa();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The balsadb with id " + id + " no longer exists.", enfe);
            }
            em.remove(balsadb);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Balsadb> findBalsadbEntities() {
        return findBalsadbEntities(true, -1, -1);
    }

    public List<Balsadb> findBalsadbEntities(int maxResults, int firstResult) {
        return findBalsadbEntities(false, maxResults, firstResult);
    }

    private List<Balsadb> findBalsadbEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Balsadb.class));
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

    public Balsadb findBalsadb(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Balsadb.class, id);
        } finally {
            em.close();
        }
    }

    public int getBalsadbCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Balsadb> rt = cq.from(Balsadb.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
