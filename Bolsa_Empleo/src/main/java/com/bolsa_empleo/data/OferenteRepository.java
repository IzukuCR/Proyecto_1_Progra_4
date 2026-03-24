package com.bolsa_empleo.data;

import com.bolsa_empleo.logic.Oferente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OferenteRepository extends JpaRepository<Oferente, String> {
}