package com.alexmaximiano.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexmaximiano.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
