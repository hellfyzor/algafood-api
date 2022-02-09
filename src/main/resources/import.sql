insert into cozinha (id, nome) values (1, 'Árabe');
insert into cozinha (id, nome) values (2, 'Brasileira');
insert into cozinha (id, nome) values (3, 'Japonesa');

insert into restaurante (nome, taxa_frete, cozinha_id) values ('Kimi sushi', 18, 3);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Empório Árabe', 15.90, 1);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Bomba do Hell', 7.90, 2);

insert into forma_pagamento (descricao) values ('Pagamento será efetuado no local.');
insert into forma_pagamento (descricao) values ('Pagamento já efetuado pelo pix!');

insert into permissao (nome, descricao) values ('login', 'sucesso');
insert into permissao (nome, descricao) values ('login', 'negado');

insert into estado (nome) values ('Distrito Federal');
insert into estado (nome) values ('São Paulo');
insert into estado (nome) values ('Rio de Janeiro');

insert into cidade (nome, estado_id) values ('Taguatinga', 1);
insert into cidade (nome, estado_id) values ('Jundiaí', 2);
insert into cidade (nome, estado_id) values ('Bangú', 3);