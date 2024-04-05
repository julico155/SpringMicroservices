package com.microservice.producto.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Base de datos producto
 * capa modelo*/

@Data
@Entity
@Builder
@Table(name = "producto")
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String descripcion;
    private  Double precio;

    @Column(name = "categoria_id")
    private Long categoria_id;
}
