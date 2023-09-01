package com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.domain.id;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public @Data class CursoAlumnoId implements Serializable {
    @Column(name = "alumno_id")
    private Long alumnoId;
    @Column(name = "curso_id")
    private Long cursoId;
}
