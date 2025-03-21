CREATE TABLE tasks (
    id UUID PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    descricao VARCHAR(255),
    status VARCHAR(50) NOT NULL,
    data_criacao TIMESTAMP NOT NULL,
    data_conclusao TIMESTAMP
);
