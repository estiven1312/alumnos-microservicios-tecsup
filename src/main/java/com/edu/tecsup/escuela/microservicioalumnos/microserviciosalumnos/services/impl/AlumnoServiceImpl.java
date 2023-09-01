package com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.services.impl;

import com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.domain.Alumno;
import com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.domain.dto.AlumnoDTO;
import com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.repository.AlumnoRepository;
import com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.services.AlumnoService;
import com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.util.ResponseMessage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoService {
    private final AlumnoRepository alumnoRepository;

    public AlumnoServiceImpl(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    @Override
    public List<Alumno> getAlumnos() {
        return alumnoRepository.findAll();
    }

    @Override
    public ResponseMessage registrarAlumno(AlumnoDTO alumno) {
        return null;
    }
}
