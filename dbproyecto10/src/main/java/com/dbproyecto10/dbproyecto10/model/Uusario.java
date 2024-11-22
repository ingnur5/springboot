package com.dbproyecto10.dbproyecto10.model;

import jakarta.persistence.*;

@Entity
public class Uusario {
    @Id
    private  String documento;
    private  String username;
    private String password;
    @OneToOne
    @MapsId
    @JoinColumn(name="documento")
    private Cliente cliente;

    public Uusario(String documento, String username, String password, Cliente cliente) {
        this.documento = documento;
        this.username = username;
        this.password = password;
        this.cliente = cliente;
    }

    public Uusario() {
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
