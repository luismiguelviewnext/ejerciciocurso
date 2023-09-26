package com.ejerciciocurso.service;

import java.util.List;

import com.ejerciciocurso.model.Curso;

public interface CursoService {

    List<Curso> altaCursos(Curso curso);

    List<Curso> eliminaCurso(int codigo);

    Curso buscaCurso(int codigo);

    void actualizaCurso(Curso curso);
    
}
