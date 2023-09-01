package com.example.lab2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "seleccion")
@Getter
@Setter
public class Seleccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idseleccion;

    @Column(name = "nombre",nullable = false,length = 45)
    private String nombre;

    @Column(name = "tecnico",nullable = false, length = 45)
    private String tecnico;

    @Column(name = "estadio_idestadio",nullable = true,length = 45)
    private Integer estadio_idestadio;
}
