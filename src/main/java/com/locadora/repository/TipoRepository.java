package com.locadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.locadora.model.Tipo;

public interface TipoRepository extends JpaRepository<Tipo, Long> {
}
