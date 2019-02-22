package io.fdlessard.codebites.customer.proto.controllers;


import io.fdlessard.codebites.customer.proto.model.Proto.Address;
import io.fdlessard.codebites.customer.proto.services.AddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/addresses")
public class AddressController {

    private AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping(value = "/isAlive", produces = "application/json")
    public String isAlive() {
        log.debug("AddressController.isAlive()");
        return "Hello World from AddressController";
    }

    @GetMapping(value = "/{id}")
    @ResponseBody
    public Address get(@PathVariable long id) {
        log.debug("AddressController.get({})", id);
        return addressService.getAddressById(id);
    }

    @GetMapping(value = "/")
    @ResponseBody
    public Iterable<Address> getAll() {
        log.debug("AddressController.getAll()");
        return addressService.geAllAddresses();
    }

}
