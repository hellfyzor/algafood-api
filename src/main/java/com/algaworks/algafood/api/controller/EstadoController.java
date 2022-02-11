package com.algaworks.algafood.api.controller;

import com.algaworks.algafood.domain.exception.EntidadeNaoEncontradaException;
import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.EstadoRepository;
import com.algaworks.algafood.domain.model.Estado;
import com.algaworks.algafood.domain.service.CadastroEstadoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estados")
public class EstadoController {

    @Autowired
    private EstadoRepository estadoRepository;

    @Autowired
    private CadastroEstadoService cadastroEstadoService;

    @GetMapping
    public List<Estado> todas(){
        return estadoRepository.todas();
    }

    @GetMapping("/{estadoId}")
    public Estado porId(@PathVariable Long estadoId){

        return estadoRepository.porId(estadoId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Estado adicionar (@RequestBody Estado estado){
        return estadoRepository.salvar(estado);
    }

    @PutMapping("/{estadoId}")
    public ResponseEntity<?> atualizar(@PathVariable Long estadoId, @RequestBody Estado estado) {
        try {
            Estado estadoAtual = estadoRepository.porId(estadoId);

            if (estadoAtual != null) {
                BeanUtils.copyProperties(estado, estadoAtual, "id");

                cadastroEstadoService.salvar(estadoAtual);

                return ResponseEntity.ok(estadoAtual);
            }
        } catch (EntidadeNaoEncontradaException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }

        return ResponseEntity.notFound().build();
    }

}
