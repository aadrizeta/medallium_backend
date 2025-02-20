package com.app.medallium.services;

import com.app.medallium.models.*;
import com.app.medallium.repositories.*;
import com.app.medallium.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TribuService {

    @Autowired
    private TribusRepository tribusRepository;

    @Autowired
    private JwtUtil jwtUtil;


    public Tribus createTribu(Tribus tribus) {
        // Si el usuario existe lanzamos un error y no continuamos con el proceso de creación
        if (this.tribusRepository.findByNombre(tribus.getNombre()).isPresent()) {
            throw new RuntimeException("Tribu ya existe");
        }
        Tribus newTribu = new Tribus();
        newTribu.setNombre(tribus.getNombre());
        newTribu.setCaracteristicasGenerales(tribus.getCaracteristicasGenerales());
        newTribu.setTipoBonus(tribus.getTipoBonus());
        newTribu.setDescripcion(tribus.getDescripcion());
        newTribu.setImage(tribus.getImage());
        newTribu.setNombreJapones(tribus.getNombreJapones());
        return this.tribusRepository.save(newTribu);
    }

    public Optional<Tribus> getTribusByNombre(String nombre) {
        Optional<Tribus> yokaiOptional = tribusRepository.findByNombre(nombre);
        if (yokaiOptional.isPresent()) {
            long idTribu = yokaiOptional.get().getId_Tribu();
            return tribusRepository.findById(idTribu);
        }
        return Optional.empty();
    }
    public List<Tribus> getAllTribus() {
        return this.tribusRepository.findAll();
    }

}
