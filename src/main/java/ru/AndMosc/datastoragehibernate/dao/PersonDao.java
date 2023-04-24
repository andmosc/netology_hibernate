package ru.AndMosc.datastoragehibernate.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.AndMosc.datastoragehibernate.model.Person;
import ru.AndMosc.datastoragehibernate.model.PersonData;

import java.util.List;
import java.util.Optional;
@Repository
public interface PersonDao extends JpaRepository<Person,PersonData>{
    @Query(value = "select p from Person p where p.cityOfLiving = :city")
    List<Person> getAllByCityOfLiving(@Param("city") String city);

    @Query(value = "select p from Person p where p.personData.age < :age order by p.personData.age")
    List<Person> getAllByPersonDataAgeLessThanOrderByPersonDataAge(@Param("age") Integer age);

    @Query(value = "select * from person p where p.name = :name and p.surname = :surname",nativeQuery = true)
    Optional<Person> findAllByPersonDataNameAndPersonDataSurname(@Param("name") String name, @Param("surname") String surname);
}
