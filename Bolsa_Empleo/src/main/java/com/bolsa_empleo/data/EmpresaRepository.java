package com.bolsa_empleo.data;

import com.bolsa_empleo.logic.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, String> {
}
