package com.app.medallium.controllers;

import com.app.medallium.models.DetallesYokai;
import com.app.medallium.services.DetallesYokaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


    @RestController
    @RequestMapping("/detallesYokai")
    @CrossOrigin("*")
    public class DetallesYokaiController {
        @Autowired
        private DetallesYokaiService detallesYokaiService;
        @PostMapping("/create")
        public ResponseEntity<DetallesYokai> createDetallesYokai(@RequestBody DetallesYokai detallesYokai) {
            DetallesYokai createDetallesYokai = detallesYokaiService.createDetallesYokai(detallesYokai);
            return ResponseEntity.ok(createDetallesYokai);
        }
    }

