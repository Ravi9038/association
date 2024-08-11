package com.association.controller;

import com.association.model.Address;
import com.association.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping("/saveaddress")
    public Address saveAddress(@RequestBody Address address){
        return addressService.saveData(address);
    }
}
