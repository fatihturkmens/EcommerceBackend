package com.example.ecommerceproject.controller;

import com.example.ecommerceproject.model.Customer;
import com.example.ecommerceproject.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    public ResponseEntity<String> addCustomer(@RequestBody @Valid Customer customer){   // yeni bir müşteri ekleme
        String added=customerService.addCustomer(customer);
        return new ResponseEntity<>(added,HttpStatus.CREATED);
    }
}
