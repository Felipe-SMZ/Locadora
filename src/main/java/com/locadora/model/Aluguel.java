package com.locadora.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Aluguel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    private List<Filme> filmes;

    @ManyToOne
    private Cliente cliente;

    private LocalDate dataAluguel;
    private LocalDate dataDevolucao;
}
