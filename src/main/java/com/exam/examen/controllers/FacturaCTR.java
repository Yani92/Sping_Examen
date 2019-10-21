/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.examen.controllers;

import com.exam.examen.models.Factura;
import com.exam.examen.repositorys.FacturaRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author MrRainx
 */
@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class FacturaCTR {

    @Autowired
    private FacturaRep facturaRep;

    @GetMapping("/facturas")
    public List<Factura> getAllBills() {
        return this.facturaRep.findAll();
    }


    @PostMapping("/facturas")
    public Factura createBill(@RequestBody Factura factura) {
        return this.facturaRep.save(factura);
    }

}
