package com.citas.java.entidades;

import java.time.LocalDateTime;
import com.citas.java.enumeraciones.EstadoCita;

public class CitaMedico extends Cita implements IAgendamiento {

    private String motivo;
    private Medico medico;
    private EstadoCita EstadoCita;


    public CitaMedico(Integer id, LocalDateTime fecha, com.citas.java.entidades.paciente paciente, String motivo,
            Medico medico) {
        super(id, fecha, paciente);
        this.motivo = motivo;
        this.medico = medico;
        this.EstadoCita = com.citas.java.enumeraciones.EstadoCita.Agendada;
    }


    public String getMotivo() {
        return motivo;
    }


    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }


    public Medico getMedico() {
        return medico;
    }


    public void setMedico(Medico medico) {
        this.medico = medico;
    }


    public EstadoCita getEstadoCita() {
        return EstadoCita;
    }


    public void setEstadoCita(EstadoCita estadoCita) {
        this.EstadoCita = estadoCita;
    }


    @Override
    public void agendarCita(LocalDateTime fechaCita) {
        this.setFecha(fechaCita);
        this.setEstadoCita(com.citas.java.enumeraciones.EstadoCita.Agendada);
    }

    @Override
    public void cancelarCita() {
        this.EstadoCita = com.citas.java.enumeraciones.EstadoCita.Cancelada;
        
    }


    @Override
    public void reagendarCita(LocalDateTime fechaCita) {
        this.setFecha(fechaCita);
    }

    
}
