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

    @GetMapping("/by-city")
    public List<Person> getPersonsByCity(@RequestParam(value = "city") String city) {
        return personServices.getPersonsByCity(city);
    }
}
