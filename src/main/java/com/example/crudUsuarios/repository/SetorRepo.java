package com.example.crudUsuarios.repository;

import com.example.crudUsuarios.model.Setores;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SetorRepo extends JpaRepository<Setores, Long> {
    
}
