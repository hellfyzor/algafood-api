package com.algaworks.algafood.domain.repository;

import com.algaworks.algafood.domain.model.Cidade;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CidadeRepository {

    List<Cidade> todas();
    Cidade porId(Long id);
    Cidade salvar(Cidade cidade);
    void remover(Long id);
}
