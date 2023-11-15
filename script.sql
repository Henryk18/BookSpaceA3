-- CREATE DATABASE GERENCIAMENTO_DE_LIVROS

USE GERENCIAMENTO_DE_LIVROS;

CREATE USER usuário identified by 'Admin';
CREATE USER admnistrador identified by 'Admin';

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
