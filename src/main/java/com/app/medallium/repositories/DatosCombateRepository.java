package com.app.medallium.repositories;

import com.app.medallium.models.DatosCombate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface DatosCombateRepository  extends JpaRepository<DatosCombate, Long> {
    @Query("SELECT d FROM DatosCombate d WHERE d.yokai.id_Yokai = :yokaiId")
    Optional<DatosCombate> findByDatosYokaiId(@Param("yokaiId") Long yokaiId);
}
