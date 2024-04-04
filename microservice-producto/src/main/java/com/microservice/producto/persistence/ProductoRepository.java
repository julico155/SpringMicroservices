package com.microservice.producto.persistence;

import com.microservice.producto.entities.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
/** Capa de persistencia*/
@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long> {

    @Query("SELECT p FROM Producto p WHERE p.categoriaID = :idCategoria")
    List<Producto> findAllProducto(Long idCategoria);

}
