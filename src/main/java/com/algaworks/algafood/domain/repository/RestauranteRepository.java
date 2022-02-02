package com.algaworks.algafood.domain.repository;

import com.algaworks.algafood.model.Cozinha;
import com.algaworks.algafood.model.Restaurante;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestauranteRepository {

    List<Restaurante> todas();
    Restaurante porId(Long id);
    Restaurante adicionar(Restaurante restaurante);
    void remover(Restaurante restaurante);

}
