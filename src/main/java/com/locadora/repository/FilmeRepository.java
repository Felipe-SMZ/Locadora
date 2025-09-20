package com.locadora.repository;

import com.locadora.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository <Filme, Long> {
}
