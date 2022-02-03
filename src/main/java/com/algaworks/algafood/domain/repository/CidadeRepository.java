package com.algaworks.algafood.domain.repository;

import com.algaworks.algafood.model.Cidade;
import com.algaworks.algafood.model.Estado;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CidadeRepository {

    List<Cidade> todas();
    Cidade porId(Long id);
    Cidade adicionar(Cidade cidade);
    void remover(Cidade cidade);
}
