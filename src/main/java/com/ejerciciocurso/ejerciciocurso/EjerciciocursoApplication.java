package com.ejerciciocurso.ejerciciocurso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = {"com.ejerciciocurso.controller ", "com.ejerciciocurso.service"})
public class EjerciciocursoApplication{

	public static void main(String[] args) {
		SpringApplication.run(EjerciciocursoApplication.class, args);
	}

}
