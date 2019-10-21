/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.examen.controllers;

import com.exam.examen.models.Producto;
import com.exam.examen.repositorys.ProductoRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Yani
 */
@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class ProductoCTR {

    @Autowired
    private ProductoRep productoRep;

    
    @GetMapping("/productos")
    public List<Producto> getAllProducts() {
        return this.productoRep.findAll();
    }

    @GetMapping("/productos/{id}")
    public Producto getAllProductoBy(@PathVariable Long id) {
        return this.productoRep.findById(id).orElse(null);
    }

    @PostMapping("/productos")
    public Producto createProduct(@RequestBody Producto producto) {
        return this.productoRep.save(producto);
    }

    @DeleteMapping("/productos/{id}")
    public void deleteProducto(@PathVariable Long id) {
        Producto producto = this.productoRep.findById(id).orElse(null);
        this.productoRep.delete(producto);
    }


}
