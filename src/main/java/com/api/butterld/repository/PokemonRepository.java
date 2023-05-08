package com.api.butterld.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.butterld.entity.PokemonEntity;

@Repository
public interface PokemonRepository extends JpaRepository<PokemonEntity, Integer> {

}
