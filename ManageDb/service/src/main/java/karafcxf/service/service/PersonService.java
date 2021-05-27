package karafcxf.service.service;

import karafcxf.entity.PersonEntity;
import java.util.List;

public interface PersonService {
    public List<PersonEntity> getList();

    PersonEntity getPerson(Integer id);

    void addPerson(PersonEntity personEntity);

    void updatePerson(Integer id, PersonEntity personEntity);

    void delPerson(Integer id);
}
