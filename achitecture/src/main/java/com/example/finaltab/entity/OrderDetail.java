package com.example.finaltab.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int quantity;

    @ManyToOne
    @JsonIgnoreProperties("orderDetails")
    private Item item;

    @ManyToOne
    @JsonIgnoreProperties("orderDetails")
    private Order order;

}
