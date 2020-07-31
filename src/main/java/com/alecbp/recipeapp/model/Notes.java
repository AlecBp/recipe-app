package com.alecbp.recipeapp.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne // Recipe will own this object, meaning that if the recipe is deleted the notes will also be deleted
    private Recipe recipe;

    @Lob
    private String recipeNotes;
}
