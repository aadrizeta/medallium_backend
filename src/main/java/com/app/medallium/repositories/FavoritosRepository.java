package com.app.medallium.repositories;

import com.app.medallium.models.Favoritos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoritosRepository  extends JpaRepository<Favoritos, Long> {
}
