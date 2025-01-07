package com.imous.project1.entities;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Entity
public class OrderEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String reference;
    private LocalDate orderDate;
    @ManyToMany
    private Set<Product> products;

    @Override
    public boolean equals(Object obj) {
        // Vérifie si les deux objets sont égaux
        if (this == obj) {
            return true; // Même référence mémoire
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Null ou classes différentes
        }
        OrderEntity that = (OrderEntity) obj;
        // Compare les ids si disponibles
        return Objects.equals(id, that.id); // Compares `id` which is usually the unique identifier
    }

    @Override
    public int hashCode() {
        // Utiliser `id` pour calculer le hash code
        return Objects.hash(id);
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
}
