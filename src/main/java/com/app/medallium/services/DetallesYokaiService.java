package com.app.medallium.services;

import com.app.medallium.models.DetallesYokai;
import com.app.medallium.models.Yokais;
import com.app.medallium.repositories.DetallesYokaiRepository;
import com.app.medallium.repositories.YokaisRepository;
import com.app.medallium.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DetallesYokaiService {
    @Autowired
    private DetallesYokaiRepository detallesYokaiRepository;

    @Autowired
    private YokaisRepository yokaisRepository;

    @Autowired
    private JwtUtil jwtUtil;

    public Optional<DetallesYokai> getDetallesYokaiByName(String name) {
        Optional<Yokais> yokaiOptional = yokaisRepository.findByName(name);
        if (yokaiOptional.isPresent()) {
            long idYokai = yokaiOptional.get().getId_Yokai();
            return detallesYokaiRepository.findByYokaiId(idYokai);
        }
        return Optional.empty();
    }
}
