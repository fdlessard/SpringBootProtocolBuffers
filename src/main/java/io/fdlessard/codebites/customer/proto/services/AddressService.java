package io.fdlessard.codebites.customer.proto.services;



import io.fdlessard.codebites.customer.proto.model.Proto.Address;

import java.util.List;

public interface AddressService {

    Address getAddressById(Long id);
    List<Address> geAllAddresses();
}


