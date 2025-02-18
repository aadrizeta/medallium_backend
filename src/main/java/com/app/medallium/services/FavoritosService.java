package com.app.medallium.services;

import com.app.medallium.models.Favoritos;
import com.app.medallium.repositories.FavoritosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoritosService {
    @Autowired
    private FavoritosRepository favoritosRepository;

    public Favoritos addFavorito(Long userId, Long yokaiId) {
        Favoritos favorito = new Favoritos();
        favorito.setId_User(userId);
        favorito.setId_Yokai(yokaiId);
        return favoritosRepository.save(favorito);
    }

    public List<Favoritos> getAllFavoritos() {
        return favoritosRepository.findAll();
    }

    public List<Favoritos> getFavoritosByUserId(Long userId) {
        return favoritosRepository.findByUserId(userId);
    }
}
