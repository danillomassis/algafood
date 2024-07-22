package com.example.demo.domain.repository;

import java.util.List;

import com.example.demo.domain.model.Cozinha;

public interface CozinhaRepository {

	List<Cozinha> listar();
	Cozinha buscar(Long id);
	Cozinha adicionar(Cozinha cozinha);
	void remover(Cozinha cozinha);
	
}