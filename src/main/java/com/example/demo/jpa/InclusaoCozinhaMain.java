package com.example.demo.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.example.demo.Aula01AlgafoodApplication;
import com.example.demo.domain.model.Cozinha;
import com.example.demo.domain.repository.CozinhaRepository;

public class InclusaoCozinhaMain {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(Aula01AlgafoodApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		
		CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);
		
		Cozinha cozinha1 = new Cozinha();
		cozinha1.setNome("Brasileira");
				
		Cozinha cozinha2 = new Cozinha();
		cozinha2.setNome("Japonesa");
		
		cozinha1 = cozinhaRepository.salvar(cozinha1);
		cozinha2 = cozinhaRepository.salvar(cozinha2); 
		
		System.out.printf("%d - %s\n", cozinha1.getId(), cozinha1.getNome());
		System.out.printf("%d - %s\n", cozinha2.getId(), cozinha2.getNome());
	}
}
