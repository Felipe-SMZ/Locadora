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
}
