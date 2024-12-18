package com.example.my_crud_project.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomEquipe;
    private String dateCreation;

    @OneToMany(mappedBy = "equipe")
    private List<Joueur> joueurs;

    @OneToMany(mappedBy = "equipe1")
    private List<Rencontre> rencontres1;

    @OneToMany(mappedBy = "equipe2")
    private List<Rencontre> rencontres2;

    // Getters and Setters
}
