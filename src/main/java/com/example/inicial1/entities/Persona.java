package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@SuperBuilder
@Audited
public class Persona extends Base{
    private String nombre;
    private String apellido;
    private int dni;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "FK_Domicilio")
    private Domicilio domicilio;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "PersonaLibro",
            joinColumns = @JoinColumn(name = "Persona_ID"),
            inverseJoinColumns = @JoinColumn(name = "Libro_ID")
    )
    @Builder.Default
    private List<Libro> libros = new ArrayList<Libro>();
}

