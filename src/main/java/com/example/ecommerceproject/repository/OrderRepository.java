package com.example.ecommerceproject.repository;

import com.example.ecommerceproject.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
