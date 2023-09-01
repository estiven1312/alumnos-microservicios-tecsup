package com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "profesor")
public @Data class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellidos;

}
