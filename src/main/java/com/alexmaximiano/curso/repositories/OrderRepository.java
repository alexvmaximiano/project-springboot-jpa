package com.alexmaximiano.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexmaximiano.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
