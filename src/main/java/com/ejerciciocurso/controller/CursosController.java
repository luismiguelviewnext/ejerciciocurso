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

@RestController
public class CursosController {

    @Autowired
    private CursoService cursoService;

    //localhost:8080/cursos
    @PostMapping(value="cursos", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Curso>> altaCurso(@RequestBody Curso curso) {
        List<Curso> cursos = cursoService.altaCursos(curso);
        return new ResponseEntity<>(cursos, HttpStatus.CREATED);
    }
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
