package com.app.medallium.repositories;

import com.app.medallium.models.Tribus;
import com.app.medallium.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TribusRepository  extends JpaRepository<Tribus, Long> {
    Optional<Tribus> findByNombre(String nombre);
}
