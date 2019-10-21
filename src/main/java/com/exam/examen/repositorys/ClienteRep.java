/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.examen.repositorys;

import com.exam.examen.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author Yani
 */
@Repository
public interface ClienteRep extends JpaRepository<Cliente, String> {

    @Query(value = "Select c from Cliente c where c.nombre like %:nombre%")
    List<Cliente> selectByName(@Param("nombre") String nombre);

}
