package com.app.medallium.repositories;

import com.app.medallium.models.Fase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaseRepository  extends JpaRepository<Fase, Long> {
}
