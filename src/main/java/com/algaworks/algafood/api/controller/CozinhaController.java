package com.algaworks.algafood.api.controller;

import com.algaworks.algafood.domain.repository.CozinhaRepository;
import com.algaworks.algafood.model.Cozinha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cozinhas")
public class CozinhaController {

    @Autowired
    private CozinhaRepository cozinhaRepository;

    @GetMapping
    public List<Cozinha> todas(){

        return cozinhaRepository.todas();
    }

    @GetMapping("/{cozinhaId}")
    public Cozinha porId(@PathVariable Long cozinhaId){

        return cozinhaRepository.porId(cozinhaId);
    }

}
