package com.microservice.producto.microserviceproducto.persistence;

import com.microservice.producto.microserviceproducto.entities.producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends CrudRepository<producto, Long> {

    @Query("SELECT p FROM producto p WHERE p.productoId = :idProducto")
    List<producto> findAllproducto(Long idCategoria);

    //List<producto> findAllBycategoriaId(Long idCategoria);
}
