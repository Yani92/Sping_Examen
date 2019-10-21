/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.examen.controllers;

import com.exam.examen.models.DetalleFactura;
import com.exam.examen.repositorys.DetalleFacturaRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author MrRainx
 */
@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class DetalleFacturaCTR {

    private final DetalleFacturaRep detalleFacturaRep;

    @Autowired
    public DetalleFacturaCTR(DetalleFacturaRep detalleFacturaRep) {
        this.detalleFacturaRep = detalleFacturaRep;
    }

    @GetMapping("/detalleFactura")
    public List<DetalleFactura> getAllDetalles() {
        return this.detalleFacturaRep.findAll();
    }

    @PostMapping("/detalleFactura")
    public DetalleFactura createDetalle(@RequestBody DetalleFactura detalleFactura) {
        return this.detalleFacturaRep.save(detalleFactura);
    }

}
