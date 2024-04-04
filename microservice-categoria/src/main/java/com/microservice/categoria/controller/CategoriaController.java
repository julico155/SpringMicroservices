package com.microservice.categoria.controller;

import com.microservice.categoria.entities.Categoria;
import com.microservice.categoria.service.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaController {

    @Autowired
    @Lazy
    private ICategoriaService categoriaService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCategoria(@RequestBody Categoria categoria){
        categoriaService.save(categoria);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllCategoria(){
        return ResponseEntity.ok(categoriaService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(categoriaService.findById(id));
    }

    @GetMapping("/search-producto/{categoriaId}")
    public ResponseEntity<?> findProductoByCategoriaId(@PathVariable Long categoriaId){
        return ResponseEntity.ok(categoriaService.findProductosByCategoriaId(categoriaId));
    }
}
