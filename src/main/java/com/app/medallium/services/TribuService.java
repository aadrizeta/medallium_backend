package com.app.medallium.services;

import com.app.medallium.models.Roles;
import com.app.medallium.models.Tribus;
import com.app.medallium.models.Users;
import com.app.medallium.repositories.RolesRepository;
import com.app.medallium.repositories.TribusRepository;
import com.app.medallium.repositories.UserRepository;
import com.app.medallium.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

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
}
