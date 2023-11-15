package com.devlucaswilliams.listgames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devlucaswilliams.listgames.dto.GameMinDTO;
import com.devlucaswilliams.listgames.service.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService service;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> list = service.findAll();
		return list;
	}
}
