package com.algaworks.algafood.infrastructure.repository;

import com.algaworks.algafood.domain.repository.CozinhaRepository;
import com.algaworks.algafood.domain.repository.PermissaoRepository;
import com.algaworks.algafood.model.Cozinha;
import com.algaworks.algafood.model.Permissao;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PermissaoRepositoryImpl implements PermissaoRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Permissao> todas() {

        return manager.createQuery("from Permissao", Permissao.class).getResultList();
    }

    @Override
    public Permissao porId(Long id) {

        return manager.find(Permissao.class, id);
    }

    @Transactional
    @Override
    public Permissao adicionar(Permissao permissao) {

        return manager.merge(permissao);
    }

    @Transactional
    @Override
    public void remover(Permissao permissao) {
        permissao = porId(permissao.getId());
        manager.remove(permissao);
    }

}
