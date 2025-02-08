package com.app.medallium.services;

import com.app.medallium.models.Elemento;
import com.app.medallium.models.Tribus;
import com.app.medallium.repositories.ElementoRepository;
import com.app.medallium.repositories.RolesRepository;
import com.app.medallium.repositories.UserRepository;
import com.app.medallium.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ElementosService {
    @Autowired
    private ElementoRepository elementoRepository;

    @Autowired
    private JwtUtil jwtUtil;

    public Elemento createElemento(Elemento elemento) {
        // Si el usuario existe lanzamos un error y no continuamos con el proceso de creación
        if (this.elementoRepository.findByName(elemento.getName()).isPresent()) {
            throw new RuntimeException("Elemento ya existe");
        }
        Elemento newElemento = new Elemento();
        newElemento.setName(elemento.getName());
        newElemento.setFortaleza(elemento.getFortaleza());
        newElemento.setDebilidad(elemento.getDebilidad());
        newElemento.setDescripcion(elemento.getDescripcion());
        return this.elementoRepository.save(newElemento);
    }


}
