package com.app.medallium.services;

import com.app.medallium.models.DetallesYokai;
import com.app.medallium.models.YokaisObtenidos;
import com.app.medallium.repositories.YokaisObtenidosRepository;
import com.app.medallium.repositories.DetallesYokaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObtenidosService {
    @Autowired
    private YokaisObtenidosRepository yokaisObtenidosRepository;

    @Autowired
    private DetallesYokaiRepository detallesYokaiRepository;

    public YokaisObtenidos addObtenido(Long userId, Long yokaiId) {
        DetallesYokai detallesYokai = detallesYokaiRepository.findById(yokaiId).orElse(null);
        if (detallesYokai != null) {
            YokaisObtenidos obtenido = new YokaisObtenidos();
            obtenido.setId_usuario(userId);
            obtenido.setDetallesYokai(detallesYokai);
            return yokaisObtenidosRepository.save(obtenido);
        }
        return null;
    }

    public List<YokaisObtenidos> getAllObtenidos() {
        return yokaisObtenidosRepository.findAll();
    }

    public List<YokaisObtenidos> getObtenidosByUserId(Long userId) {
        return yokaisObtenidosRepository.findByUserId(userId);
    }

    public void deleteObtenido(Long userId, Long yokaiId) {
        DetallesYokai detallesYokai = detallesYokaiRepository.findById(yokaiId).orElse(null);
        if (detallesYokai != null) {
            YokaisObtenidos obtenido = yokaisObtenidosRepository.findByUserIdAndYokaiId(userId, detallesYokai.getId_detallesYokai());
            if (obtenido != null) {
                yokaisObtenidosRepository.delete(obtenido);
            }
        }
    }
}
