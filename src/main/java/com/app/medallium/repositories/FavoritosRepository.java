package com.app.medallium.repositories;

import com.app.medallium.models.Favoritos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavoritosRepository extends JpaRepository<Favoritos, Long> {
    @Query("SELECT f FROM Favoritos f WHERE f.id_User = :userId")
    List<Favoritos> findByUserId(@Param("userId") Long userId);
}
