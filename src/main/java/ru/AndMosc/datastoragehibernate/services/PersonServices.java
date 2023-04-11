package ru.AndMosc.datastoragehibernate.services;

import ru.AndMosc.datastoragehibernate.model.Person;

import java.util.List;

public interface PersonServices {
    List<Person> getPersonsByCity(String city);
}
