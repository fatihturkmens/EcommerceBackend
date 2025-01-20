package com.example.ecommerceproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItems extends BaseEntity{


    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;




}
