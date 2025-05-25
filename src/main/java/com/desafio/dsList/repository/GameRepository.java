package com.desafio.dsList.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.dsList.model.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    // Métodos customizados podem ser adicionados aqui
}
