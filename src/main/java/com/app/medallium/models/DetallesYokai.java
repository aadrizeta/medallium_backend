package com.app.medallium.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "detalles_yokai")
public class DetallesYokai  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_detallesYokai;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    private String medalla;

    private String comida;

    @Column(length = 1000)
    private String descripcion;

    private String nombreJapo;

    @OneToOne
    @JoinColumn(name = "id_yokai", referencedColumnName = "id_Yokai")
    private Yokais yokai;

    public Long getId_detallesYokai() {
        return id_detallesYokai;
    }

    public void setId_detallesYokai(Long id_detallesYokai) {
        this.id_detallesYokai = id_detallesYokai;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getMedalla() {
        return medalla;
    }

    public void setMedalla(String medalla) {
        this.medalla = medalla;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreJapo() {
        return nombreJapo;
    }

    public void setNombreJapo(String nombreJapo) {
        this.nombreJapo = nombreJapo;
    }

    public Yokais getYokai() {
        return yokai;
    }

    public void setYokai(Yokais yokai) {
        this.yokai = yokai;
    }
}
