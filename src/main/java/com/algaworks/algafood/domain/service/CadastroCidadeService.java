package com.algaworks.algafood.domain.service;

import com.algaworks.algafood.domain.exception.EntidadeEmUsoException;
import com.algaworks.algafood.domain.exception.EntidadeNaoEncontradaException;
import com.algaworks.algafood.domain.model.Cidade;
import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.model.Estado;
import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.CidadeRepository;
import com.algaworks.algafood.domain.repository.CozinhaRepository;
import com.algaworks.algafood.domain.repository.EstadoRepository;
import com.algaworks.algafood.domain.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CadastroCidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    @Autowired
    private EstadoRepository estadoRepository;

    public Cidade salvar(Cidade cidade) {
        Long cidadeId = cidade.getEstado().getId();
        Optional<Estado> estado = estadoRepository.findById(cidadeId);

        if (estado.isEmpty() ){
            throw new EntidadeNaoEncontradaException(String.format("Não existe cadastro de cidade com o código %d", cidadeId));
        }

        cidade.setEstado(estado.get());

        return cidadeRepository.save(cidade);
    }

    public void remover (Long cidadeId){
        try{
            cidadeRepository.deleteById(cidadeId);
        }  catch (EmptyResultDataAccessException e){
            throw new EntidadeNaoEncontradaException(String.format("Cozinha de código %d não encontrado, verifique o código!", cidadeId));
        }

        catch (DataIntegrityViolationException e){
            throw new EntidadeEmUsoException(String.format("Cozinha de código %d não pode ser removida, pois está em uso!", cidadeId));
        }


    }

}
