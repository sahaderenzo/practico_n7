package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Audited
public class Domicilio extends Base {
    private String calle;
    private int numero;

    @ManyToOne(optional = false)
    @JoinColumn(name = "FK_Localidad")
    private Localidad localidad;
}
