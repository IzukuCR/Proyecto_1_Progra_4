package com.bolsa_empleo.data;

import com.bolsa_empleo.logic.Caracteristica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaracteristicaRepository extends JpaRepository<Caracteristica, Long> {
}