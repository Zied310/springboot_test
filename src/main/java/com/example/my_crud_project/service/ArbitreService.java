package com.example.my_crud_project.service;

import com.example.my_crud_project.models.Arbitre;
import com.example.my_crud_project.repository.ArbitreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArbitreService {
    @Autowired
    private ArbitreRepository arbitreRepository;

    public Arbitre ajouterArbitre(Arbitre arbitre) {
        return arbitreRepository.save(arbitre);
    }

    public List<Arbitre> recupererArbitresDUneEquipe(Long idEquipe) {
        return arbitreRepository.findArbitresByEquipe_Id(idEquipe);
    }
}
