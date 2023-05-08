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

		Optional<PokemonEntity> currentPokemon = pokemonRepository.findById(1);
		
		if(currentPokemon.isPresent()) {
			return currentPokemon.get().getPokemon_name();
		}
		return null;
	}

}
