package com.microservice.producto.controller;

import com.microservice.producto.entities.Producto;
import com.microservice.producto.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/** Capa del controller*/
@RestController
@RequestMapping("/api/producto")
public class ProductoController {

    @Autowired
    @Lazy
    private IProductoService productoService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveProducto(@RequestBody Producto producto){
        productoService.save(producto);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllProducto(){
        return ResponseEntity.ok(productoService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long categoriaId){
        return ResponseEntity.ok(productoService.findByIdCategoria(categoriaId));
    }

    /** Endpoind que consume el microservicio de Categoria*/
    @GetMapping("/search-by-categoria/{categoriaId}")
    public ResponseEntity<?> findByIdCategoria(@PathVariable Long categoriaId){
        return ResponseEntity.ok(productoService.findByIdCategoria(categoriaId));
    }

}
