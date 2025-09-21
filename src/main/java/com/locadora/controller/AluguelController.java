package com.locadora.controller;

import com.locadora.model.Aluguel;
import com.locadora.repository.AluguelRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alugueis")
public class AluguelController {

    @Autowired
    private AluguelRepository aluguelRepository;

    @GetMapping
    public List<Aluguel> listarAlugueis() {
        return aluguelRepository.findAll();
    }

    @PostMapping
    public Aluguel criarAluguel(@RequestBody @Valid Aluguel aluguel) {
        return aluguelRepository.save(aluguel);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Aluguel> atualizarAluguel(@PathVariable Long id, @RequestBody @Valid Aluguel aluguelAtualizado) {
        Optional<Aluguel> aluguelExistente = aluguelRepository.findById(id);
        if (aluguelExistente.isPresent()) {
            Aluguel aluguel = aluguelExistente.get();
            aluguel.setFilmes(aluguelAtualizado.getFilmes());
            aluguel.setDataAluguel(aluguelAtualizado.getDataAluguel());
            aluguel.setDataDevolucao(aluguelAtualizado.getDataDevolucao());
            return ResponseEntity.ok(aluguelRepository.save(aluguel));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarAluguel(@PathVariable Long id) {
        if (aluguelRepository.existsById(id)) {
            aluguelRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
