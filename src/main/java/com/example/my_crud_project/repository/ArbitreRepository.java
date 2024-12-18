package com.example.my_crud_project.repository;

import com.example.my_crud_project.models.Arbitre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArbitreRepository extends JpaRepository<Arbitre, Long> {

    Arbitre findByNomAndPrenom(String nom, String prenom);

    List<Arbitre> findArbitresByEquipe_Id(Long equipeId);
}
