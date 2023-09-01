package com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.services;

import com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.domain.Alumno;
import com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.domain.dto.AlumnoDTO;
import com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.util.ResponseMessage;

import java.util.List;

public interface AlumnoService {
    List<Alumno> getAlumnos();
    ResponseMessage registrarAlumno(AlumnoDTO alumno);

}
