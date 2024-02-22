package com.gerenciador.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciador.entities.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, Long> {

}
