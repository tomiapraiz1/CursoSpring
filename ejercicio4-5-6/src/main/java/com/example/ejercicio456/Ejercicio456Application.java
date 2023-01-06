package com.example.ejercicio456;

import com.example.ejercicio456.entities.Laptop;
import com.example.ejercicio456.repositories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio456Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Ejercicio456Application.class, args);

		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop l1 = new Laptop(null, "Samsung", "S10");
		Laptop l2 = new Laptop(null, "NVIDIA", "X");

		repository.save(l1);
		repository.save(l2);

	}

}
