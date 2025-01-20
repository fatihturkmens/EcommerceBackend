package com.example.ecommerceproject.dto;

import com.example.ecommerceproject.model.Customer;
import com.example.ecommerceproject.model.Product;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

    private Long id;
    private double totalprice;

    private Customer customer;

    private List<Product> productList;

    private LocalDate date;


    @NotEmpty(message = "status ismi boş bırakılamaz")
    @Size(min = 3,max = 40)
    private String status;
}
