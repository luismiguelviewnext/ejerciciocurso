# Proyecto CRUD de Cursos

Este proyecto es un sistema de gestión CRUD básico para un sistema de gestión de cursos. Permite listar, crear, actualizar y eliminar cursos en el sistema.

## Tecnologías Utilizadas
- Java
- Spring Boot
- Spring Web
- ArrayList como almacenamiento en memoria

## Configuración
### Puertos y Endpoints
La aplicación corre en el puerto `8080` por defecto. Los endpoints disponibles son:
- **POST `/cursos`**: Para crear un nuevo curso.
- **PUT `/cursos`**: Para actualizar un curso existente.
- **GET `/cursos/{codigo}`**: Para buscar un curso específico.
- **DELETE `/cursos/{codigo}`**: Para eliminar un curso.

## Cómo Empezar
Para correr el proyecto localmente, sigue los pasos descritos a continuación:

### Requisitos
- Java 8 o superior
- Maven

### Pasos
1. Clona el repositorio a tu máquina local con `git clone [URL del repositorio]`.
2. Navega hasta el directorio del proyecto con `cd [Nombre del Directorio del Proyecto]`.
3. Ejecuta el comando `mvn spring-boot:run` para arrancar la aplicación.
4. Abre tu navegador web y visita `http://localhost:8080` para acceder a la aplicación.

## Ejemplos de Uso
A continuación se describen algunos ejemplos de uso básico de la aplicación:

### Listar Cursos
Para ver un curso específico, abre tu navegador y dirígete a:
```http
http://localhost:8080/cursos/{codigo}

