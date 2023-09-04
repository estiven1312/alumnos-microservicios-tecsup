package com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.controller;

import com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.domain.Alumno;
import com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.domain.dto.AlumnoDTO;
import com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.services.AlumnoService;
import com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.util.ResponseMessage;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/findAlumno", params = {"idAlumno"})
    public Alumno listarAlumno(@RequestParam(name = "idAlumno") Long idAlumno){
        return alumnoService.findAlumno(idAlumno);
    }

    @DeleteMapping(value = "/deleteAlumno", params = {"idAlumno"})
    public ResponseMessage deleteAlumno(@RequestParam(name = "idAlumno") Long idAlumno){
        return alumnoService.deleteAlumno(idAlumno);
    }
    @PostMapping(value = "/save")
    public ResponseMessage saveAlumno(@RequestBody AlumnoDTO alumnoDTO){
        return alumnoService.registrarAlumno(alumnoDTO);
    }

    @PostMapping(value = "/edit", params = {"idAlumno"})
    public ResponseMessage editAlumno(@RequestParam(name = "idAlumno") Long idAlumno,@RequestBody AlumnoDTO alumnoDTO){
        return alumnoService.editarAlumno(alumnoDTO, idAlumno);
    }
}
