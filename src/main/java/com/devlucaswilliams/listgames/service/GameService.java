package com.devlucaswilliams.listgames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devlucaswilliams.listgames.dto.GameMinDTO;
import com.devlucaswilliams.listgames.entities.Game;
import com.devlucaswilliams.listgames.repository.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	public List<GameMinDTO> findAll(){
		List<Game> list = repository.findAll();
		return list.stream().map(x -> new GameMinDTO(x)).toList();
	}

}
