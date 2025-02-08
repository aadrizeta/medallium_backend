package com.app.medallium.controllers;

import com.app.medallium.models.Tribus;
import com.app.medallium.models.Users;
import com.app.medallium.services.TribuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}
