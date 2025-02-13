package com.app.medallium.models;

import jakarta.persistence.*;

@Entity
@Table(name = "yokais")
public class Yokais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Yokai;

    private String name;

    @ManyToOne
    @JoinColumn(name = "id_rango", referencedColumnName = "id_Rango")
    private Rango rango;

    @ManyToOne
    @JoinColumn(name = "id_tribu", referencedColumnName = "id_Tribu")
    private Tribus tribu;

    @ManyToOne
    @JoinColumn(name = "id_elemento", referencedColumnName = "id_Elemento")
    private Elemento elemento;

    @ManyToOne
    @JoinColumn(name = "id_fase", referencedColumnName = "id")
    private Fase fase;

    public Long getId_Yokai() {
        return id_Yokai;
    }

    public void setId_Yokai(Long id_Yokai) {
        this.id_Yokai = id_Yokai;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rango getRango() {
        return rango;
    }

    public void setRango(Rango rango) {
        this.rango = rango;
    }

    public Tribus getTribu() {
        return tribu;
    }

    public void setTribu(Tribus tribu) {
        this.tribu = tribu;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }

    public Fase getFase() {
        return fase;
    }

    public void setFase(Fase fase) {
        this.fase = fase;
    }
}
