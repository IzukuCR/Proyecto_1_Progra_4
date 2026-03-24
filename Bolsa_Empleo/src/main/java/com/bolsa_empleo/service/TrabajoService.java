package com.bolsa_empleo.service;

import org.springframework.stereotype.Service;
import com.bolsa_empleo.data.TrabajoRepository;
import com.bolsa_empleo.logic.Trabajo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrabajoService {
    @Autowired
    private TrabajoRepository trabajoRepository;

    // Metodo para listar todos los trabajos
    public List<Trabajo> trabajosFindAll(){
        return trabajoRepository.findAll();
    }

    // Metodo para agregar un trabajo
    public void trabajoAdd(Trabajo trabajo) {
        trabajoRepository.save(trabajo);
    }

    // Metodo para eliminar un trabajo
    public void trabajoDelete(Long id) {
        trabajoRepository.deleteById(id);
    }

}
