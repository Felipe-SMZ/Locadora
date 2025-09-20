package com.locadora.controller;

import com.locadora.model.Tipo;
import com.locadora.repository.TipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/tipos")
public class TipoController {
    @Autowired
    private TipoRepository tipoRepository;

    @GetMapping
    public List<Tipo> listarTipos() {
        return tipoRepository.findAll();
    }

    @PostMapping
    public Tipo criarTipo(@RequestBody @Valid Tipo tipo) {
        return tipoRepository.save(tipo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarTipo(@PathVariable Long id) {
        if (tipoRepository.existsById(id)) {
            tipoRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
