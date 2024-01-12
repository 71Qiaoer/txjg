package com.example.finaltab.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
public class ShopItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JsonIgnoreProperties("shopItems")
    private Shop shop;

    @ManyToOne
    @JsonIgnoreProperties("shopItems")
    private Item item;

    private boolean onShelf;

}
