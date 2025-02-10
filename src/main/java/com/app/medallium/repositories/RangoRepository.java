package com.app.medallium.repositories;

import com.app.medallium.models.Rango;
import com.app.medallium.models.Tribus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RangoRepository  extends JpaRepository<Rango, Long> {
    Optional<Rango> findByName(String name);
}
