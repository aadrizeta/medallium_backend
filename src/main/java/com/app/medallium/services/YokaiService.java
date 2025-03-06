package com.app.medallium.services;

import com.app.medallium.models.Yokais;
import com.app.medallium.repositories.YokaisRepository;
import com.app.medallium.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class YokaiService {
    @Autowired
    private YokaisRepository yokaisRepository;

    @Autowired
    private JwtUtil jwtUtil;

    public Optional<Yokais> getYoakiByName(String name) {
        return this.yokaisRepository.findByName(name);
    }

    public List<Yokais> findByTribu(Long idTribu) {
        return this.yokaisRepository.findByTribu(idTribu);
    }

    public List<Yokais> findByElemento(Long idElemento) {
        return this.yokaisRepository.findByElemento(idElemento);
    }

    public List<Yokais> findByRango(Long idRango) {
        return this.yokaisRepository.findByRango(idRango);
    }
}
