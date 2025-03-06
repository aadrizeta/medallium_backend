package com.app.medallium.repositories;

import com.app.medallium.models.Yokais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface YokaisRepository extends JpaRepository<Yokais, Long> {
    Optional<Yokais> findByName(String name);

    @Query("SELECT y FROM Yokais y WHERE y.tribu.id_Tribu = :idTribu")
    List<Yokais> findByTribu(@Param("idTribu") Long idTribu);

    @Query("SELECT y FROM Yokais y WHERE y.elemento.id_Elemento = :idElemento")
    List<Yokais> findByElemento(@Param("idElemento") Long idElemento);

    @Query("SELECT y FROM Yokais y WHERE y.rango.id_Rango = :idRango")
    List<Yokais> findByRango(@Param("idRango") Long idRango);
}
