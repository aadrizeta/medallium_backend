package com.app.medallium.repositories;

import com.app.medallium.models.Elemento;
import com.app.medallium.models.Tribus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ElementoRepository  extends JpaRepository<Elemento, Long> {

}
