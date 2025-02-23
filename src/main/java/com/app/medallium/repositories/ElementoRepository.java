package com.app.medallium.repositories;

import com.app.medallium.models.Elemento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ElementoRepository extends JpaRepository<Elemento, Long> {
    @Query("SELECT e FROM Elemento e WHERE e.a_name = :aName")
    Optional<Elemento> findByNombre(@Param("aName") String aName);

    // Ajustar la consulta para buscar por ID del Yokai
   // @Query("SELECT e FROM Elemento e JOIN Yokais y ON e.id_Elemento = y.id_Elemento WHERE y.id_Yokai = :yokaiId")
  //  Optional<Elemento> findByYokaiId(@Param("yokaiId") Long yokaiId);
}
