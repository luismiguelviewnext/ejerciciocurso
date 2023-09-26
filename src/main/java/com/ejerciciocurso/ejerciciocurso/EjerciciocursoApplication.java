package com.ejerciciocurso.ejerciciocurso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal que sirve como punto de entrada para la aplicación de Spring Boot.
 * Inicia la aplicación y realiza el escaneo de componentes en los paquetes especificados.
 */
@SpringBootApplication (scanBasePackages = {"com.ejerciciocurso.controller ", "com.ejerciciocurso.service"})
public class EjerciciocursoApplication{

	  /**
     * Método principal que sirve como punto de entrada para la aplicación.
     * 
     * @param args Argumentos de línea de comando.
     */
	public static void main(String[] args) {
		SpringApplication.run(EjerciciocursoApplication.class, args);
	}

}
