package com.algaworks.algafood.domain.repository;

import com.algaworks.algafood.domain.model.Cozinha;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CozinhaRepository{

    List<Cozinha> todas();
    List<Cozinha> consultarPorNome(String nome);
    Cozinha porId(Long id);
    Cozinha salvar(Cozinha cozinha);
    void remover(Long id);

}
