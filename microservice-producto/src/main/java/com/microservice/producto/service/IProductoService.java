package com.microservice.producto.service;

import com.microservice.producto.entities.Producto;

import java.util.List;

/** Metodos del microservicio */
public interface IProductoService {

    List<Producto> findAll();

    Producto findById(Long id);

    void save(Producto producto);

    List<Producto> findByIdCategoria(Long idCategoria);
}
