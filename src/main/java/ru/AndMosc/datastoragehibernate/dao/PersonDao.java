package ru.AndMosc.datastoragehibernate.dao;

import ru.AndMosc.datastoragehibernate.model.Person;

import java.util.List;

public interface PersonDao {
    List<Person> getPersonsByCity(String city);
}
