package me.dozhdev.university.personas;

import me.dozhdev.university.enums.Genero;
import me.dozhdev.university.enums.Identificacion;

public abstract class Persona {

    private String nombre, apellido, correo;
    private int edad, id;
    private double peso, altura;
    private Genero genero;
    private Identificacion tipo;

    public Persona(String nombre, String apellido, int edad, Identificacion tipo, int id, double peso, double altura, Genero genero, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tipo = tipo;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
        this.genero = genero;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Identificacion getTipo() {
        return tipo;
    }

    public void setTipo(Identificacion tipo) {
        this.tipo = tipo;
    }
}
