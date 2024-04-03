package com.microservice.categoria.service;

import com.microservice.categoria.entities.Categoria;
import com.microservice.categoria.http.response.ProductoByCategoriaResponse;

import java.util.List;

public interface ICategoriaService {

    List<Categoria> findAll();

    Categoria findById(Long id);

    void save(Categoria categoria);

    ProductoByCategoriaResponse findProductosByCategoriaId(Long categoriaId);
}
