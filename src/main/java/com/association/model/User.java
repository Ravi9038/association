package com.association.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "tbl_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_cart_id",referencedColumnName = "id")
    private Cart cart;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_user_id",referencedColumnName = "id")
    private List<Address> address = new ArrayList<>();


}
