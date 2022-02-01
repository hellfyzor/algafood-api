package com.algaworks.algafood.jpa;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.repository.CozinhaRepository;
import com.algaworks.algafood.model.Cozinha;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class InclusaoCozinhaMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CozinhaRepository cadastroCozinha = applicationContext.getBean(CozinhaRepository.class);

       Cozinha cozinha1 = new Cozinha();
       cozinha1.setNome("Brasileira");

        Cozinha cozinha2 = new Cozinha();
        cozinha2.setNome("Chinesa");

        Cozinha cozinha3 = new Cozinha();
        cozinha3.setNome("Árabe");

        cozinha1 = cadastroCozinha.adicionar(cozinha1);
        cozinha2 = cadastroCozinha.adicionar(cozinha2);
        cozinha3 = cadastroCozinha.adicionar(cozinha3);


        System.out.printf("%d - %s \n", cozinha1.getId(), cozinha1.getNome());
        System.out.printf("%d - %s \n", cozinha2.getId(), cozinha2.getNome());
        System.out.printf("%d - %s \n", cozinha3.getId(), cozinha3.getNome());


    }

}
