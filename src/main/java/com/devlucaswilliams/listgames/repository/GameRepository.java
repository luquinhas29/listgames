package com.devlucaswilliams.listgames.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlucaswilliams.listgames.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
