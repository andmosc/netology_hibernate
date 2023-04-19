package ru.AndMosc.datastoragehibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.AndMosc.datastoragehibernate.model.Customer;
import ru.AndMosc.datastoragehibernate.model.Order;

import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class DataStorageHibernateApplication implements CommandLineRunner {
	@PersistenceContext
	private EntityManager entityManager;

	public static void main(String[] args) {
		SpringApplication.run(DataStorageHibernateApplication.class, args);
	}
	@Transactional
	@Override
	public void run(String... args) throws Exception {
		Customer customer = new Customer("Андрей","Иванов",25,"123213221");
		Customer customer1 = new Customer("Иван","Петров",20,"22222222");
		Customer customer2 = new Customer("Анна","Сидорова",27,"33333333");


		Order order = new Order(new Date( 123, Calendar.MAY,12),"Сок",2);
		Order order1 = new Order(new Date(123, Calendar.MAY,12),"Молоко",1);
		Order order3 = new Order(new Date(123, Calendar.MAY,12),"Чай",3);
		Order order4 = new Order(new Date(123, Calendar.MAY,12),"Лимонад",1);
		Order order5 = new Order(new Date(123, Calendar.MAY,12),"Кофе",1);

		customer.addOrders(order);
		customer.addOrders(order5);
        customer.addOrders(order4);

        customer1.addOrders(order1);
        customer1.addOrders(order3);

		entityManager.persist(customer);
		entityManager.persist(customer1);
		entityManager.persist(customer2);

	}
}
