package io.fdlessard.codebites.customer.proto.controllers;


import io.fdlessard.codebites.customer.proto.model.Proto.Customer;
import io.fdlessard.codebites.customer.proto.services.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/customers")
public class CustomerController {


    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "/isAlive", produces = "application/json")
    public String isAlive() {
        log.debug("CustomerController.isAlive()");
        return "Hello World from CustomerController";
    }

    @GetMapping(value = "/{id}")
    @ResponseBody
    public Customer get(@PathVariable long id) {
        log.debug("CustomerController.get({})", id);
        return customerService.getCustomerById(id);
    }

    @GetMapping(value = "/")
    @ResponseBody
    public Iterable<Customer> getAll() {
        log.debug("CustomerController.getAll()");
        return customerService.geAllCustomers();
    }
}
