package com.example.my_crud_project.models;


import com.example.my_crud_project.models.enums.Niveau;
import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Rencontre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateMatch;
    private String nomStade;

    @ManyToOne
    @JoinColumn(name = "equipe1_id")
    private Equipe equipe1;

    @ManyToOne
    @JoinColumn(name = "equipe2_id")
    private Equipe equipe2;

    @ManyToOne
    @JoinColumn(name = "arbitre_id")
    private Arbitre arbitre;

    private int nbreBut;

    public int getNbreBut() {
        return nbreBut;
    }

    public void setNbreBut(int nbreBut) {
        this.nbreBut = nbreBut;
    }

    public Date getDateMatch() {
        return dateMatch;
    }

    public void setDateMatch(Date dateMatch) {
        this.dateMatch = dateMatch;
    }

    public void setNomStade(String nomStade) {
        this.nomStade = nomStade;
    }

    public String getNomStade() {
        return nomStade;
    }

    public Equipe getEquipe1() {
        return equipe1;
    }

    public Equipe getEquipe2() {
        return equipe2;
    }

    public void setEquipe1(Equipe equipe1) {
        this.equipe1 = equipe1;
    }

    public void setEquipe2(Equipe equipe2) {
        this.equipe2 = equipe2;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }




    @Enumerated(EnumType.STRING)
    private Niveau niveau;  // Enum for Niveau

    public Niveau getNiveau() {
        return niveau;
    }

    public void setArbitre(Arbitre arbitre) {
        this.arbitre = arbitre;
    }

    // Getters and Setters
}

