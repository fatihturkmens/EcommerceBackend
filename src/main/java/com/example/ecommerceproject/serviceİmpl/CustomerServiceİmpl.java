package com.example.ecommerceproject.serviceİmpl;

import com.example.ecommerceproject.model.Customer;
import com.example.ecommerceproject.repository.CustomerRepository;
import com.example.ecommerceproject.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceİmpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


       public String addCustomer(Customer customer){
        customerRepository.save(customer);
        return "Müşteri eklendi";


    }
}
