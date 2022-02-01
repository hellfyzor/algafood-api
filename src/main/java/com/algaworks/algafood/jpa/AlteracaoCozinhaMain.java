package com.algaworks.algafood.jpa;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.repository.CozinhaRepository;
import com.algaworks.algafood.model.Cozinha;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class AlteracaoCozinhaMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CozinhaRepository cadastroCozinha = applicationContext.getBean(CozinhaRepository.class);

       Cozinha cozinha = new Cozinha();
       cozinha.setId(1L);
       cozinha.setNome("Nordestina");
       cozinha = cadastroCozinha.adicionar(cozinha);

       System.out.printf("%d - %s \n", cozinha.getId(), cozinha.getNome());


    }

}
