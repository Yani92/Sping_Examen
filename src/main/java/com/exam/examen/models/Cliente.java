/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.examen.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Yani
 */
@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    private String cedula;

    @JoinColumn(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "cliente")
    @JsonManagedReference
    private List<Factura> facturas;

    public Cliente() {
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }

}
