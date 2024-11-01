package com.catalogo.catalogo_Service.repository;

import com.catalogo.catalogo_Service.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CatalogoRepository extends JpaRepository<Libro, Long> {

    List<Libro> findByGenero(String genero);
    List<Libro> findByNombre(String nombre);
    List<Libro> findByAutor(String autor);

}
