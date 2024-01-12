package com.example.finaltab.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JsonIgnoreProperties("shops")
    private Business business;

    @OneToMany(mappedBy = "shop")
    @JsonIgnoreProperties("shop")
    private List<Item> items;

    @OneToMany(mappedBy = "shop")
    @JsonIgnoreProperties("shop")
    private List<Order> orders;

}
