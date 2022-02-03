package com.algaworks.algafood.domain.repository;

import com.algaworks.algafood.model.Cozinha;
import com.algaworks.algafood.model.Permissao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermissaoRepository {

    List<Permissao> todas();
    Permissao porId(Long id);
    Permissao adicionar(Permissao permissao);
    void remover(Permissao permissao);
}
