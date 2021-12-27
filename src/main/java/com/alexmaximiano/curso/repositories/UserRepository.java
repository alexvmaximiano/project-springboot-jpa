package com.alexmaximiano.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexmaximiano.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
