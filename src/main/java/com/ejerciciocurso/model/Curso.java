package com.ejerciciocurso.model;

/**
 * Clase que representa el modelo de un Curso.
 * Contiene atributos para el código, nombre, duración y precio de un curso.
 */
public class Curso {

    private int codigo;
    private String nombre;
    private int duracion;
    private int precio;

    /**
     * Constructor por defecto de la clase Curso.
     */
    public Curso() {
        super();
    }
    
     /**
     * Constructor parametrizado de la clase Curso.
     *
     * @param codigo   Identificador único del curso.
     * @param nombre   Nombre del curso.
     * @param duracion Duración del curso.
     * @param precio   Precio del curso.
     */
    public Curso(int id, String nombre, int duracion, int precio) {
        this.codigo = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
    }

    /**
     * Establece el código del curso.
     *
     * @param codigo Identificador único del curso.
     */
    public void setId(int id) {
        this.codigo = id;
    }

    /**
     * Establece el nombre del curso.
     *
     * @param nombre Nombre del curso.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece la duración del curso.
     *
     * @param duracion Duración del curso.
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

     /**
     * Establece el precio del curso.
     *
     * @param precio Precio del curso.
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

     /**
     * @return Devuelve el código del curso.
     */
    public int getId() {
        return codigo;
    }

     /**
     * @return Devuelve el nombre del curso.
     */
    public String getNombre() {
        return nombre;
    }

     /**
     * @return Devuelve la duración del curso.
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * @return Devuelve el precio del curso.
     */
    public int getPrecio() {
        return precio;
    }
    
    
}
