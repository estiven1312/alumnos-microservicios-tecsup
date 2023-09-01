package com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ciclo_academico")
public @Data class CicloAcademico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "year")
    private Long year;
    @Column(name = "semestre")
    private Long semestre;
    @OneToMany(mappedBy = "ciclo")
    private Set<Curso> cursos;
    public void addCurso(Curso curso) {
        cursos.add(curso);
        curso.setCiclo(this);
    }
    public void removeCurso(Curso curso) {
        cursos.remove(curso);
        curso.setCiclo(null);
    }
}
