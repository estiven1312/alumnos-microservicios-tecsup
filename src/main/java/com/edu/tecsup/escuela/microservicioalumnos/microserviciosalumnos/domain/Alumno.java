package com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "alumno")
public @Data class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido_materno")
    private String apellidoMaterno;
    @Column(name = "apellido_paterno")
    private String apellidoPaterno;
    @Column(name = "edad")
    private Integer edad;
    @OneToMany(mappedBy = "alumno")
    @JsonIgnore
    private Set<CursoAlumno> cursoAlumnos;
}
