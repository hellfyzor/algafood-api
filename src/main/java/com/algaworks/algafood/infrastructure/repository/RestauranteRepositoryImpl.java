package com.algaworks.algafood.infrastructure.repository;

import com.algaworks.algafood.domain.model.Restaurante;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

@Repository
public class RestauranteRepositoryImpl implements com.algaworks.algafood.domain.repository.RestauranteRepositoryQueries {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Restaurante> find(String nome, BigDecimal taxaFreteInicial, BigDecimal taxaFreteFinal){

        CriteriaBuilder builder = manager.getCriteriaBuilder();

        CriteriaQuery<Restaurante> criteria = builder.createQuery(Restaurante.class);
        criteria.from(Restaurante.class);

        TypedQuery<Restaurante> query = manager.createQuery(criteria);

            return query.getResultList();

    }
}
