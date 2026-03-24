package com.bolsa_empleo.data;

import com.bolsa_empleo.logic.OferenteCaracteristica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OferenteCaracteristicaRepository extends JpaRepository<OferenteCaracteristica, Long> {
}