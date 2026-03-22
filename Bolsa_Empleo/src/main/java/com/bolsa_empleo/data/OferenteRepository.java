package com.bolsa_empleo.data;

import com.bolsa_empleo.logic.Oferente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OferenteRepository extends JpaRepository<Oferente, String> {
}