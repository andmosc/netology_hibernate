package ru.AndMosc.datastoragehibernate.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.AndMosc.datastoragehibernate.model.Person;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PersonDaoImpl implements PersonDao{

    @PersistenceContext
    private final EntityManager entityManager;

    @Override
    public List<Person> getPersonsByCity(String city) {
        TypedQuery<Person> query = entityManager.createQuery("select p from Person p where p.cityOfLiving = :city", Person.class);
        query.setParameter("city",city);
        return query.getResultList();
    }
}
