package ru.AndMosc.datastoragehibernate.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.AndMosc.datastoragehibernate.model.Person;
import ru.AndMosc.datastoragehibernate.services.PersonServicesImpl;

import java.util.List;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonController {
    private final PersonServicesImpl personServices;

    @GetMapping
    public List<Person> getAllPersons() {
        return personServices.getAllPersons();
    }
    @GetMapping("/by-city")
    public List<Person> getPersonsByCity(@RequestParam("city") String city) {
        return personServices.getPersonsByCity(city);
    }

    @GetMapping("/by-age-less")
    public List<Person> getPersonsByAgeLessThan(@RequestParam("age") Integer age) {
        return personServices.getPersonsByAgeLessThan(age);
    }

    @GetMapping("/by-name-surname")
    public Person getPersonsByNameAndSurname(@RequestParam("name") String name,
                                             @RequestParam("surname") String surname) {
        return personServices.getPersonByNameAndSurname(name, surname);
    }
}
