package com.microservice.producto.microserviceproducto.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@Table(name = "producto")
@AllArgsConstructor
@NoArgsConstructor
public class producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String descripcion;
    private Double precio;

    @Column(name = "categoria_id")
    private Long categoriaId;
}
