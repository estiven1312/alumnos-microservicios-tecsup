package com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.repository;

import com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.domain.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso,Long> {
}
