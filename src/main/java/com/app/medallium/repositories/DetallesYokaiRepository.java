package com.app.medallium.repositories;

import com.app.medallium.models.DetallesYokai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DetallesYokaiRepository extends JpaRepository<DetallesYokai, Long> {
    @Query("SELECT d FROM DetallesYokai d WHERE d.yokai.id_Yokai = :yokaiId")
    Optional<DetallesYokai> findByYokaiId(@Param("yokaiId") Long yokaiId);

    @Query("SELECT d FROM DetallesYokai d WHERE d.yokai.tribu.id_Tribu = :idTribu")
    List<DetallesYokai> findByTribu(@Param("idTribu") Long idTribu);

    @Query("SELECT d FROM DetallesYokai d WHERE d.yokai.rango.id_Rango = :idRango")
    List<DetallesYokai> findByRango(@Param("idRango") Long idRango);

    @Query("SELECT d FROM DetallesYokai d WHERE d.yokai.elemento.id_Elemento = :idElemento")
    List<DetallesYokai> findByElemento(@Param("idElemento") Long idElemento);
}
