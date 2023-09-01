package com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.controller;

import com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.domain.Alumno;
import com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.services.AlumnoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/alumno")
public class AlumnosController {
    private final AlumnoService alumnoService;

    public AlumnosController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }
    @GetMapping
    public List<Alumno> listarAlumno(){
        return alumnoService.getAlumnos();
    }
}
