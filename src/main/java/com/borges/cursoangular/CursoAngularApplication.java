package com.borges.cursoangular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CursoAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoAngularApplication.class, args);
	}

}
