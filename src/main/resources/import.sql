insert into cozinha (id, nome) values (1, 'Árabe');
insert into cozinha (id, nome) values (2, 'Brasileira');
insert into cozinha (id, nome) values (3, 'Japonesa');

insert into restaurante (nome, taxa_frete, cozinha_id) values ('Sushiloko', 18, 3);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Empório Árabe', 15.90, 1);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Bomba do Hell', 7.90, 2);

insert into forma_pagamento (descricao) values ('Pagamento será efetuado no local.');
insert into forma_pagamento (descricao) values ('Pagamento já efetuado pelo pix!');

insert into Permissao (nome, descricao) values ('login', 'sucesso');
insert into Permissao (nome, descricao) values ('login', 'negado');