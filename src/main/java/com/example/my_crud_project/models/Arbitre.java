package com.example.my_crud_project.models;

import com.example.my_crud_project.models.enums.Niveau;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Arbitre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String nationalite;

    @Enumerated(EnumType.STRING)
    private Niveau niveau;  // Enum for Niveau

    @OneToMany(mappedBy = "arbitre")
    private List<Rencontre> rencontres;

    @ManyToOne
    @JoinColumn(name = "equipe_id")
    private Equipe equipe;

    public Niveau getNiveau() {
        return niveau;
    }

    // Getters and Setters
}