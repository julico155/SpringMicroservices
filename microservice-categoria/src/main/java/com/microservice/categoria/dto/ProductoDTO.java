package com.microservice.categoria.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDTO {


    private String name;
    private String descripcion;
    private Double precio;
    private Long categoriaId;
}
