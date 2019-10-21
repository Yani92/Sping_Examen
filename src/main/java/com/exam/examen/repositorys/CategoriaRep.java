package com.exam.examen.repositorys;

import com.exam.examen.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRep extends JpaRepository<Categoria, Long> {


    @Query(value = "Select c from Categoria c where c.nombre like %:nombre%")
    List<Categoria> findByName(@Param("nombre") String nombre);


}
