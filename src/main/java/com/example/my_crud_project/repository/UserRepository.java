package com.example.my_crud_project.repository;

import com.example.my_crud_project.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
