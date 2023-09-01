package com.example.lab2.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name = "jugador")
@Getter
@Setter
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idjugador;

    @Column(name = "nombre",nullable = false,length = 45)
    private String nombre;

    @Column(name = "edad",nullable = false)
    private Integer edad;

    @Column(name = "posicion",nullable = false,length = 45)
    private String posicion;

    @Column(name = "club",nullable = false,length = 45)
    private String club;

    @Column(name = "sn_idSeleccion",nullable = false)
    private Integer sn_idSeleccion;

}
