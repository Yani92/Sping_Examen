/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.examen.repositorys;

import com.exam.examen.models.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author MrRainx
 */
@Repository
public interface FacturaRep extends JpaRepository<Factura, Long> {
    
}