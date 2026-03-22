package com.bolsa_empleo.logic;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "trabajo_caracteristicas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class TrabajoCaracteristica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Trabajo al que pertenece
    @ManyToOne
    @JoinColumn(name = "trabajo_id", nullable = false)
    private Trabajo trabajo;

    // Característica requerida
    @ManyToOne
    @JoinColumn(name = "caracteristica_id", nullable = false)
    private Caracteristica caracteristica;

    // Nivel requerido
    @Column(nullable = false)
    private int nivelRequerido;
}

