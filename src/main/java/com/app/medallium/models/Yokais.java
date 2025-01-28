package com.app.medallium.models;

import jakarta.persistence.*;

@Entity
@Table(name = "yokais")
public class Yokais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Yokai;

    private  Long id_Fusion;


    private  Long id_Tribu;

    private  Long id_Rango;

    private  Long id_Evolucion;

    private String Elemento;

    private  Long id_Fase;

    private long id_DetallesYokai;

    public Long getId_Yokai() {
        return id_Yokai;
    }

    public void setId_Yokai(Long id_Yokai) {
        this.id_Yokai = id_Yokai;
    }

    public Long getId_Fusion() {
        return id_Fusion;
    }

    public void setId_Fusion(Long id_Fusion) {
        this.id_Fusion = id_Fusion;
    }

    public Long getId_Tribu() {
        return id_Tribu;
    }

    public void setId_Tribu(Long id_Tribu) {
        this.id_Tribu = id_Tribu;
    }

    public Long getId_Rango() {
        return id_Rango;
    }

    public void setId_Rango(Long id_Rango) {
        this.id_Rango = id_Rango;
    }

    public Long getId_Evolucion() {
        return id_Evolucion;
    }

    public void setId_Evolucion(Long id_Evolucion) {
        this.id_Evolucion = id_Evolucion;
    }

    public String getElemento() {
        return Elemento;
    }

    public void setElemento(String elemento) {
        Elemento = elemento;
    }

    public Long getId_Fase() {
        return id_Fase;
    }

    public void setId_Fase(Long id_Fase) {
        this.id_Fase = id_Fase;
    }

    public long getId_DetallesYokai() {
        return id_DetallesYokai;
    }

    public void setId_DetallesYokai(long id_DetallesYokai) {
        this.id_DetallesYokai = id_DetallesYokai;
    }
}
