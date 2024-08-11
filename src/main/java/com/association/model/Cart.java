package com.association.model;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "tbl_cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cartName;

    @OneToMany(cascade = jakarta.persistence.CascadeType.ALL)
    @JoinColumn(name = "cart_id", referencedColumnName = "id")
    private List<CartItem> cartItems = new ArrayList<>();

}
