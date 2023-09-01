package com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.repository;

import com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.domain.CicloAcademico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CicloAcademicoRepository extends JpaRepository<CicloAcademico, Long> {
}
