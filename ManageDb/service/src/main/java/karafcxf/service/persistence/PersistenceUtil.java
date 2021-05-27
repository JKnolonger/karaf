package karafcxf.service.persistence;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class PersistenceUtil {

    @PersistenceContext(unitName = "test-hibernate")
    private EntityManager entityManager;

    public PersistenceUtil() {
    }
    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}