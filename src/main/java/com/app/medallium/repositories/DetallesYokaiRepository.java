package com.app.medallium.repositories;

import com.app.medallium.models.DetallesYokai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetallesYokaiRepository  extends JpaRepository<DetallesYokai, Long> {
}
