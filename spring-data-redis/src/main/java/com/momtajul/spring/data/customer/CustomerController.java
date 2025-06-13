package com.momtajul.spring.data.customer;

import jakarta.inject.Inject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("customers")
public class CustomerController {

    private final CustomerService customerService;

    @Inject
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public ResponseEntity<List<Customer>> findAll() {
        List<Customer> customers = customerService.findAll();
        return ResponseEntity.ok(customers);
    }

    @GetMapping("/{id}")
    public Optional<Customer> findById(@PathVariable("id") Long id) {
        return customerService.findById(id);
    }

    // create a book
    @PostMapping
    public ResponseEntity<Customer> create(@RequestBody Customer customer) {
        Customer c = customerService.save(customer);
        return ResponseEntity.status(HttpStatus.CREATED).body(c);
    }

    // update a customer
    @PutMapping
    public ResponseEntity<Customer> update(@RequestBody Customer customer) {
        Customer c = customerService.save(customer);
        return ResponseEntity.status(HttpStatus.CREATED).body(customer);
    }

    // delete a customer
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        customerService.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
