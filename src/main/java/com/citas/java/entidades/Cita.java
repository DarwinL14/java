package com.citas.java.entidades;

import java.time.LocalDateTime;


public class Cita {
    private Integer id;
    protected LocalDateTime fecha;
    protected paciente paciente;


    public Cita(Integer id, LocalDateTime fecha, com.citas.java.entidades.paciente paciente) {
        this.id = id;
        this.fecha = fecha;
        this.paciente = paciente;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public LocalDateTime getFecha() {
        return fecha;
    }


    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }


    public paciente getPaciente() {
        return paciente;
    }


    public void setPaciente(paciente paciente) {
        this.paciente = paciente;
    }

    

    

    
}
