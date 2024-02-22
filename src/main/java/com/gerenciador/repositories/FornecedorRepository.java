package com.gerenciador.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciador.entities.Fornecedor;

public interface FornecedorRepository extends JpaRepository <Fornecedor, Long> {

}
