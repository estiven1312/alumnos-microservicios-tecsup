package com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "curso")
@Data
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliclo_id")
    private CicloAcademico ciclo;

    @OneToMany(mappedBy = "curso")
    private Set<CursoAlumno> cursoAlumnos;
}
