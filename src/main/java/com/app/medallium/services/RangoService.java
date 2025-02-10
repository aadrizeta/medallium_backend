package com.app.medallium.services;

import com.app.medallium.models.Rango;
import com.app.medallium.repositories.RangoRepository;
import com.app.medallium.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class RangoService {

    @Autowired
    private RangoRepository rangoRepository;

    @Autowired
    private JwtUtil jwtUtil;

    public Rango createRango(Rango rango){
        if (this.rangoRepository.findByName(rango.getNombre()).isPresent()){
            throw new RuntimeException("Elemento ya existe");
        }
        Rango newRango = new Rango();
    }
}
