package com.example.ecommerceproject.model;

import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;

public class Address extends BaseEntity{
    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "district")
    private String district;

    @Column(name = "apartmentNumber")
    private int apartmentNumber;

    @Column(name = "street")
    private String street;


    @ManyToOne
    private Customer customer;


}
