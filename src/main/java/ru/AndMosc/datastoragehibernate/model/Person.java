package ru.AndMosc.datastoragehibernate.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Person {
    @EmbeddedId
    private PersonData personData;
    private String phoneNumber;
    private String cityOfLiving;
}
