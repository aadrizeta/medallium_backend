package com.app.medallium.services;

import com.app.medallium.models.Elemento;
import com.app.medallium.models.Yokais;
import com.app.medallium.repositories.ElementoRepository;
import com.app.medallium.repositories.YokaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ElementoService {
    @Autowired
    private ElementoRepository elementoRepository;
    @Autowired
    private YokaisRepository yokaisRepository;

    public Optional<Elemento> getElementoByNombre(String aName) {
        return elementoRepository.findByNombre(aName);
    }

    public List<Elemento> getAllElementos() {
        return elementoRepository.findAll();
    }

//   // public Optional<Elemento> getElementoByYokaiId(Long yokaiId) {
//        return elementoRepository.findByYokaiId(yokaiId);
//    }
//
//    public Optional<Yokais> getYokaiByName(String name) {
//        return yokaisRepository.findByName(name);
//    }
}
