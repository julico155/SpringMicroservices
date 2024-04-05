package com.microservice.categoria.http.response;


import com.microservice.categoria.dto.ProductoDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
/** Envia la respuesta por medio del microservicio, desde producto a Categoria*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductoByCategoriaResponse {

    private String cate;
    private String descripcion;
    private List<ProductoDTO> productoDTOList;

}
