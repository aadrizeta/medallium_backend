package com.app.medallium.models;

import jakarta.persistence.*;

@Entity
@Table(name = "yokais_obtenidos")
public class YokaisObtenidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_YokaiObtenido;

    private Long id_yokai;

    private Long id_usuario;

    public Long getId_YokaiObtenido() {
        return id_YokaiObtenido;
    }

    public void setId_YokaiObtenido(Long id_YokaiObtenido) {
        this.id_YokaiObtenido = id_YokaiObtenido;
    }

    public Long getId_yokai() {
        return id_yokai;
    }

    public void setId_yokai(Long id_yokai) {
        this.id_yokai = id_yokai;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }
}
