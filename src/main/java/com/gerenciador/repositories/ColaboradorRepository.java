package com.gerenciador.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciador.entities.Colaborador;

public interface ColaboradorRepository extends JpaRepository <Colaborador, Long> {

}
