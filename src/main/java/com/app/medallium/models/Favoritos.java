package com.app.medallium.models;

import jakarta.persistence.*;

@Entity
@Table(name = "favoritos")
public class Favoritos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Favorito;

    private Long id_User;

    @OneToOne
    @JoinColumn(name = "id_yokai", referencedColumnName = "id_detallesYokai")
    private DetallesYokai detallesYokai;

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

    public DetallesYokai getDetallesYokai() {
        return detallesYokai;
    }

    public void setDetallesYokai(DetallesYokai detallesYokai) {
        this.detallesYokai = detallesYokai;
    }
}
