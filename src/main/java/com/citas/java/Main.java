package com.citas.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import com.citas.java.entidades.CitaEnfermero;
import com.citas.java.entidades.CitaMedico;
import com.citas.java.entidades.Consultorio;
import com.citas.java.entidades.Enfermero;
import com.citas.java.entidades.Medico;
import com.citas.java.entidades.paciente;
import com.citas.java.enumeraciones.Especialidad;
import com.citas.java.enumeraciones.ProcedimientosEnfermeria;
import com.citas.java.enumeraciones.TipoDocumento;
import com.citas.java.enumeraciones.TipoSangre;

public class Main {
    @SuppressWarnings("static-access")
public static void main(String[] args) {
        // CREAR MEDICO
        // CREAR UN OBJETO MEDICO
        // CREAR UNA INSTANCIA DE MEDICO
        Medico m1 = new Medico(
                1,
                "Cristian",
                "Buitrago",
                TipoDocumento.CC,
                3213111,
                1213412,
                Especialidad.CARDIOLOGIA);

        Medico m2 = new Medico(
                2,
                "david",
                "murcia",
                TipoDocumento.CC,
                313111,
                122112,
                Especialidad.ODONTOLOGIA);

        paciente p1 = new paciente(1,
                "juan",
                "nariño",
                TipoDocumento.CC,
                54213,
                "juan122@gmail.com",
                31263123,
                LocalDate.of(2003, Month.DECEMBER, 21),
                1.43,
                44.5,
                TipoSangre.A,
                '+');

        paciente p2 = new paciente(2,
                "darwin",
                "lesmes",
                TipoDocumento.CC,
                51422,
                "dl2@gmail.com",
                318812,
                LocalDate.of(2004, Month.JUNE, 12),
                1.53,
                45.5,
                TipoSangre.AB,
                '-');

        paciente p3 = new paciente(21,
                "jeisson",
                "rojas",
                TipoDocumento.CC,
                72612,
                "jr@gmail.com",
                3112313,
                LocalDate.of(2005, Month.JANUARY, 10),
                1.63,
                54.5,
                TipoSangre.A,
                '+');

        paciente p4 = new paciente(21,
                "miguel",
                "ortiz",
                TipoDocumento.CC,
                543211,
                "mo2@gmail.com",
                3221253,
                LocalDate.of(2003, Month.NOVEMBER, 17),
                1.73,
                51.2,
                TipoSangre.AB,
                '+');

        paciente p5 = new paciente(21,
                "oscar",
                "torres",
                TipoDocumento.CC,
                41123,
                "ot2@gmail.com",
                3875423,
                LocalDate.of(2004, Month.DECEMBER, 19),
                1.53,
                49.5,
                TipoSangre.A,
                '-');


        Enfermero e1 = new Enfermero(
                23,
                "miguel",
                "villamil",
                TipoDocumento.CC,
                133111);

        Enfermero e2 = new Enfermero(
                23,
                "Jerson",
                "Muñoz",
                TipoDocumento.CC,
                13243);

        Enfermero e3 = new Enfermero(
                23,
                "angel",
                "alarcon",
                TipoDocumento.CC,
                14123);

        Consultorio c1 = new Consultorio(1,
        "cll132c N21",
        12);

        CitaMedico cm1 = new CitaMedico(1,
        LocalDateTime.of(2005, Month.JANUARY, 10, 13, 32, 21), 
        p1, 
        "Gripe",
        m1);
        

        System.out.println("Fecha: " + cm1.getFecha() 
        + "Consultorio: " 
        + c1.getNumero() 
        + "Nombre medico: " 
        + m1.getNombres()
        + "Apellido medico: "
        + m1.getApellidos()
        + "Nombre Paciente: "
        + p1.getNombres()
        + "Apellido paciente: "
        + p1.getApellidos());

        System.out.println("Estado al inicio: " + cm1.getEstadoCita());
        System.out.println(cm1);
        cm1.cancelarCita();
        System.out.println("Estado despues: " + cm1.getEstadoCita());

        CitaMedico cm2 = new CitaMedico(2,
        LocalDateTime.of(2024, Month.APRIL, 10, 14, 22, 41), 
        p1, 
        "Escopolamina",
        m1);        

        System.out.println("Fecha: " + cm2.getFecha() 
        + "Consultorio: " 
        + c1.getNumero() 
        + "Nombre medico: " 
        + m2.getNombres()
        + "Apellido medico: "
        + m2.getApellidos()
        + "Nombre Paciente: "
        + p2.getNombres()
        + "Apellido paciente: "
        + p2.getApellidos());

        CitaEnfermero ce1 = new CitaEnfermero(1,
        LocalDateTime.of(2024, Month.APRIL, 13, 16, 32, 41),
        p4,
        ProcedimientosEnfermeria.vacunacion,
        p5,
        e3);

        System.out.println("Fecha: " + ce1.getFecha() 
        + " Consultorio: " + c1.getNumero() 
        + " Nombre enfermero: " + e1.getNombres()
        + " Apellido enfermero " + e1.getApellidos()
        + " Nombre paciente " + p1.getNombres()
        + " Apellido paciente " + p1.getApellidos());

        CitaEnfermero ce2 = new CitaEnfermero(2,
        LocalDateTime.of(2024, Month.MAY, 23, 01, 25, 51),
        p4,
        ProcedimientosEnfermeria.vacunacion,
        p5,
        e3);

        System.out.println("Fecha: " + ce2.getFecha() 
        + "Consultorio: " + c1.getNumero() 
        + "Nombre enfermero: " + e1.getNombres()
        + "Apellido enfermero " + e1.getApellidos()
        + "Nombre paciente " + p2.getNombres()
        + "Apellido paciente " + p2.getApellidos());
    }



        

}