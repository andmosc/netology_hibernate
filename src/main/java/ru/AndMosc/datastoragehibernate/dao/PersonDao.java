package ru.AndMosc.datastoragehibernate.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.AndMosc.datastoragehibernate.model.Person;
import ru.AndMosc.datastoragehibernate.model.PersonData;

import java.util.List;
import java.util.Optional;

public interface PersonDao extends JpaRepository<Person,PersonData>{
    List<Person> findAllByCityOfLiving(String city);

    List<Person> findAllByPersonDataAgeLessThanOrderByPersonDataAge(Integer age);

    Optional<Person> findAllByPersonDataNameAndPersonDataSurname(String name, String surname);

}
