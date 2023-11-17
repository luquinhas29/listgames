package com.devlucaswilliams.listgames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devlucaswilliams.listgames.dto.GameListDTO;
import com.devlucaswilliams.listgames.dto.GameMinDTO;
import com.devlucaswilliams.listgames.dto.ReplacementDTO;
import com.devlucaswilliams.listgames.service.GameListService;
import com.devlucaswilliams.listgames.service.GameService;

@RestController
@RequestMapping(value = "/list")
public class GameListController {
	
	@Autowired
	private GameListService service;
	
	@Autowired
	private GameService Gameservice;

	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> list = service.findAll();
		return list;
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findById(@PathVariable Long listId){
		List<GameMinDTO> list = Gameservice.findByList(listId);
		return list;
	}
	
	@PostMapping(value = "/{listId}/replacement")
	public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
		service.move(listId, body.getSourceIndex(), body.getDestinationIndex());
	}
	
}
