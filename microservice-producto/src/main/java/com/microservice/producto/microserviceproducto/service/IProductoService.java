package com.microservice.producto.microserviceproducto.service;

import com.microservice.producto.microserviceproducto.entities.producto;

import java.util.List;

public interface IProductoService {

    List<producto> findAll();

    producto findById(Long id);

    void save(producto Producto);

    List<producto> findByIdCategoria(Long idCategoria);
}
