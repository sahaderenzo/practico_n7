package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@SuperBuilder
@Audited
public class Libro extends Base {
    private int fecha;
    private String genero;
    private int paginas;
    private String titulo;


    @ManyToMany(cascade = CascadeType.REFRESH)
    @JoinTable(
            name = "LibroAutor",
            joinColumns = @JoinColumn(name = "Libro_ID"),
            inverseJoinColumns = @JoinColumn(name = "Autor_ID")
    )
    @Builder.Default
    private List<Autor> autores = new ArrayList<Autor>();
}
