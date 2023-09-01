package com.edu.tecsup.escuela.microservicioalumnos.microserviciosalumnos.domain.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public @Data class AlumnoDTO {

    private Long id;
    private String nombre;
    private String apellidoMaterno;
    private String apellidoPaterno;
    private Integer edad;
}
