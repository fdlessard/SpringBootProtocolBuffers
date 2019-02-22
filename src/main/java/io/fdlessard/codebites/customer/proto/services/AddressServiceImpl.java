package io.fdlessard.codebites.customer.proto.services;


import io.fdlessard.codebites.customer.proto.model.Proto.Address;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Slf4j
@Service
public class AddressServiceImpl implements AddressService {

    public AddressServiceImpl() {
    }

    public Address getAddressById(Long id) {

        log.debug("AddressServiceImpl.getAddressById({})", id);

        return buildAddress(id);
    }


    public List<Address> geAllAddresses() {

        log.debug("AddressServiceImpl.geAllAddresses()");

        List<Address> addresses = new ArrayList<>();
        addresses.add(buildAddress(0L));
        addresses.add(buildAddress(1L));
        addresses.add(buildAddress(2L));

        return addresses;

    }

    private Address buildAddress(Long id) {
        return Address.newBuilder()
                .setId(id)
                .setNumber("number" + id)
                .setStreet("street" + id)
                .setCity("city" + id)
                .setPostalCode("postalCode" + id)
                .setProvince("province"  + id)
                .setCountry("country" + id)
                .build();
    }

}
