/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.examen.repositorys;

import com.exam.examen.models.DetalleFactura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Yani
 */
@Repository
public interface DetalleFacturaRep extends JpaRepository<DetalleFactura, Long>{
    
}
