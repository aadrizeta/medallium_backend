package com.app.medallium.services;

import com.app.medallium.models.DetallesYokai;
import com.app.medallium.models.Favoritos;
import com.app.medallium.repositories.DetallesYokaiRepository;
import com.app.medallium.repositories.FavoritosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoritosService {
    @Autowired
    private FavoritosRepository favoritosRepository;

    @Autowired
    private DetallesYokaiRepository detallesYokaiRepository;

    public Favoritos addFavorito(Long userId, Long yokaiId) {
        DetallesYokai detallesYokai = detallesYokaiRepository.findById(yokaiId).orElse(null);
        if (detallesYokai != null) {
            Favoritos favorito = new Favoritos();
            favorito.setId_User(userId);
            favorito.setDetallesYokai(detallesYokai);
            return favoritosRepository.save(favorito);
        }
        return null;
    }

    public List<Favoritos> getAllFavoritos() {
        return favoritosRepository.findAll();
    }

    public List<Favoritos> getFavoritosByUserId(Long userId) {
        return favoritosRepository.findByUserId(userId);
    }

    public void deleteFavorito(Long userId, Long yokaiId) {
        DetallesYokai detallesYokai = detallesYokaiRepository.findById(yokaiId).orElse(null);
        if (detallesYokai != null) {
            Favoritos favorito = favoritosRepository.findByUserIdAndYokaiId(userId, detallesYokai.getId_detallesYokai());
            if (favorito != null) {
                favoritosRepository.delete(favorito);
            }
        }
    }
}
