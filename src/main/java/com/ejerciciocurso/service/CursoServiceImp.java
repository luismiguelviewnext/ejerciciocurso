package com.ejerciciocurso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ejerciciocurso.model.Curso;

@Service
public class CursoServiceImp implements CursoService{

    List <Curso> cursos;

    public CursoServiceImp() {
        
        cursos = new ArrayList<>();

        cursos.add(new Curso(1, "Java", 100, 500));
        cursos.add(new Curso(2, "Python", 200, 1000));
        cursos.add(new Curso(3, "C#", 300, 2000));
        cursos.add(new Curso(4, "C++", 400, 3000));
        cursos.add(new Curso(5, "JavaScript", 500, 4000));
        cursos.add(new Curso(6, "PHP", 600, 5000));
        cursos.add(new Curso(7, "Ruby", 700, 6000));
        cursos.add(new Curso(8, "Swift", 800, 7000));
        cursos.add(new Curso(9, "Go", 900, 8000));

    }

  
   @Override
    public List<Curso> altaCursos(Curso curso) {
        cursos.removeIf(c -> c.getId() == curso.getId());
        cursos.add(curso);
        return new ArrayList<>(cursos); // Devolvemos una copia de la lista.

    }


    @Override
    public List<Curso> eliminaCurso(int codigo) {
        cursos.removeIf(c -> c.getId() == codigo);
        return new ArrayList<>(cursos); // Devolvemos una copia de la lista
    }

    @Override
    public Curso buscaCurso(int codigo) {
       for(Curso curso: cursos){
        if(curso.getId() == codigo){
            return curso; // Devolvemos el curso encontrado.
        }
       }
       return null; // Devolvemos null si no se encuentra.
    }

    @Override
    public void actualizaCurso(Curso curso) {
        for(int i = 0; i < cursos.size(); i++){
            if(cursos.get(i).getId() == curso.getId()){
                cursos.set(i, curso); //Actualizamos el curso en la posición encontrada
            }
        }
        throw new IllegalArgumentException("Curso con id " + curso.getId() + " no encontrado."); //Si no se encuentra, lanzamos una excepción
    }



 



    


}
