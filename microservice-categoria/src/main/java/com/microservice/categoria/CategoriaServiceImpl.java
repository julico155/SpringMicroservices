package com.microservice.categoria;

import com.microservice.categoria.entities.Categoria;
import com.microservice.categoria.service.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements ICategoriaService {

    @Autowired
    private ICategoriaService categoriaRepository;

    @Override
    public List<Categoria> findAll() {
        return (List<Categoria>) categoriaRepository.findAll();
    }

    @Override
    public Categoria findById(Long id) {
        return categoriaRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Categoria categoria) {
    categoriaRepository.save(categoria);
    }
}
