package com.app.medallium.repositories;

import com.app.medallium.models.Yokais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import java.util.Optional;

@Repository
public interface YokaisRepository extends JpaRepository<Yokais, Long> {
    //Optional<Yokais> findByNameYokai(String nombre);

}
