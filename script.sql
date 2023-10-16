-- CREATE DATABASE GERENCIAMENTO_DE_LIVROS

USE GERENCIAMENTO_DE_LIVROS;

CREATE USER usuário identified by 'biblioteca123';
CREATE USER admnistrador identified by 'adm2023';

CREATE TABLE usuários(
	id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    idade INT NOT NULL,
	sexo VARCHAR(255) NULL,
    livro_preferido1 VARCHAR(255) NULL,
    livro_preferido2 VARCHAR(255) NULL,
    primary key(id)
);

CREATE TABLE administrador(
	id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
	sobrenome VARCHAR(255) NOT NULL,
    cargo VARCHAR(255) NOT NULL,
    primary key(id)
);
