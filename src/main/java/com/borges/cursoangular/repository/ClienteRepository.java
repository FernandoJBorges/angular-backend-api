package com.borges.cursoangular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.borges.cursoangular.model.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
