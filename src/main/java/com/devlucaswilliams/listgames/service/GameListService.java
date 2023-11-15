package com.devlucaswilliams.listgames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devlucaswilliams.listgames.dto.GameListDTO;
import com.devlucaswilliams.listgames.entities.GameList;
import com.devlucaswilliams.listgames.repository.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository repository;
	
	public List<GameListDTO> findAll(){
		List<GameList> list = repository.findAll();
		return list.stream().map(x -> new GameListDTO(x)).toList();
	}
}
