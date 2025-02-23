package com.app.medallium.services;

import com.app.medallium.models.Rango;
import com.app.medallium.models.Yokais;
import com.app.medallium.repositories.RangoRepository;
import com.app.medallium.repositories.YokaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RangoService {
    @Autowired
    private RangoRepository rangoRepository;

    @Autowired
    private YokaisRepository yokaisRepository;

    public Optional<Rango> getRangoByNombre(String name) {
        Optional<Rango> rangoOptional = rangoRepository.findByName(name);
        return rangoOptional;
    }

    public Optional<Rango> getRangoByYokaiName(String yokaiName) {
        Optional<Yokais> yokaiOptional = yokaisRepository.findByName(yokaiName);
        if (yokaiOptional.isPresent()) {
            return Optional.ofNullable(yokaiOptional.get().getRango());
        }
        return Optional.empty();
    }

    public List<Rango> getAllRangos() {
        return rangoRepository.findAll();
    }
}
