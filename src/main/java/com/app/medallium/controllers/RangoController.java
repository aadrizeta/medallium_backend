package com.app.medallium.controllers;

import com.app.medallium.models.Rango;
import com.app.medallium.services.RangoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rango")
@CrossOrigin("*")
public class RangoController {
    @Autowired
    private RangoService rangoService;

    @GetMapping("/get-rango")
    public ResponseEntity<List<Rango>> getAllRango() {
        List<Rango> rangos = rangoService.getAllRangos();
        return ResponseEntity.ok(rangos);
    }

    @PostMapping("/getRangoByName")
    public ResponseEntity<Rango> getRangoByName(@RequestParam String nombre) {
        Optional<Rango> rangoOptional = rangoService.getRangoByNombre(nombre);
        if (rangoOptional.isPresent()) {
            return ResponseEntity.ok(rangoOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/getRangoByYokaiName")
    public ResponseEntity<Rango> getRangoByYokaiName(@RequestParam String yokaiName) {
        Optional<Rango> rangoOptional = rangoService.getRangoByYokaiName(yokaiName);
        if (rangoOptional.isPresent()) {
            return ResponseEntity.ok(rangoOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
