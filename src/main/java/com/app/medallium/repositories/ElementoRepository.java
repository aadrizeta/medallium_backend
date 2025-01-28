package com.app.medallium.repositories;

import com.app.medallium.models.Elemento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementoRepository  extends JpaRepository<Elemento, Long> {

}
