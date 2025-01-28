package com.app.medallium.repositories;

import com.app.medallium.models.Tribus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TribusRepository  extends JpaRepository<Tribus, Long> {
}
