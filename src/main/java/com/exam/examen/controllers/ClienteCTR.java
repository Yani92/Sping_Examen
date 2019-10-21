/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.examen.controllers;


import com.exam.examen.models.Cliente;
import com.exam.examen.repositorys.ClienteRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author MrRainx
 */
@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class ClienteCTR {

    private final ClienteRep clienteRep;

    @Autowired
    public ClienteCTR(ClienteRep clienteRep) {
        this.clienteRep = clienteRep;
    }


    @GetMapping("/clientes")
    public List<Cliente> getAllClients() {
        return this.clienteRep.findAll();
    }

    @PostMapping("/cliente")
    public Cliente createClient(@RequestBody Cliente cliente) {
        return this.clienteRep.save(cliente);
    }

}
