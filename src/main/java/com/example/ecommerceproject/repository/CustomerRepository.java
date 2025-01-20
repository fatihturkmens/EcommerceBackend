package com.example.ecommerceproject.repository;

import com.example.ecommerceproject.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
