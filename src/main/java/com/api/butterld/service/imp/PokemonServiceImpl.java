package com.api.butterld.service.imp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.butterld.entity.PokemonEntity;
import com.api.butterld.repository.PokemonRepository;
import com.api.butterld.service.PokemonService;

@Service
public class PokemonServiceImpl implements PokemonService{
	
	@Autowired
	private PokemonRepository pokemonRepository;
	
	@Override
	public String getCurrentPokemon() {

		PokemonEntity currentPokemon = pokemonRepository.getCurrentPokemon();
		
		if(currentPokemon != null) {
			return currentPokemon.getPokemon_name();
		}
		return null;
	}

}
