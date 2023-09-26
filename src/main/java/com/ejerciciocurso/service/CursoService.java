package com.ejerciciocurso.service;

import java.util.List;

import com.ejerciciocurso.model.Curso;

/**
 * Interfaz que define los servicios para gestionar cursos.
 * Incluye operaciones de alta, eliminación, búsqueda y actualización de cursos.
 */
public interface CursoService {

    /**
     * Agrega un nuevo curso y retorna la lista actualizada de cursos.
     * 
     * @param curso Objeto Curso que se va a agregar.
     * @return Lista de cursos actualizada.
     */
    List<Curso> altaCursos(Curso curso);

    /**
     * Elimina un curso dado su código y retorna la lista actualizada de cursos.
     * 
     * @param codigo Identificador único del curso a eliminar.
     * @return Lista de cursos actualizada tras la eliminación.
     */
    List<Curso> eliminaCurso(int codigo);

    /**
     * Busca un curso dado su código.
     * 
     * @param codigo Identificador único del curso a buscar.
     * @return Objeto Curso correspondiente al código proporcionado, o null si no se encuentra.
     */
    Curso buscaCurso(int codigo);

    /**
     * Actualiza la información de un curso existente.
     * 
     * @param curso Objeto Curso con la información actualizada.
     */
    void actualizaCurso(Curso curso);
    
}
