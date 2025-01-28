package com.app.medallium.repositories;

import com.app.medallium.models.Rango;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RangoRepository  extends JpaRepository<Rango, Long> {
}
