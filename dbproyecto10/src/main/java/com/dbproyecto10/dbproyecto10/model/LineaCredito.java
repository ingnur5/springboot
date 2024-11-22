package com.dbproyecto10.dbproyecto10.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LineaCredito {
    @Id
    private int idLineaCredito;
    private String nombre;
    private Long mont;


    public LineaCredito(int idLineaCredito, String nombre, Long mont) {
        this.idLineaCredito = idLineaCredito;
        this.nombre = nombre;
        this.mont = mont;
    }

    public LineaCredito() {
    }

    public int getIdLineaCredito() {
        return idLineaCredito;
    }

    public void setIdLineaCredito(int idLineaCredito) {
        this.idLineaCredito = idLineaCredito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getMont() {
        return mont;
    }

    public void setMont(Long mont) {
        this.mont = mont;
    }
}
