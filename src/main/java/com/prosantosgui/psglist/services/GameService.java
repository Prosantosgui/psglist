package com.prosantosgui.psglist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prosantosgui.psglist.dto.GameMinDTO;
import com.prosantosgui.psglist.entities.Game;
import com.prosantosgui.psglist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRespository;
	
	public List<GameMinDTO> findAll(){
		List<Game> games = gameRespository.findAll();
		List<GameMinDTO> dto = games.stream().map(game -> new GameMinDTO(game)).toList();
		return dto;
	}
}
