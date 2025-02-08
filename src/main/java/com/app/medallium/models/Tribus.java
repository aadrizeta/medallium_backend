package com.app.medallium.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tribus")
public class Tribus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Tribu;

    private String nombre;

    private String caracteristicasGenerales;

    private String tipoBonus;

    @Column(length = 10000)
    private String descripcion;

    private String image;

    private String nombreJapones ;

    public Long getId_Tribu() {
        return id_Tribu;
    }

    public void setId_Tribu(Long id_Tribu) {
        this.id_Tribu = id_Tribu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCaracteristicasGenerales() {
        return caracteristicasGenerales;
    }

    public void setCaracteristicasGenerales(String caracteristicasGenerales) {
        this.caracteristicasGenerales = caracteristicasGenerales;
    }

    public String getTipoBonus() {
        return tipoBonus;
    }

    public void setTipoBonus(String tipoBonus) {
        this.tipoBonus = tipoBonus;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNombreJapones() {
        return nombreJapones;
    }

    public void setNombreJapones(String nombreJapones) {
        this.nombreJapones = nombreJapones;
    }
}
