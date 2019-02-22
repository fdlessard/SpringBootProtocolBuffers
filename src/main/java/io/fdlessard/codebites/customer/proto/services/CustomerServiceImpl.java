package io.fdlessard.codebites.customer.proto.services;


import io.fdlessard.codebites.customer.proto.model.Proto.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    public CustomerServiceImpl() {
    }

    public Customer getCustomerById(long id) {

        log.debug("CustomerServiceImpl.get({})", id);
        return buildCustomer(id);
    }

    public List<Customer> geAllCustomers() {

        log.debug("CustomerController.getAll()");

        return Arrays.asList(
                buildCustomer(0L),
                buildCustomer(1L),
                buildCustomer(2L)
        );
    }

    private Customer buildCustomer(Long id) {
        return Customer.newBuilder()
                .setId(id)
                .setLastName("lastName" + id)
                .setFirstName("firstName" + id)
                .setCompany("company" + id)
                .build();
    }


}
