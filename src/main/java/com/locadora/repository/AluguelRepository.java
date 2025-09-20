package com.locadora.repository;

import com.locadora.model.Aluguel;
import com.locadora.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AluguelRepository extends JpaRepository<Aluguel, Long> {
}
