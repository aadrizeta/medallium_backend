package com.app.medallium.controllers;

import com.app.medallium.models.DetallesYokai;
import com.app.medallium.services.DetallesYokaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/detalles")
@CrossOrigin("*")
public class DetallesYokaiController {
    @Autowired
    private DetallesYokaiService detallesYokaiService;

    @PostMapping("/getDetallesYokaiByName")
    public ResponseEntity<DetallesYokai> getDetallesYokaiByName(@RequestParam String name) {
        Optional<DetallesYokai> detallesYokaiOptional = detallesYokaiService.getDetallesYokaiByName(name);
        if (detallesYokaiOptional.isPresent()) {
            return ResponseEntity.ok(detallesYokaiOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/get-detallesYokai")
    public ResponseEntity<List<DetallesYokai>> getAllYokais() {
        List<DetallesYokai> yokais = detallesYokaiService.getAllYokais();
        return ResponseEntity.ok(yokais);
    }

    @GetMapping("/getByTribu/{idTribu}")
    public ResponseEntity<List<DetallesYokai>> getDetallesByTribu(@PathVariable Long idTribu) {
        List<DetallesYokai> detalles = detallesYokaiService.getDetallesByTribu(idTribu);
        return ResponseEntity.ok(detalles);
    }

    @GetMapping("/getByRango/{idRango}")
    public ResponseEntity<List<DetallesYokai>> getDetallesByRango(@PathVariable Long idRango) {
        List<DetallesYokai> detalles = detallesYokaiService.getDetallesByRango(idRango);
        return ResponseEntity.ok(detalles);
    }

    @GetMapping("/getByElemento/{idElemento}")
    public ResponseEntity<List<DetallesYokai>> getDetallesByElemento(@PathVariable Long idElemento) {
        List<DetallesYokai> detalles = detallesYokaiService.getDetallesByElemento(idElemento);
        return ResponseEntity.ok(detalles);
    }
}
