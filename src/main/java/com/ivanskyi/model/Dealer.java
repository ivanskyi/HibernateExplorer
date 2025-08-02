package com.ivanskyi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Dealer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    @ManyToMany
    @JoinTable(
            name = "dealer_model",
            joinColumns = @JoinColumn(name = "dealer_id"),
            inverseJoinColumns = @JoinColumn(name = "model_id")
    )
    List<Model> models;
}
