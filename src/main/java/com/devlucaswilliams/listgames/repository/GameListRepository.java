package com.devlucaswilliams.listgames.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlucaswilliams.listgames.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
