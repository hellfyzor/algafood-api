package com.algaworks.algafood.infrastructure.repository;

import com.algaworks.algafood.domain.repository.CozinhaRepository;
import com.algaworks.algafood.domain.repository.EstadoRepository;
import com.algaworks.algafood.model.Cozinha;
import com.algaworks.algafood.model.Estado;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class EstadoRepositoryImpl implements EstadoRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Estado> todas() {

        return manager.createQuery("from Estado", Estado.class).getResultList();
    }

    @Override
    public Estado porId(Long id) {

        return manager.find(Estado.class, id);
    }

    @Transactional
    @Override
    public Estado adicionar(Estado estado) {

        return manager.merge(estado);
    }

    @Transactional
    @Override
    public void remover(Estado estado) {
        estado = porId(estado.getId());
        manager.remove(estado);
    }

}
