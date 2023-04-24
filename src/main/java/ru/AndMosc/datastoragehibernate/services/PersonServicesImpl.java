package ru.AndMosc.datastoragehibernate.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.AndMosc.datastoragehibernate.dao.PersonDao;
import ru.AndMosc.datastoragehibernate.model.Person;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonServicesImpl implements PersonServices {
    private final PersonDao personDao;

    @Override
    public List<Person> getAllPersons() {
        return personDao.findAll();
    }

    public List<Person> getPersonsByCity(String city) {
        return personDao.getAllByCityOfLiving(city);
    }

    @Override
    public List<Person> getPersonsByAgeLessThan(Integer age) {
        return personDao.getAllByPersonDataAgeLessThanOrderByPersonDataAge(age);
    }

    @Override
    public Person getPersonByNameAndSurname(String name, String surname) {
        return personDao.findAllByPersonDataNameAndPersonDataSurname(name, surname).orElse(null);
    }
}
