package com.algaworks.algafood.infrastructure.repository;

import com.algaworks.algafood.domain.repository.CidadeRepository;
import com.algaworks.algafood.domain.repository.EstadoRepository;
import com.algaworks.algafood.model.Cidade;
import com.algaworks.algafood.model.Estado;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CidadeRepositoryImpl implements CidadeRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Cidade> todas() {

        return manager.createQuery("from Cidade", Cidade.class).getResultList();
    }

    @Override
    public Cidade porId(Long id) {

        return manager.find(Cidade.class, id);
    }

    @Transactional
    @Override
    public Cidade adicionar(Cidade cidade) {

        return manager.merge(cidade);
    }

    @Transactional
    @Override
    public void remover(Cidade cidade) {
        cidade = porId(cidade.getId());
        manager.remove(cidade);
    }

}
