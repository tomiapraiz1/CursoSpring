package com.example.ejercicio456.controllers;

import com.example.ejercicio456.entities.Laptop;
import com.example.ejercicio456.repositories.LaptopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class LaptopController {

    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }


    //listar todas las laptops
    @GetMapping("/api/laptops")
    public ArrayList<Laptop> findAll(){
        return (ArrayList<Laptop>) laptopRepository.findAll();
    }

    //crear un objeto laptop y meterlo en la base de datos
    @PostMapping("/api/laptops")
    public Laptop create(@RequestBody Laptop laptop){
        return laptopRepository.save(laptop);
    }
}
