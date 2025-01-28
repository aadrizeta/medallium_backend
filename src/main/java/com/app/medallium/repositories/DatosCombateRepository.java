package com.app.medallium.repositories;

import com.app.medallium.models.DatosCombate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DatosCombateRepository  extends JpaRepository<DatosCombate, Long> {
}
