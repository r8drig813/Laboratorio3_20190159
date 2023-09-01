package com.example.lab2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "estadio")
@Getter
@Setter
public class Estadio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idestadio;

    @Column(name = "nombre",nullable = false,length = 45)
    private String nombre;

    @Column(name = "provincia",nullable = false, length = 45)
    private String provincia;

    @Column(name = "club",nullable = true,length = 45)
    private String club;


}
