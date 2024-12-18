package com.example.my_crud_project.service;

import com.example.my_crud_project.models.Rencontre;
import com.example.my_crud_project.repository.RencontreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RencontreService {
    @Autowired
    private RencontreRepository rencontreRepository;

    public Rencontre ajouterRencontreEtAffecterEquipes(Rencontre rencontre, Long idEquipe1, Long idEquipe2) {
        // Logic to assign teams to the match
        return rencontreRepository.save(rencontre);
    }
}
