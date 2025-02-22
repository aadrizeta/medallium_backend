package com.app.medallium.controllers;

import com.app.medallium.models.DatosCombate;
import com.app.medallium.services.DatosCombateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/datosCombate")
@CrossOrigin("*")
public class DatosCombateController {
    @Autowired
    private DatosCombateService datosCombateService;

    @GetMapping("/get-tDatosCombate")
    public ResponseEntity<List<DatosCombate>> getAllTribus() {
        List<DatosCombate> tribus = datosCombateService.getAllDatosCombate();
        return ResponseEntity.ok(tribus);
    }

    @PostMapping("/getDatosCombateByName")
    public ResponseEntity<DatosCombate> getDetallesYokaiByName(@RequestParam String nombre) {
        Optional<DatosCombate> tribusOptional = datosCombateService.getDetallesYokaiByName(nombre);
        if (tribusOptional.isPresent()) {
            return ResponseEntity.ok(tribusOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
