package com.locadora.controller;

import com.locadora.model.Filme;
import com.locadora.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/filmes")
public class FilmeController {
    @Autowired
    private FilmeRepository filmeRepository;

    @GetMapping
    public List<Filme> listarFilmes() {
        return filmeRepository.findAll();
    }

    @PostMapping
    public Filme criarFilme(@RequestBody @Valid Filme filme) {
        return filmeRepository.save(filme);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Filme> atulalizarFilme(@PathVariable Long id, @RequestBody @Valid Filme filmeAtualizado) {
        Optional<Filme> filmeExistente = filmeRepository.findById(id);
        if (filmeExistente.isPresent()) {
            Filme filme = filmeExistente.get();
            filme.setTitulo(filmeAtualizado.getTitulo());
            filme.setTipo(filmeAtualizado.getTipo());
            return ResponseEntity.ok(filmeRepository.save(filme));
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarFilme(@PathVariable Long id) {
        if (filmeRepository.existsById(id)) {
            filmeRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
