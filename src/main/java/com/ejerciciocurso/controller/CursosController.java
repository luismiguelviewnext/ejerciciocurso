package com.ejerciciocurso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejerciciocurso.model.Curso;
import com.ejerciciocurso.service.CursoService;


/**
 * Clase controladora que expone servicios REST para el manejo de Cursos.
 */
@RestController
public class CursosController {

    @Autowired
    private CursoService cursoService;
/**
     * Crea un nuevo curso y retorna la lista de todos los cursos.
     *
     * @param curso Objeto de tipo Curso que representa el curso a agregar.
     * @return ResponseEntity con el estado HTTP y la lista de cursos después de agregar el nuevo curso.
     */
    //localhost:8080/cursos
    @PostMapping(value="cursos", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Curso>> altaCurso(@RequestBody Curso curso) {
        List<Curso> cursos = cursoService.altaCursos(curso);
        return new ResponseEntity<>(cursos, HttpStatus.CREATED);
    }
     /**
     * Elimina un curso basado en el código proporcionado y retorna la lista de cursos restantes.
     *
     * @param codigo Identificador único del curso a eliminar.
     * @return ResponseEntity con el estado HTTP y la lista de cursos después de eliminar el curso, o NOT_FOUND si el curso no existe.
     */
    //localhost:8080/cursos/{codigo}
    @DeleteMapping("/cursos/{codigo}")
    public ResponseEntity<List<Curso>> eliminaCurso(@PathVariable int codigo) {
        List<Curso> cursos = cursoService.eliminaCurso(codigo);
        if (cursos != null) {
            return new ResponseEntity<>(cursos, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    /**
     * Busca un curso por su código.
     *
     * @param codigo Identificador único del curso a buscar.
     * @return ResponseEntity con el estado HTTP y el curso encontrado, o NOT_FOUND si el curso no existe.
     */
    //localhost:8080/cursos/{codigo}
    @GetMapping("cursos/{codigo}")
    public ResponseEntity<Curso> buscaCurso(@PathVariable int codigo) {
        Curso curso = cursoService.buscaCurso(codigo);
        if (curso != null) {
            return new ResponseEntity<>(curso, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
     /**
     * Actualiza la información de un curso existente.
     *
     * @param curso Objeto de tipo Curso que contiene la información actualizada del curso.
     * @return ResponseEntity con el estado HTTP OK si la actualización fue exitosa, o NOT_FOUND si ocurrió un error o el curso no existe.
     */
    //localhost:8080/cursos
    @PutMapping(value = "cursos", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> actualizaCurso(@RequestBody Curso curso) {
        try {
            cursoService.actualizaCurso(curso);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
