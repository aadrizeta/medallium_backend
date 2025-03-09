package com.app.medallium.services;

import com.app.medallium.models.DetallesYokai;
import com.app.medallium.models.Yokais;
import com.app.medallium.repositories.DetallesYokaiRepository;
import com.app.medallium.repositories.YokaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetallesYokaiService {
    @Autowired
    private DetallesYokaiRepository detallesYokaiRepository;

    @Autowired
    private YokaisRepository yokaisRepository;

    public Optional<DetallesYokai> getDetallesYokaiByName(String name) {
        Optional<Yokais> yokaiOptional = yokaisRepository.findByName(name);
        if (yokaiOptional.isPresent()) {
            long idYokai = yokaiOptional.get().getId_Yokai();
            return detallesYokaiRepository.findByYokaiId(idYokai);
        }
        return Optional.empty();
    }

    public List<DetallesYokai> getAllYokais() {
        return detallesYokaiRepository.findAll();
    }

    public List<DetallesYokai> getDetallesByTribu(Long idTribu) {
        return detallesYokaiRepository.findByTribu(idTribu);
    }

    public List<DetallesYokai> getDetallesByRango(Long idRango) {
        return detallesYokaiRepository.findByRango(idRango);
    }

    public List<DetallesYokai> getDetallesByElemento(Long idElemento) {
        return detallesYokaiRepository.findByElemento(idElemento);
    }
}
