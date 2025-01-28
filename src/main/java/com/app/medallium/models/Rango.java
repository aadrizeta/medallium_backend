package com.app.medallium.models;

import jakarta.persistence.*;

@Entity
@Table(name = "rango")
public class Rango {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Rango;

    private String nombre;

    private String descripcion;

    private String caracteristicasGenerales;

    private String tipoBonus;

    public Long getId_Rango() {
        return id_Rango;
    }

    public void setId_Rango(Long id_Rango) {
        this.id_Rango = id_Rango;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
}
