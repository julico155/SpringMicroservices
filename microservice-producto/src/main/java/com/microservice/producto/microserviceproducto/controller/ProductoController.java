package com.microservice.producto.microserviceproducto.controller;

import com.microservice.producto.microserviceproducto.entities.producto;
import com.microservice.producto.microserviceproducto.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveProducto(@RequestBody producto Producto){
        productoService.save(Producto);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllProducto(){
        return ResponseEntity.ok(productoService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(productoService.findById(id));
    }


}
