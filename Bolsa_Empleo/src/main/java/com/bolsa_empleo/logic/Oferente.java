package com.bolsa_empleo.logic;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "oferentes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Oferente {

    @Id
    @NotBlank
    @Column(nullable = false)
    private String id;

    @NotBlank
    @Column(nullable = false)
    private String nombre;

    @NotBlank
    @Column(nullable = false)
    private String primerApellido;

    @NotBlank
    @Column(nullable = false)
    private String nacionalidad;

    @NotBlank
    @Column(nullable = false)
    private String telefono;

    @NotBlank
    @Column(nullable = false)
    private String lugarResidencia;

    // Relación con User (login del sistema)
    @OneToOne
    @JoinColumn(name = "user_email", nullable = false)
    private User user;


}
