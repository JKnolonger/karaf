package karafcxf.service.dao.impl;

import karafcxf.entity.PersonEntity;
import karafcxf.service.dao.PersonDAO;
import karafcxf.service.persistence.PersistenceUtil;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;


import java.util.List;

@Transactional
public class PersonDAOImpl implements PersonDAO {
    EntityManager entityManager;
    public PersonDAOImpl(PersistenceUtil persistenceUtil){

        this.entityManager=persistenceUtil.getEntityManager();
    }
    public List<PersonEntity> getList() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<PersonEntity> query = cb.createQuery(PersonEntity.class);
        return entityManager.createQuery(query.select(query.from(PersonEntity.class))).getResultList();
    }

    public PersonEntity getPerson(Integer id) {
        return entityManager.find(PersonEntity.class,id);
    }

    public void addPerson(PersonEntity personEntity) {
        entityManager.persist(personEntity);
        //entityManager.flush();
    }

    public void updatePerson(PersonEntity personEntity) {
    entityManager.merge(personEntity);
    }

    public void delPerson(Integer id) {
        entityManager.remove(getPerson(id));
    }
}
