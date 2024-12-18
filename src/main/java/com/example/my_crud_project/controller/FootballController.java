package com.example.my_crud_project.controller;

import com.example.my_crud_project.models.*;
import com.example.my_crud_project.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class FootballController {
    @Autowired
    private ArbitreService arbitreService;

    @Autowired
    private EquipeService equipeService;

    @Autowired
    private MatchService matchService;

    @Autowired
    private RencontreService rencontreService;

    @PostMapping("/arbitres")
    public Arbitre ajouterArbitre(@RequestBody Arbitre arbitre) {
        return arbitreService.ajouterArbitre(arbitre);
    }

    @PostMapping("/equipes")
    public Equipe ajouterEquipeEtJoueurs(@RequestBody Equipe equipe) {
        return equipeService.ajouterEquipeEtJoueurs(equipe);
    }

    @PostMapping("/rencontres")
    public Rencontre ajouterRencontreEtAffecterEquipes(@RequestBody Rencontre rencontre,
                                                       @RequestParam Long idEquipe1,
                                                       @RequestParam Long idEquipe2) {
        return rencontreService.ajouterRencontreEtAffecterEquipes(rencontre, idEquipe1, idEquipe2);
    }

    @PostMapping("/affecterArbitre")
    public void affecterArbitreARencontre(@RequestParam String nom,
                                          @RequestParam String prenom,
                                          @RequestParam Long idR) throws Exception {
        matchService.affecterArbitreARencontre(nom, prenom, idR);
    }
}

