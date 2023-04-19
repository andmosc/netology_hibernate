package ru.AndMosc.datastoragehibernate.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name = "orders")
@NamedQuery(
        name = "QUERY_GET_ALL_ORDERS_BY_NAME",
        query = "select o.productName from Order o left join Customer c ON o.customer = c.id WHERE c.name LIKE :name"
)
@NamedNativeQuery(
        name = "NQUERY_GET_ALL_ORDERS_BY_NAME",
        query = "select o.product_name from orders o left join customers c ON o.customer_id = c.id " +
                "WHERE c.name LIKE :name",
        resultClass = Order.class
)
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date date;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "amount")
    private int amount;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Order(Date date, String productName, int amount) {
        this.date = date;
        this.productName = productName;
        this.amount = amount;
    }
}
