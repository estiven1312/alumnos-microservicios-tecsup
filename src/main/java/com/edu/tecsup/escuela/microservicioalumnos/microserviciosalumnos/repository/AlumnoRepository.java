package com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.repository;

import com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.domain.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
    @Query("SELECT a FROM Alumno a JOIN a.cursoAlumnos ca WHERE ca.curso.id = :idCurso")
    List<Alumno> findAlumnosByIdCurso(@Param("idCurso") Long idCurso);
}
