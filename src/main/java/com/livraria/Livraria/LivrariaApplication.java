package com.livraria.Livraria;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class LivrariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LivrariaApplication.class, args);
	}

}
