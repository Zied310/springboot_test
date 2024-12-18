package com.example.my_crud_project.service;

import com.example.my_crud_project.models.Arbitre;
import com.example.my_crud_project.models.Rencontre;
import com.example.my_crud_project.repository.ArbitreRepository;
import com.example.my_crud_project.repository.RencontreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MatchService {
    @Autowired
    private RencontreRepository rencontreRepository;

    @Autowired
    private ArbitreRepository arbitreRepository;

    public void affecterArbitreARencontre(String nom, String prenom, Long idR) throws Exception {
        Rencontre rencontre = rencontreRepository.findById(idR).orElseThrow(() -> new Exception("Rencontre non trouvée"));
        Arbitre arbitre = arbitreRepository.findByNomAndPrenom(nom, prenom);

        if (!arbitre.getNiveau().equals(rencontre.getNiveau())) {
            throw new Exception("Exception déclenchée");
        }

        rencontre.setArbitre(arbitre);
        rencontreRepository.save(rencontre);
    }

    public void incrementerNbreBut(Long idRencontre) {
        Rencontre rencontre = rencontreRepository.findById(idRencontre).orElseThrow(() -> new RuntimeException("Rencontre non trouvée"));
        if (rencontre.getDateMatch().equals(new Date())) {
            rencontre.setNbreBut(rencontre.getNbreBut() + 1);
            rencontreRepository.save(rencontre);
        }
    }
}

