package com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.repository;

import com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.domain.CursoAlumno;
import com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.domain.id.CursoAlumnoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoAlumnoRepository extends JpaRepository<CursoAlumno, CursoAlumnoId> {

}
