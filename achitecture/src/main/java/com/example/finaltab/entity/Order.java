package com.example.finaltab.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;

    @ManyToOne
    @JsonIgnoreProperties("orders")
    private Shop shop;

    @ManyToOne
    @JsonIgnoreProperties("orders")
    private Customer customer;

    @OneToMany(mappedBy = "order")
    @JsonIgnoreProperties("order")
    private List<OrderDetail> orderDetails;

}
