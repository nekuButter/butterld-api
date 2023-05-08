package com.api.butterld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.butterld.service.PokemonService;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

	@Autowired
	private PokemonService pokemonService;
	
	@GetMapping("/getCurrent")
	public String getCurrentPokemon() {
		return pokemonService.getCurrentPokemon();
	}
	
	@GetMapping("renew")
	public String renewPokemon() {
		return pokemonService.getCurrentPokemon();
	}
}
