package com.app.medallium.controllers;

import com.app.medallium.models.Favoritos;
import com.app.medallium.services.FavoritosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/favoritos")
public class FavoritosController {
    @Autowired
    private FavoritosService favoritosService;

    @PostMapping("/add")
    public Favoritos addFavorito(@RequestParam Long userId, @RequestParam Long yokaiId) {
        return favoritosService.addFavorito(userId, yokaiId);
    }

    @GetMapping("/all")
    public List<Favoritos> getAllFavoritos() {
        return favoritosService.getAllFavoritos();
    }

    @GetMapping("/user/{userId}")
    public List<Favoritos> getFavoritosByUserId(@PathVariable Long userId) {
        return favoritosService.getFavoritosByUserId(userId);
    }

    @DeleteMapping("/delete")
    public void deleteFavorito(@RequestParam Long userId, @RequestParam Long yokaiId) {
        favoritosService.deleteFavorito(userId, yokaiId);
    }

}

