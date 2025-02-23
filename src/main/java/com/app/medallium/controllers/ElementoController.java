package com.app.medallium.controllers;

import com.app.medallium.models.Elemento;
import com.app.medallium.services.ElementoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/elemento")
@CrossOrigin("*")
public class ElementoController {
    @Autowired
    private ElementoService elementoService;

    @GetMapping("/get-all-elementos")
    public ResponseEntity<List<Elemento>> getAllElementos() {
        List<Elemento> elementos = elementoService.getAllElementos();
        return ResponseEntity.ok(elementos);
    }

    @PostMapping("/getElementoByName")
    public ResponseEntity<Elemento> getElementoByName(@RequestParam String aName) {
        Optional<Elemento> elementoOptional = elementoService.getElementoByNombre(aName);
        if (elementoOptional.isPresent()) {
            return ResponseEntity.ok(elementoOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

//    @PostMapping("/getElementoByYokaiId")
//    public ResponseEntity<Elemento> getElementoByYokaiId(@RequestParam Long yokaiId) {
//        Optional<Elemento> elementoOptional = elementoService.getElementoByYokaiId(yokaiId);
//        if (elementoOptional.isPresent()) {
//            return ResponseEntity.ok(elementoOptional.get());
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
}
