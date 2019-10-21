/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.examen.repositorys;

import com.exam.examen.models.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Yani
 */
@Repository
public interface EmpleadoRep extends JpaRepository<Empleado, String> {


    @Query(value = "Select e from Empleado e where e.nombre like %:nombre%")
    List<Empleado> findByName(@Param("nombre") String nombre);

}
