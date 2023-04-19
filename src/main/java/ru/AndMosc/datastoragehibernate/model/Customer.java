package ru.AndMosc.datastoragehibernate.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "age")
    private int age;

    @Column(name = "phone_number")
    private String phoneNumber;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<Order> listOrder;

    public Customer(String name, String surname, int age, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public void addOrders(Order order) {
        if (listOrder == null) {
            listOrder = new ArrayList<>();
        }
        listOrder.add(order);
        order.setCustomer(this);
    }
}
