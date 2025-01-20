package com.example.ecommerceproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart extends BaseEntity {


    @ManyToOne
    @JoinColumn(name = "customer_id",referencedColumnName = "id")
    private Customer customer;

    @Column(name = "total_price")
    private double totalPrice;

    @OneToMany(mappedBy = "cart")
    private List<CartItems> cartItemsList;

    @OneToMany
    @JoinColumn(name = "product_id" , referencedColumnName = "id")
    private List<Product> productList;








}


