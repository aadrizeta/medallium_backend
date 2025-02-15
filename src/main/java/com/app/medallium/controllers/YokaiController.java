package com.app.medallium.controllers;

import com.app.medallium.models.Yokais;
import com.app.medallium.services.YokaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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


}
