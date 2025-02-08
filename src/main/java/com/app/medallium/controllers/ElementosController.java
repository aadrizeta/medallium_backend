package com.app.medallium.controllers;

import com.app.medallium.models.Elemento;
import com.app.medallium.services.ElementosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/elementos")
@CrossOrigin("*")
public class ElementosController {
    @Autowired
    private ElementosService elementosService;
    @PostMapping("/create")
    public ResponseEntity<Elemento> createElemento(@RequestBody Elemento elemento) {
        Elemento createElemento = elementosService.createElemento(elemento);
        return ResponseEntity.ok(createElemento);
    }
}
