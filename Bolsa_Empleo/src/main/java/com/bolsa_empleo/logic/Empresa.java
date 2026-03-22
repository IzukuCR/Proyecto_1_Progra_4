package com.bolsa_empleo.logic;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "empresas")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Empresa {

    @Id
    @Column(name = "user_email")
    private String email;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_email")
    private User user;

    @NotBlank
    @Column(nullable = false)
    private String nombre;

    @NotBlank
    @Column(nullable = false)
    private String localizacion;

    @NotBlank
    @Column(nullable = false)
    private String telefono;

    @NotBlank
    @Column(nullable = false, length = 1000)
    private String descripcion;
}
