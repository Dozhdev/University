package me.dozhdev.university.personas.tipo.trabajadores;

import me.dozhdev.university.enums.Genero;
import me.dozhdev.university.enums.Identificacion;
import me.dozhdev.university.personas.Persona;

public class Profesor extends Persona {
    public Profesor(String nombre, String apellido, int edad, Identificacion tipo, int id, double peso, double altura, Genero genero, String correo) {
        super(nombre, apellido, edad, tipo, id, peso, altura, genero, correo);
    }
}
