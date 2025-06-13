package com.momtajul.spring.demo.customer;

import jakarta.inject.Inject;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private CustomerRepository repository;

    @Inject
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public List<Customer> findAll() {
        return repository.findAll();
    }

    public Optional<Customer> findById(Long id) {
        return repository.findById(id);
    }

    public Customer greet(){
        Customer customer = new Customer(1, "Momtajul");
        return customer;
    }
}
