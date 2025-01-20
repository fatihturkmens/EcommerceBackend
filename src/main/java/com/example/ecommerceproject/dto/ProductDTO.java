package com.example.ecommerceproject.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {


    @NotEmpty(message = "name alanı boş bırakılamaz")
    @Size(min = 3,max = 40)
    private String name;


    @NotEmpty(message = "Category alanı boş bırakılamaz")
    @Size(min = 3,max = 40)
    private String category;


    private int price;
    private double stock;

    @NotEmpty(message = "Description alanı boş bırakılamaz")
    @Size(min = 3,max = 40)
    private String description;
}
