package com.citas.java.entidades;

import com.citas.java.enumeraciones.TipoDocumento;

//superclase
public abstract class  Persona {
    private Integer id;
    private static String nombres;
    private String apellidos;
    private TipoDocumento tipoDocumento;
    private long numeroDocumento;
    
    

    public Persona() {
    }

    @SuppressWarnings("static-access")
    public Persona(Integer id, String nombres, String apellidos, TipoDocumento tipoDocumento, long numeroDocumento) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static String getNombres() {
        return nombres;
    }

    @SuppressWarnings("static-access")
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public long getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

}
