package com.ivanskyi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    String description;

    @ManyToOne
    Manufacturer manufacturer;

    @ManyToMany(mappedBy = "models")
    List<Dealer> dealers;
}
