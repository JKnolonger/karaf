package karafcxf.service.service.impl;

import karafcxf.entity.PersonEntity;
import karafcxf.service.dao.PersonDAO;
import karafcxf.service.service.PersonService;

import java.util.List;

public class PersonServiceImpl implements PersonService {
    private PersonDAO personDAO;

    public PersonServiceImpl(PersonDAO personDAO){
        this.personDAO=personDAO;
    }
    public List<PersonEntity> getList() {
        List<PersonEntity> entities = personDAO.getList();
        return entities;
    }

    public PersonEntity getPerson(Integer id) {
        return personDAO.getPerson(id);
    }

    public void addPerson(PersonEntity personEntity) {
        PersonEntity p = new PersonEntity(personEntity.getName(),personEntity.getEmail());
        personDAO.addPerson(personEntity);
    }

    public void updatePerson(Integer id, PersonEntity personEntity) {
        PersonEntity e = getPerson(id);
        e.setName(personEntity.getName());
        e.setEmail(personEntity.getEmail());
        personDAO.updatePerson(e);
    }

    public void delPerson(Integer id) {
        personDAO.delPerson(id);
    }
}
