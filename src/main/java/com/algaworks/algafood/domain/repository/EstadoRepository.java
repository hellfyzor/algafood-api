package com.algaworks.algafood.domain.repository;

import com.algaworks.algafood.domain.model.Estado;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstadoRepository {

    List<Estado> todas();
    Estado porId(Long id);
    Estado salvar(Estado estado);
    void remover(Long id);
}
