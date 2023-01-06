package com.example.ejercicio456.repositories;

import com.example.ejercicio456.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}