package com.microservice.categoria.service;

import com.microservice.categoria.dto.ProductoDTO;
import com.microservice.categoria.entities.Categoria;
import com.microservice.categoria.http.response.ProductoByCategoriaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import com.microservice.categoria.client.ProductoClient;
import java.util.List;

@Service
public class CategoriaServiceImpl implements ICategoriaService {

    @Autowired
    @Lazy
    private ICategoriaService categoriaRepository;
    @Autowired
    @Lazy
    private ProductoClient ProductoClient;

    @Override
    public List<Categoria> findAll() {
        return (List<Categoria>) categoriaRepository.findAll();
    }

    @Override
    public Categoria findById(Long id) {
        return (Categoria) categoriaRepository.findById(id);
    }

    @Override
    public void save(Categoria categoria) {
    categoriaRepository.save(categoria);
    }

    @Override
    public ProductoByCategoriaResponse findProductosByCategoriaId(Long categoriaId) {

        // Consultar si existe la categoria
        Categoria categoria = categoriaRepository.findById(categoriaId);

        // Obtener los productos
        List<ProductoDTO> ProductoDTOList = ProductoClient.findAllProductoByCategoria(categoriaId);

            return ProductoByCategoriaResponse.builder()
                    .name(categoria.getName())
                    .descripcion(categoria.getDescripcion())
                    .productoDTOList(ProductoDTOList)
                    .build();
    }

}
