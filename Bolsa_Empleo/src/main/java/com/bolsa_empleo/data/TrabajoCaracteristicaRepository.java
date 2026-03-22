package com.bolsa_empleo.data;

import com.bolsa_empleo.logic.TrabajoCaracteristica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrabajoCaracteristicaRepository extends JpaRepository<TrabajoCaracteristica, Long> {
}