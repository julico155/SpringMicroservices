package com.microservice.categoria.client;


import com.microservice.categoria.dto.ProductoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-producto", url = "localhost:8090")
public interface ProductoClient {



    @GetMapping("/api/producto/search-by-categoria/{categoriaId}")
    List<ProductoDTO> findAllProductostByCategoria(@PathVariable Long categoriaId);
}