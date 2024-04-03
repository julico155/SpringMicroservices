package com.microservice.categoria.http.response;


import com.microservice.categoria.dto.ProductoDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductoByCategoriaResponse {

    private String name;
    private String descripcion;
    private List<ProductoDTO> productoDTOList;

}
