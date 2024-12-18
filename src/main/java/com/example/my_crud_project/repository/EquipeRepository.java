package com.example.my_crud_project.repository;

import com.example.my_crud_project.models.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipeRepository extends JpaRepository<Equipe, Long> {
}
