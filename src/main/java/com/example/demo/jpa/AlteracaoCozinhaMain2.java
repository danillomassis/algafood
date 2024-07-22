package com.example.demo.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.example.demo.Aula01AlgafoodApplication;
import com.example.demo.domain.model.Cozinha;
import com.example.demo.domain.repository.CozinhaRepository;

public class AlteracaoCozinhaMain2 {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(Aula01AlgafoodApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		
		CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);
		
		Cozinha cozinha = new Cozinha();
		cozinha.setId(1L);
		cozinha.setNome("Brasileira");
		
		cozinhaRepository.adicionar(cozinha);
	}
}
