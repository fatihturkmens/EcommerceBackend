package com.example.ecommerceproject.dto;

import com.example.ecommerceproject.model.Product;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDTO {


    @NotEmpty(message = "categoryName alanı boş bırakılamaz")
    @Size(min = 3,max = 20)
    private String categoryName;

    private List<Product> product;
}
