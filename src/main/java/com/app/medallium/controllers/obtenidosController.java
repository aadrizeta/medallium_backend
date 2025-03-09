package com.app.medallium.controllers;

import com.app.medallium.models.YokaisObtenidos;
import com.app.medallium.services.ObtenidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/obtenidos")
public class obtenidosController {
    @Autowired
    private ObtenidosService obtenidosService;

    @PostMapping("/add")
    public YokaisObtenidos addObtenido(@RequestParam Long userId, @RequestParam Long yokaiId) {
        return obtenidosService.addObtenido(userId, yokaiId);
    }

    @GetMapping("/all")
    public List<YokaisObtenidos> getAllObtenidos() {
        return obtenidosService.getAllObtenidos();
    }

    @GetMapping("/user/{userId}")
    public List<YokaisObtenidos> getObtenidosByUserId(@PathVariable Long userId) {
        return obtenidosService.getObtenidosByUserId(userId);
    }

    @DeleteMapping("/delete")
    public void deleteObtenido(@RequestParam Long userId, @RequestParam Long yokaiId) {
        obtenidosService.deleteObtenido(userId, yokaiId);
    }
}
