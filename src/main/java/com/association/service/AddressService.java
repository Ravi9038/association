package com.association.service;

import com.association.model.Address;
import com.association.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public Address saveData(Address address) {
        return addressRepository.save(address);
    }
}
