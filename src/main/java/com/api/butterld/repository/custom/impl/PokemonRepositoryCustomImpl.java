package com.api.butterld.repository.custom.impl;

import java.util.List;

import com.api.butterld.entity.PokemonEntity;
import com.api.butterld.repository.custom.PokemonRepositoryCustom;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class PokemonRepositoryCustomImpl implements PokemonRepositoryCustom {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PokemonEntity getLastPokemon() {

		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<PokemonEntity> query = cb.createQuery(PokemonEntity.class);

		Root<PokemonEntity> root = query.from(PokemonEntity.class);

		query.select(root).orderBy(cb.desc(root.get("date")));

		List<PokemonEntity> results = entityManager.createQuery(query).setMaxResults(1).getResultList();

		return results.isEmpty() ? null : results.get(0);
	}

}
