package com.locadora.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String titulo;

    @ManyToOne
    @NotNull
    private Tipo tipo;

    public Filme() {
    }

    public Filme(String titulo, Tipo tipo) {
        this.titulo = titulo;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
