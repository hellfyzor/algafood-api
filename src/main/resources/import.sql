insert into cozinha (id, nome) values (1, 'Árabe');
insert into cozinha (id, nome) values (2, 'Brasileira');
insert into cozinha (id, nome) values (3, 'Japonesa');

insert into restaurante (nome, taxa_frete, cozinha_id) values ('Kimi sushi', 18, 3);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Empório Árabe', 15.90, 1);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Bomba do Hell', 7.90, 2);

insert into estado (nome) values ('Distrito Federal');
insert into estado (nome) values ('São Paulo');
insert into estado (nome) values ('Rio de Janeiro');

insert into cidade (nome, estado_id) values ('Taguatinga', 1);
insert into cidade (nome, estado_id) values ('Jundiaí', 2);
insert into cidade (nome, estado_id) values ('Bangú', 3);

insert into forma_pagamento (id, descricao) values (1, 'Cartão de Crédito');
insert into forma_pagamento (id, descricao) values (2, 'Cartão de Débito');
insert into forma_pagamento (id, descricao) values (3, 'Dinheiro');

insert into permissao (id, nome, descricao) values (1, 'CONSULTAR_COZINHAS', 'Permite Consultar cozinhas');
insert into permissao (id, nome, descricao) values (2, 'EDITAR_COZINHAS', 'Permite editar cozinhas');

insert into restaurante_forma_pagamento (restaurante_id, forma_pagamento_id) values (1, 1), (1, 2), (1, 3), (2, 3), (3, 2), (3, 3);
