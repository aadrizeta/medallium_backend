package com.app.medallium.services;

import com.app.medallium.models.DatosCombate;
import com.app.medallium.models.DetallesYokai;
import com.app.medallium.models.Yokais;
import com.app.medallium.repositories.DatosCombateRepository;
import com.app.medallium.repositories.YokaisRepository;
import com.app.medallium.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DatosCombateService {
    @Autowired
    private DatosCombateRepository datosCombateRepository;

    @Autowired
    private YokaisRepository yokaisRepository;

    @Autowired
    private JwtUtil jwtUtil;

    public Optional<DatosCombate> getDetallesYokaiByName(String name) {
        Optional<Yokais> datosYokaiOptional = yokaisRepository.findByName(name);
        if (datosYokaiOptional.isPresent()) {
            long idYokai = datosYokaiOptional.get().getId_Yokai();
            return datosCombateRepository.findByDatosYokaiId(idYokai);
        }
        return Optional.empty();
    }
    public List<DatosCombate> getAllDatosCombate() {
        return this.datosCombateRepository.findAll();
    }

}

