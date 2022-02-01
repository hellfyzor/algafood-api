package com.algaworks.algafood.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Cozinha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;
}
