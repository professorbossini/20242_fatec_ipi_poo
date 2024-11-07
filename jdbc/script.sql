-- Active: 1731007942713@@127.0.0.1@5432@20242_fatec_ipi_poo_pessoas@public

SELECT * FROM tb_pessoa ORDER BY cod_pessoa ASC;
DELETE FROM tb_pessoa WHERE cod_pessoa = 2;

-- SELECT * FROM tb_pessoa;
-- UPDATE tb_pessoa SET nome='José da Silva' WHERE cod_pessoa = 1;

-- SELECT * FROM tb_pessoa WHERE nome LIKE 'J%';


-- SELECT * FROM tb_pessoa WHERE cod_pessoa = 1;

-- SELECT * FROM tb_pessoa;
-- SELECT cod_pessoa, nome, fone, email FROM tb_pessoa;
-- SELECT nome, email FROM tb_pessoa;

-- INSERT INTO tb_pessoa(nome, fone, email)
-- VALUES
-- ('João', '44774477', 'joao@email.com'),
-- ('Maria', '77889966', 'maria@email.com');

-- INSERT INTO tb_pessoa(nome, fone, email)
-- VALUES ('José', '11223344', 'jose@email.com');


-- CREATE TABLE tb_pessoa(
--   cod_pessoa SERIAL PRIMARY KEY,
--   nome VARCHAR(200),
--   fone VARCHAR(200),
--   email VARCHAR(200)
-- );
