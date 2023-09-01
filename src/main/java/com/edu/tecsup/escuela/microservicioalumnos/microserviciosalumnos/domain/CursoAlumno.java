package com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.domain;

import com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.domain.id.CursoAlumnoId;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "curso_alumno")
public @Data class CursoAlumno {
    @EmbeddedId
    private CursoAlumnoId id;
    @ManyToOne
    @MapsId("cursoId")
    @JoinColumn(name = "curso_id")
    private Curso curso;
    @ManyToOne
    @MapsId("alumnoId")
    @JoinColumn(name = "alumno_id")
    private Alumno alumno;
    @Column(name = "numero_matricula")
    private String numeroMatricula;
    @Column(name = "fecha_matricula")
    private Date fechaMatricula;
}
