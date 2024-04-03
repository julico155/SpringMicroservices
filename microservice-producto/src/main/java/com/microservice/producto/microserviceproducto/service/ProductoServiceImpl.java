package com.microservice.producto.microserviceproducto.service;

import com.microservice.producto.microserviceproducto.entities.producto;
import com.microservice.producto.microserviceproducto.persistence.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<producto> findAll() {
        return (List<producto>) productoRepository.findAll();
    }

    @Override
    public producto findById(Long id) {
        return productoRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(producto Producto) {
        productoRepository.save(Producto);
    }

    @Override
    public List<producto> findByIdCategoria(Long idCategoria) {
        return productoRepository.findAllproducto(idCategoria);
    }
}
