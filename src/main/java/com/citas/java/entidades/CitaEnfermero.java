package com.citas.java.entidades;

import java.time.LocalDateTime;

import com.citas.java.enumeraciones.ProcedimientosEnfermeria;

public class CitaEnfermero extends Cita implements IAgendamiento {

    private ProcedimientosEnfermeria procedimiento;
    private paciente paciente;
    private Enfermero enfermero;


    

    public CitaEnfermero(Integer id, LocalDateTime fecha, com.citas.java.entidades.paciente paciente,
            ProcedimientosEnfermeria procedimiento, com.citas.java.entidades.paciente paciente2, Enfermero enfermero) {
        super(id, fecha, paciente);
        this.procedimiento = procedimiento;
        paciente = paciente2;
        this.enfermero = enfermero;
    }


   


    public ProcedimientosEnfermeria getProcedimiento() {
        return procedimiento;
    }





    public void setProcedimiento(ProcedimientosEnfermeria procedimiento) {
        this.procedimiento = procedimiento;
    }





    public paciente getPaciente() {
        return paciente;
    }





    public void setPaciente(paciente paciente) {
        this.paciente = paciente;
    }





    public Enfermero getEnfermero() {
        return enfermero;
    }





    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }





    @Override
    public void agendarCita(LocalDateTime fechaCita) {
    }


    @Override
    public void cancelarCita() {
        System.out.println("Cita para procedimiento: " + this.procedimiento +  "cancelada");
    }


    @Override
    public void reagendarCita(LocalDateTime fechaCita) {
    }
    

    

}
