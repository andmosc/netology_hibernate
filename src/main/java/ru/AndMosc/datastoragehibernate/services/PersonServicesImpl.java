package ru.AndMosc.datastoragehibernate.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.AndMosc.datastoragehibernate.dao.PersonDao;
import ru.AndMosc.datastoragehibernate.model.Person;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonServicesImpl implements PersonServices {
    private final PersonDao personDao;

    @Override
    public List<Person> getAllPersons() {
        return personDao.findAll();
    }

    public List<Person> getPersonsByCity(String city) {
        return personDao.findAllByCityOfLiving(city);
    }

    @Override
    public List<Person> getPersonsByAgeLessThan(Integer age) {
        return personDao.findAllByPersonDataAgeLessThanOrderByPersonDataAge(age);
    }

    @Override
    public Person getPersonByNameAndSurname(String name, String surname) {
        return personDao.findAllByPersonDataNameAndPersonDataSurname(name, surname).orElse(null);
    }
}
