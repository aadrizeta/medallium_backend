package com.app.medallium.repositories;

import com.app.medallium.models.YokaisObtenidos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface YokaisObtenidosRepository extends JpaRepository<YokaisObtenidos, Long> {
    @Query("SELECT o FROM YokaisObtenidos o WHERE o.id_usuario = :userId")
    List<YokaisObtenidos> findByUserId(@Param("userId") Long userId);

    @Query("SELECT o FROM YokaisObtenidos o WHERE o.id_usuario = :userId AND o.detallesYokai.id_detallesYokai = :yokaiId")
    YokaisObtenidos findByUserIdAndYokaiId(@Param("userId") Long userId, @Param("yokaiId") Long yokaiId);
}
