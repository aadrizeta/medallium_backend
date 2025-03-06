package com.app.medallium.controllers;

import com.app.medallium.models.Yokais;
import com.app.medallium.services.YokaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Yokai")
@CrossOrigin("*")
public class YokaiController {
    @Autowired
    private YokaiService yokaiService;

    @PostMapping("/getYoakiByName")
    public ResponseEntity<Yokais> getYoakiByName(@RequestParam String name) {
        Optional<Yokais> yokaiOptional = yokaiService.getYoakiByName(name);
        if (yokaiOptional.isPresent()) {
            return ResponseEntity.ok(yokaiOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/findByTribu")
    public ResponseEntity<List<Yokais>> findByTribu(@RequestParam Long idTribu) {
        List<Yokais> yokais = yokaiService.findByTribu(idTribu);
        if (!yokais.isEmpty()) {
            return ResponseEntity.ok(yokais);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/findByElemento")
    public ResponseEntity<List<Yokais>> findByElemento(@RequestParam Long idElemento) {
        List<Yokais> yokais = yokaiService.findByElemento(idElemento);
        if (!yokais.isEmpty()) {
            return ResponseEntity.ok(yokais);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/findByRango")
    public ResponseEntity<List<Yokais>> findByRango(@RequestParam Long idRango) {
        List<Yokais> yokais = yokaiService.findByRango(idRango);
        if (!yokais.isEmpty()) {
            return ResponseEntity.ok(yokais);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
