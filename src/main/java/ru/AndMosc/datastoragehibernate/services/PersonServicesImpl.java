package ru.AndMosc.datastoragehibernate.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.AndMosc.datastoragehibernate.dao.PersonDao;
import ru.AndMosc.datastoragehibernate.model.Person;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonServicesImpl implements PersonServices{
    private final PersonDao personDao;

    public List<Person> getPersonsByCity(String city) {
        return personDao.getPersonsByCity(city);
    }
}
