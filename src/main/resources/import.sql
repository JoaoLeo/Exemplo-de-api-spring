/* arquivo para popular o banco h2 na hora da criação */

insert into tb_departamento (nome) values ('tech');
insert into tb_departamento (nome) values ('moveis');

insert into tb_produto (nome, preco, fk_id_departamento) values ('pc gamer', 4000, 1);
insert into tb_produto (nome,  preco, fk_id_departamento) values ('mesa', 850, 2);