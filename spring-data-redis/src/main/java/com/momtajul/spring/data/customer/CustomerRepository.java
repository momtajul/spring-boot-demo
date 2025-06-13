package com.momtajul.spring.data.customer;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import com.momtajul.spring.data.customer.Customer.Gender;
@Repository
public class CustomerRepository {

    private Map<Long, Customer> customers;

    public CustomerRepository() {
        loadCustomers();
    }

    public List<Customer> findAll(){
        return customers.values().stream().toList();
    }

    public Optional<Customer> findById(Long id){
        return Optional.of(customers.get(id));
    }

    public Customer save(Customer customer){
        customers.put(customer.getId(), customer);
        return customer;
    }

    public Customer deleteById(Long id){
        Customer customer = customers.get(id);
        customers.remove(id);
        return customer;
    }


    private void loadCustomers(){
        customers = new HashMap<>();
        Customer c1 = new Customer(1L, "Customer A", Gender.MALE, LocalDate.of(1980, 7, 1));
        Customer c2 = new Customer(2L, "Customer B", Gender.FEMALE, LocalDate.of(1990, 7, 1));
        Customer c3 = new Customer(3L,"Customer C", Gender.FEMALE, LocalDate.of(2001, 7, 1));
        Customer c4 = new Customer(4L, "Customer D", Gender.FEMALE, LocalDate.of(2004, 7, 1));

        customers.put(c1.getId(), c1);
        customers.put(c2.getId(), c2);
        customers.put(c3.getId(), c3);
        customers.put(c4.getId(), c4);
    }
}
