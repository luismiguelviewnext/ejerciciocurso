package com.ejerciciocurso.model;

public class Curso {

    private int codigo;
    private String nombre;
    private int duracion;
    private int precio;


    public Curso() {
        super();
    }
    
    public Curso(int id, String nombre, int duracion, int precio) {
        this.codigo = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
    }


    public void setId(int id) {
        this.codigo = id;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }


    public void setPrecio(int precio) {
        this.precio = precio;
    }


    public int getId() {
        return codigo;
    }


    public String getNombre() {
        return nombre;
    }


    public int getDuracion() {
        return duracion;
    }


    public int getPrecio() {
        return precio;
    }
    
    
}
