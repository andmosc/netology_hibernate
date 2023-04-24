package ru.AndMosc.datastoragehibernate.services;

import ru.AndMosc.datastoragehibernate.model.Person;

import java.util.List;

public interface PersonServices {
    List<Person> getAllPersons();
    List<Person> getPersonsByCity(String city);
    List<Person> getPersonsByAgeLessThan(Integer age);
    Person getPersonByNameAndSurname(String name, String surname);
}
