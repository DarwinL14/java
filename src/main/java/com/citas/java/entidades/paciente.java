package com.citas.java.entidades;

import java.time.LocalDate;

import com.citas.java.enumeraciones.TipoDocumento;

import com.citas.java.enumeraciones.TipoSangre;

public class paciente extends Persona {

    private String correoElectronico;
    private long celular;
    private LocalDate fechaNacimiento;
    private double altura;
    private double peso;
    private TipoSangre tipoSangre;
    private char RH;



    public paciente(Integer id, String nombres, String apellidos, TipoDocumento tipoDocumento, long numeroDocumento,
            String correoElectronico, long celular, LocalDate fechaNacimiento, double altura, double peso,
            TipoSangre tipoSangre, char rH) {
        super(id, nombres, apellidos, tipoDocumento, numeroDocumento);
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        RH = rH;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public char getRH() {
        return RH;
    }

    public void setRH(char rH) {
        RH = rH;
    }

    @Override
    public String toString() {
        return "paciente [fechaNacimiento=" + fechaNacimiento + ", altura=" + altura + ", peso=" + peso
                + ", tipoSangre=" + tipoSangre + ", RH=" + RH + ", getNombres()=" + getNombres() + ", getApellidos()="
                + getApellidos() + ", getCorreoElectronico()=" + getCorreoElectronico() + ", getTipoDocumento()="
                + getTipoDocumento() + ", getNumeroDocumento()=" + getNumeroDocumento() + "]";
    }


    
    
    

}
