package com.app.medallium.models;

import jakarta.persistence.*;

@Entity
@Table(name = "yokais_obtenidos")
public class YokaisObtenidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_YokaiObtenido;

    private Long id_usuario;

    @OneToOne
    @JoinColumn(name = "id_yokai", referencedColumnName = "id_detallesYokai")
    private DetallesYokai detallesYokai;

    public Long getId_YokaiObtenido() {
        return id_YokaiObtenido;
    }

    public void setId_YokaiObtenido(Long id_YokaiObtenido) {
        this.id_YokaiObtenido = id_YokaiObtenido;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public DetallesYokai getDetallesYokai() {
        return detallesYokai;
    }

    public void setDetallesYokai(DetallesYokai detallesYokai) {
        this.detallesYokai = detallesYokai;
    }
}
