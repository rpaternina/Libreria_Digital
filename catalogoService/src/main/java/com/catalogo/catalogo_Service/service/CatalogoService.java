package com.catalogo.catalogo_Service.service;


import com.catalogo.catalogo_Service.entity.Libro;
import com.catalogo.catalogo_Service.repository.CatalogoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
@AllArgsConstructor
public class CatalogoService {

    @Autowired
    private final CatalogoRepository catalogoRepository;


    public Libro postLibro(Libro libro){
        return catalogoRepository.save(libro);
    }

    /**
     * Obtener todos los libros
     * @return
     */
    public List<Libro> getAllLibros(){
        return catalogoRepository.findAll();
    }

    /**
     * Obtener libros por genero
     * @param genero
     * @return
     */
    public List<Libro> getByGenero(String genero){
        return catalogoRepository.findByGenero(genero);
    }

    /**
     * Obtener libro por nombre
     * @param nombre
     * @return
     */
    public List<Libro> getByNombre(String nombre){
        return catalogoRepository.findByNombre(nombre);
    }

    /**
     * Obtener por autor
     * @param autor
     * @return
     */
    public List<Libro> getByAutor(String autor){
        return catalogoRepository.findByAutor(autor);
    }

}
