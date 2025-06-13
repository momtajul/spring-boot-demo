package com.momtajul.spring.jakarta.customer;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
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

    // create a book
    @POST
    public Response create(Customer customer) {
        Customer c = customerService.save(customer);
        return Response.status(Status.CREATED).entity(c).build();
    }

    // update a customer
    @PUT
    public Response update(Customer customer) {
        Customer c = customerService.save(customer);
        return Response.accepted(c).build();
    }

    // delete a customer
    @DELETE
    @Path("/{id}")
    public Response deleteById(@PathParam("id") Long id) {
        customerService.deleteById(id);
        return Response.status(Status.NO_CONTENT).build();
    }
}
