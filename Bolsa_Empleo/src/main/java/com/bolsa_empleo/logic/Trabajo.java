package com.bolsa_empleo.logic;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

import lombok.*;

import java.util.List;

@Entity
@Table(name = "trabajos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Trabajo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false)
    private String descripcion;

    @Positive
    @Column(nullable = false)
    private double salario;

    @Column(nullable = false)
    private boolean esPublico;

    @Column(nullable = false)
    private boolean activo;

    // Relación con Empresa
    @ManyToOne
    @JoinColumn(name = "empresa_email", nullable = false)
    private Empresa empresa;

    // Relación con requisitos del trabajo
    @OneToMany(mappedBy = "trabajo", cascade = CascadeType.ALL)
    private List<TrabajoCaracteristica> caracteristicas;
}
