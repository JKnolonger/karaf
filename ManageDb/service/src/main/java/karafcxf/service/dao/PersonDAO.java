package karafcxf.service.dao;

import karafcxf.entity.PersonEntity;

import java.util.List;

public interface PersonDAO {
     List<PersonEntity> getList();

    PersonEntity getPerson(Integer id);

    void addPerson(PersonEntity personEntity);

    void updatePerson(PersonEntity personEntity);

    void delPerson(Integer id);
}
