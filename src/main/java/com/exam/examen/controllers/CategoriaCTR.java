package com.exam.examen.controllers;


import com.exam.examen.models.Categoria;
import com.exam.examen.repositorys.CategoriaRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class CategoriaCTR {


    private final CategoriaRep categoriaRep;

    @Autowired
    public CategoriaCTR(CategoriaRep categoriaRep) {
        this.categoriaRep = categoriaRep;
    }

    @GetMapping("/categorias")
    public List<Categoria> getAllCategorias() {
        return this.categoriaRep.findAll();
    }

    @PostMapping("/categorias")
    public Categoria saveCategoria(@RequestBody Categoria categoria) {
        return this.categoriaRep.save(categoria);
    }

    @GetMapping("/categorias/{nombre}")
    public List<Categoria> findCategoriasByName(@PathVariable String nombre) {
        return this.categoriaRep.findByName(nombre);
    }


    @DeleteMapping("/categorias/{id}")
    public void deleteCategoriaById(@PathVariable Long id) {

        Categoria categoria = this.categoriaRep.findById(id).orElse(null);
        this.categoriaRep.delete(categoria);
    }

}
