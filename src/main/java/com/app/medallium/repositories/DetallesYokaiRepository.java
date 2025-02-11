package com.app.medallium.repositories;

import com.app.medallium.models.DetallesYokai;
import com.app.medallium.models.Elemento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DetallesYokaiRepository  extends JpaRepository<DetallesYokai, Long> {
    Optional<DetallesYokai> findByNombre(String nombre);
}
