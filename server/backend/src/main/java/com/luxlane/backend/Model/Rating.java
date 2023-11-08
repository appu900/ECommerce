package com.luxlane.backend.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Rating {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="user_id",nullable = false)
    private User user;


    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="product_id",nullable = false)
    private Product product;

    @Column(name = "rating")
    private double rating;


}
