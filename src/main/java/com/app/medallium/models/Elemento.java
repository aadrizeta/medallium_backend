package com.app.medallium.models;

import jakarta.persistence.*;

@Entity
@Table(name = "elemento")
public class Elemento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Elemento;

    private String name;

    private String fortaleza;

    private String debilidad;

    private String descripcion;

    public Long getId_Elemento() {
        return id_Elemento;
    }

    public void setId_Elemento(Long id_Elemento) {
        this.id_Elemento = id_Elemento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFortaleza() {
        return fortaleza;
    }

    public void setFortaleza(String fortaleza) {
        this.fortaleza = fortaleza;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
