package com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.services.impl;

import com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.domain.Alumno;
import com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.domain.dto.AlumnoDTO;
import com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.repository.AlumnoRepository;
import com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.repository.CursoAlumnoRepository;
import com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.services.AlumnoService;
import com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.util.ResponseMessage;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoService {
    private final AlumnoRepository alumnoRepository;
    private final CursoAlumnoRepository cursoAlumnoRepository;
    public AlumnoServiceImpl(AlumnoRepository alumnoRepository, CursoAlumnoRepository cursoAlumnoRepository) {
        this.alumnoRepository = alumnoRepository;
        this.cursoAlumnoRepository = cursoAlumnoRepository;
    }

    @Override
    public List<Alumno> getAlumnos() {
        return alumnoRepository.findAll();
    }
    @Override
    public Alumno findAlumno(Long id){
        return alumnoRepository.findById(id).orElse(null);
    }
    @Override
    public ResponseMessage deleteAlumno(Long id){
        try{
            Alumno alumno = alumnoRepository.findById(id).orElse(null);
            assert alumno != null;
          //  cursoAlumnoRepository.deleteAll(alumno.getCursoAlumnos());
            alumnoRepository.delete(alumno);
            return new ResponseMessage("OK", HttpStatus.OK);
        } catch (Exception ex){
            return new ResponseMessage("FAIL", HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @Override
    public ResponseMessage registrarAlumno(AlumnoDTO alumno) {
        try{
            Alumno alumnoEntity = new Alumno();
            alumnoEntity.setNombre(alumno.getNombre());
            alumnoEntity.setApellidoPaterno(alumno.getApellidoPaterno());
            alumnoEntity.setApellidoMaterno(alumno.getApellidoMaterno());
            alumnoEntity.setEdad(alumno.getEdad());
            alumnoRepository.save(alumnoEntity);
            return new ResponseMessage("OK", HttpStatus.OK);
        }catch (Exception ex){
            return new ResponseMessage("FAIL", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @Override
    public ResponseMessage editarAlumno(AlumnoDTO alumno, Long id) {
        try{
            Alumno alumnoEntity = alumnoRepository.findById(id).orElse(null);
            alumnoEntity.setNombre(alumno.getNombre());
            alumnoEntity.setApellidoPaterno(alumno.getApellidoPaterno());
            alumnoEntity.setApellidoMaterno(alumno.getApellidoMaterno());
            alumnoEntity.setEdad(alumno.getEdad());
            alumnoRepository.save(alumnoEntity);
            return new ResponseMessage("OK", HttpStatus.OK);
        }catch (Exception ex){
            return new ResponseMessage("FAIL", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
