package io.fdlessard.codebites.customer.proto.services;



import io.fdlessard.codebites.customer.proto.model.Proto.Customer;

import java.util.List;

public interface CustomerService {

    Customer getCustomerById(long id);
    List<Customer> geAllCustomers();
}


