package com.catalogo.catalogo_Service.controllers;


import com.catalogo.catalogo_Service.entity.Libro;
import com.catalogo.catalogo_Service.service.CatalogoService;
import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/libros")
@AllArgsConstructor
public class CatalogoController {

    @Autowired
    private final CatalogoService catalogoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Libro postLibro(@RequestBody Libro libro){
        return catalogoService.postLibro(libro);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Libro> getAllLibros(){
        return catalogoService.getAllLibros();
    }

    @GetMapping("/autor/{autor}")
    @ResponseStatus(HttpStatus.OK)
    public List<Libro> getByAutor(@PathVariable String autor){
        return catalogoService.getByAutor(autor);
    }

    @GetMapping("/nombre/{nombre}")
    @ResponseStatus(HttpStatus.OK)
    public List<Libro> getByNombre(@PathVariable String nombre){
        return catalogoService.getByNombre(nombre);
    }


    @GetMapping("/genero/{genero}")
    @ResponseStatus(HttpStatus.OK)
    public List<Libro> getByGenero(@PathVariable String genero){
        return catalogoService.getByGenero(genero);
    }
}
