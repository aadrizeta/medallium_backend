package com.app.medallium.controllers;


import com.app.medallium.models.Tribus;
import com.app.medallium.services.TribuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tribus")
@CrossOrigin("*")
public class TribuController {
    @Autowired
    private TribuService tribuService;
    @PostMapping("/create")
    public ResponseEntity<Tribus> createTribu(@RequestBody Tribus tribus) {
        Tribus createTribu = tribuService.createTribu(tribus);
        return ResponseEntity.ok(createTribu);
    }
    @GetMapping("/get-tribus")
    public ResponseEntity<List<Tribus>> getAllTribus() {
        List<Tribus> tribus = tribuService.getAllTribus();
        return ResponseEntity.ok(tribus);
    }

    @PostMapping("/getTribusByNombre")
    public ResponseEntity<Tribus> getDetallesYokaiByName(@RequestParam String nombre) {
        Optional<Tribus> tribusOptional = tribuService.getTribusByNombre(nombre);
        if (tribusOptional.isPresent()) {
            return ResponseEntity.ok(tribusOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
