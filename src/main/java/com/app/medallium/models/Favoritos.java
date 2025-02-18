package com.app.medallium.models;

import jakarta.persistence.*;

@Entity
@Table(name = "favoritos")
public class Favoritos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Favorito;

    private Long id_User;

    private Long id_Yokai;

    public Long getId_Favorito() {
        return id_Favorito;
    }

    public void setId_Favorito(Long id_Favorito) {
        this.id_Favorito = id_Favorito;
    }

    public Long getId_User() {
        return id_User;
    }

    public void setId_User(Long id_User) {
        this.id_User = id_User;
    }

    public Long getId_Yokai() {
        return id_Yokai;
    }

    public void setId_Yokai(Long id_Yokai) {
        this.id_Yokai = id_Yokai;
    }
}
