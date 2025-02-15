package com.app.medallium.services;

import com.app.medallium.models.Yokais;
import com.app.medallium.repositories.YokaisRepository;
import com.app.medallium.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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



}
