package me.dozhdev.university.personas.tipo;

import me.dozhdev.university.enums.Carrera;
import me.dozhdev.university.enums.Genero;
import me.dozhdev.university.enums.Identificacion;
import me.dozhdev.university.enums.Semestre;
import me.dozhdev.university.personas.Persona;

import java.time.LocalDate;

public class Estudiante extends Persona {

    private Semestre semestre;
    private Carrera carrera;
    private LocalDate fecha_ingreso;

    public Estudiante(String nombre, String apellido, int edad, Identificacion tipo, int id, double peso, double altura, Genero genero, String correo) {
        super(nombre, apellido, edad, tipo, id, peso, altura, genero, correo);
    }
}
