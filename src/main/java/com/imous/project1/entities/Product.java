package com.imous.project1.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomProduct;
    private Double prix;
    @ManyToMany(mappedBy = "products")
    private Set<OrderEntity>   commands;
}
