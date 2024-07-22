package com.example.demo.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.model.Restaurante;
import com.example.demo.domain.repository.RestauranteRepository;

public class RestauranteRepositoryImpl implements RestauranteRepository{

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public List<Restaurante> todos(){
		return	manager.createQuery("from Restaurante", Restaurante.class)
				.getResultList();		
	}
	
	@Override
	public Restaurante porId(Long id) {
		return manager.find(Restaurante.class, id);
	}
	
	@Transactional
	@Override
	public Restaurante adicionar(Restaurante restaurante) {
		return manager.merge(restaurante);
	}
	
	@Transactional
	@Override
	public void remover(Restaurante restaurante) {
		restaurante = porId(restaurante.getId());
		manager.remove(restaurante);
	}

}