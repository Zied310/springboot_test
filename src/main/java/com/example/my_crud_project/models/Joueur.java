package com.example.my_crud_project.models;


import com.example.my_crud_project.models.enums.Poste;
import jakarta.persistence.*;

@Entity
public class Joueur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;

    @Enumerated(EnumType.STRING)
    private Poste poste;  // Enum for Poste

    private int numMaillot;

    @ManyToOne
    @JoinColumn(name = "equipe_id")
    private Equipe equipe;

    // Getters and Setters
}

