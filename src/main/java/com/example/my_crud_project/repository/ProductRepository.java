package com.example.my_crud_project.repository;

import com.example.my_crud_project.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
