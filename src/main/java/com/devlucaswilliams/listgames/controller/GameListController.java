package com.devlucaswilliams.listgames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devlucaswilliams.listgames.dto.GameListDTO;
import com.devlucaswilliams.listgames.service.GameListService;

@RestController
@RequestMapping(value = "/list")
public class GameListController {
	
	@Autowired
	private GameListService service;

	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> list = service.findAll();
		return list;
	}
	
}
