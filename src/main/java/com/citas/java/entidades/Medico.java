package com.citas.java.entidades;

import com.citas.java.enumeraciones.Especialidad;
import com.citas.java.enumeraciones.TipoDocumento;

//subclase
public class Medico extends Persona {
    // wrapper

    private long registroMedico;
    private Especialidad especialidad;

    
    public Medico(Integer id, String nombres, String apellidos, TipoDocumento tipoDocumento, long numeroDocumento) {
        super(id, nombres, apellidos, tipoDocumento, numeroDocumento);
    }

    public Medico(Integer id, String nombres, String apellidos, TipoDocumento tipoDocumento, long numeroDocumento,
            long registroMedico, Especialidad especialidad) {
        super(id, nombres, apellidos, tipoDocumento, numeroDocumento);
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    public long getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(long registroMedico) {
        this.registroMedico = registroMedico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Medico [especialidad=" + especialidad 
        + ", Nombres()=" + getNombres() 
        + ", Apellidos()=" + getApellidos() + "]";
    }

    
}
