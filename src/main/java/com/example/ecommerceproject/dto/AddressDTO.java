package com.example.ecommerceproject.dto;

import com.example.ecommerceproject.model.Customer;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {


    @NotEmpty(message = "country alanı boş bırakılamaz")
    @Size(min = 3,max = 20)
    private String country;

    @NotEmpty(message = "city alanı boş bırakılamaz")
    @Size(min = 3,max = 20)
    private String city;

    @NotEmpty(message = "apartmentnumber alanı boş bırakılamaz")
    @Size(min = 3,max = 20)
    private int apartmentNumber;

    @NotEmpty(message = "street alanı boş bırakılamaz")
    @Size(min = 3,max = 20)
    private String street;

    private Customer customer;
}
