package com.devlucaswilliams.listgames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devlucaswilliams.listgames.dto.GameDTO;
import com.devlucaswilliams.listgames.dto.GameMinDTO;
import com.devlucaswilliams.listgames.entities.Game;
import com.devlucaswilliams.listgames.projection.GameMinProjection;
import com.devlucaswilliams.listgames.repository.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game entity = repository.getOne(id);
		return new GameDTO(entity);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> list = repository.findAll();
		return list.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId){
		List<GameMinProjection> list = repository.searchByList(listId);
		return list.stream().map(x -> new GameMinDTO(x)).toList();
	}

	
	
}
