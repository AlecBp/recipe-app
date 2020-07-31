package com.alecbp.recipeapp.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;

    // Eager Loading is a design pattern in which data initialization occurs on the spot
    // Lazy Loading is a design pattern which is used to defer initialization of an object as long as it's possible
    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure uom;

    @ManyToOne
    private Recipe recipe;


}
