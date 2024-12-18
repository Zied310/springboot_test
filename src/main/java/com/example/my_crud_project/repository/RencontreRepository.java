package com.example.my_crud_project.repository;

import com.example.my_crud_project.models.Rencontre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface RencontreRepository extends JpaRepository<Rencontre, Long> {
    // Spring Data JPA will automatically implement this method
    List<Rencontre> findByDateMatch(LocalDate date);
}
