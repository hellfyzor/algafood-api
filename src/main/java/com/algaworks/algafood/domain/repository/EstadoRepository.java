package com.algaworks.algafood.domain.repository;

import com.algaworks.algafood.model.Cozinha;
import com.algaworks.algafood.model.Estado;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstadoRepository {

    List<Estado> todas();
    Estado porId(Long id);
    Estado adicionar(Estado estado);
    void remover(Estado estado);
}
