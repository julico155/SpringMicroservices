package com.microservice.producto.service;

import com.microservice.producto.entities.Producto;
import com.microservice.producto.persistence.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

/** Implementacion de los servicios*/
@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    @Lazy
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> findAll() {
        return (List<Producto>) productoRepository.findAll();
    }

    @Override
    public Producto findById(Long id) {
        return productoRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Producto producto) {
        productoRepository.save(producto);
    }

    @Override
    public List<Producto> findByIdCategoria(Long idCategoria) {
        return productoRepository.findAllProducto(idCategoria);
    }
}
