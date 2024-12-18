package com.example.my_crud_project.service;

import com.example.my_crud_project.models.Equipe;
import com.example.my_crud_project.repository.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipeService {
    @Autowired
    private EquipeRepository equipeRepository;

    public Equipe ajouterEquipeEtJoueurs(Equipe equipe) {
        return equipeRepository.save(equipe);
    }
}
