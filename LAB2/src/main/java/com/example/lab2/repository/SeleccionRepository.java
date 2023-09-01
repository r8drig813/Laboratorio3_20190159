package com.example.lab2.repository;

import com.example.lab2.entity.Seleccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeleccionRepository extends JpaRepository<Seleccion, Integer> {
}
