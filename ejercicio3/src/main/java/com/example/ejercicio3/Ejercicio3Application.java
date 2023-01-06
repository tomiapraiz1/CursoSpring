package com.example.ejercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio3Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Ejercicio3Application.class, args);

		CocheRepository cRepo = context.getBean(CocheRepository.class);

		//meto el coche en bdd
		//Coche toyota = new Coche(null, "Toyota", "Corolla");
		//cRepo.save(toyota);

		//recupero todos
		System.out.println(cRepo.findAll());

	}

}
