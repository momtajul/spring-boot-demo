package com.momtajul.spring.demo.customer;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@Path("customers")
public class CustomerResource {

    private CustomerService customerService;

    @Inject
    public CustomerResource(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GET
    public Response findAll() {
        List<Customer> customers = customerService.findAll();
        return Response.ok(customers).build();
    }

    @GET
    @Path("/{id}")
    public Optional<Customer> findById(@PathParam("id") Long id) {
        return customerService.findById(id);
    }
}
