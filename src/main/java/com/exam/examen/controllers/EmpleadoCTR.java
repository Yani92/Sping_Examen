/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.examen.controllers;

import com.exam.examen.models.Empleado;
import com.exam.examen.repositorys.EmpleadoRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author MrRainx
 */
@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class EmpleadoCTR {

    private final EmpleadoRep empleadoRep;

    @Autowired
    public EmpleadoCTR(EmpleadoRep empleadoRep) {
        this.empleadoRep = empleadoRep;
    }

    @GetMapping("/empleados")
    public List<Empleado> getAllEmpleados() {
        return this.empleadoRep.findAll();
    }

    @PostMapping("/empleado")
    public Empleado createEmpleado(@RequestBody Empleado empleado) {
        return this.empleadoRep.save(empleado);
    }

    @GetMapping("/empleados/{nombre}")
    public List<Empleado> getEmpleadosByNombre(@PathVariable String nombre) {
        return this.empleadoRep.findByName(nombre);
    }
}
