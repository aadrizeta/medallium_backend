package com.app.medallium.services;

import com.app.medallium.models.DetallesYokai;
import com.app.medallium.repositories.DetallesYokaiRepository;
import com.app.medallium.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetallesYokaiService {
    @Autowired
    private DetallesYokaiRepository detallesYokaiRepository;

    @Autowired
    private JwtUtil jwtUtil;

    public DetallesYokai createDetallesYokai(DetallesYokai detallesYokai) {
        // Si el usuario existe lanzamos un error y no continuamos con el proceso de creación
        if (this.detallesYokaiRepository.findByNombre(detallesYokai.getNombre()).isPresent()) {
            throw new RuntimeException("El Yokai ya existe");
        }
        DetallesYokai newDetalleYokai = new DetallesYokai();
        newDetalleYokai.setNombre(detallesYokai.getNombre());
        newDetalleYokai.setMedalla(detallesYokai.getMedalla());
        newDetalleYokai.setLocalizacion(detallesYokai.getLocalizacion());
        newDetalleYokai.setDescripcion(detallesYokai.getDescripcion());
        newDetalleYokai.setComida(detallesYokai.getComida());
        return this.detallesYokaiRepository.save(newDetalleYokai);
    }
}
