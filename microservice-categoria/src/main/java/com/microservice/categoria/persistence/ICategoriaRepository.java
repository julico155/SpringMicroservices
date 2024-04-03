package com.microservice.categoria.persistence;

import com.microservice.categoria.entities.Categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoriaRepository extends CrudRepository<Categoria, Long> {
}
