package com.example.obspringdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CocheRepository extends JpaRepository<Coche, Long> {
    //pasar los tipos de objetos a almacenar y el tipo de la clave primaria




}
