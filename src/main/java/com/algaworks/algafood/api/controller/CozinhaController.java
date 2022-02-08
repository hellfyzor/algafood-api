package com.algaworks.algafood.api.controller;

import com.algaworks.algafood.domain.repository.CozinhaRepository;
import com.algaworks.algafood.model.Cozinha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<Cozinha> porId(@PathVariable Long cozinhaId){

        Cozinha cozinha = cozinhaRepository.porId(cozinhaId);

        if (cozinha != null){
            return ResponseEntity.ok().body(cozinha);
        }

        return ResponseEntity.notFound().build();

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cozinha adicionar (@RequestBody Cozinha cozinha){
        return cozinhaRepository.adicionar(cozinha);
    }

}
