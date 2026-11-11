# 📚 Librería — API de libros y reseñas

API REST para consultar un catálogo de libros y gestionar las reseñas de los usuarios, construida a partir de historias de usuario.

![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5-6DB33F?logo=springboot&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-47A248?logo=mongodb&logoColor=white)

## Funcionalidades

- Búsqueda y consulta de libros.
- Creación y consulta de reseñas por libro.

## Tecnologías

Java 21 · Spring Boot 3.5 (Web, Data MongoDB) · Lombok · Gradle

## Estructura

```
src/main/java/co/edu/uniquindio/proyecto/software/demo
├── controller/   # BookController, ReviewController
├── dto/
├── model/        # Book, Review
├── repository/
└── service/
```

## Cómo ejecutarlo

**Requisitos:** JDK 21 y MongoDB en `localhost:27017`.

```bash
./gradlew bootRun
```

---

Desarrollado por **[Milton Gómez](https://github.com/MiltonGomez775)** — Universidad del Quindío
