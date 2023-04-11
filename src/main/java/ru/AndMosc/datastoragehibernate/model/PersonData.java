package ru.AndMosc.datastoragehibernate.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class PersonData implements Serializable {
    private String name;
    private String surname;
    private int age;
}
