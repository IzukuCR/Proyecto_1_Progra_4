package com.bolsa_empleo.logic;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "oferente_caracteristicas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class OferenteCaracteristica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Oferente
    @ManyToOne
    @JoinColumn(name = "oferente_id", nullable = false)
    private Oferente oferente;

    // Característica que posee
    @ManyToOne
    @JoinColumn(name = "caracteristica_id", nullable = false)
    private Caracteristica caracteristica;

    // Nivel que tiene el oferente
    @Column(nullable = false)
    private int nivelPoseido;
}
