package com.citas.java;

import java.time.LocalDate;
import java.time.Month;

import com.citas.java.entidades.Enfermero;
import com.citas.java.entidades.Medico;
import com.citas.java.entidades.paciente;
import com.citas.java.enumeraciones.Especialidad;
import com.citas.java.enumeraciones.TipoDocumento;
import com.citas.java.enumeraciones.TipoSangre;

public class Main {
    public static void main(String[] args) {
        // CREAR MEDICO
        // CREAR UN OBJETO MEDICO
        // CREAR UNA INSTANCIA DE MEDICO
        Medico m = new Medico(
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


        System.out.println(m.toString());

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

        System.out.println(p.toString());

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

        System.out.println("nombre: " + e.getNombres());

    }

}
