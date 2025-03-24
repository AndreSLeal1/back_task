# 🚀 Task Manager API 

[![Java](https://img.shields.io/badge/Java-23-blue.svg)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.4.3-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![License](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)
[![Build Status](https://github.com/AndreSLeal1/task-manager-backend/actions/workflows/ci.yml/badge.svg)](https://github.com/AndreSLeal1/task-manager-backend/actions)

API RESTful para gerenciamento de tarefas com paginação, ordenação e documentação OpenAPI 3.0.

## 📌 Funcionalidades
- **CRUD Completo** de tarefas
- **Paginação & Ordenação** em listagens
- **Validações** robustas de domínio
- **Swagger UI** integrada
- **Dockerização** completa

## ⚙️ Pré-requisitos
- Java 23
- Maven 3.9+
- PostgreSQL 17+ ou Docker

## 🛠️ Configuração Rápida

### 1. Clone o repositório

```bash
git clone https://github.com/AndreSLeal1/back_task.git
cd back_task
```

### 2. Banco de Dados (PostgreSQL)
```sql
CREATE DATABASE tasks;
CREATE USER postgres WITH PASSWORD '1234';
GRANT ALL PRIVILEGES ON DATABASE tasks TO postgres;
```
### 3. Configure o application.properties
```aplication
spring.datasource.url=jdbc:postgresql://localhost:5432/tasks
spring.datasource.username=postgres
spring.datasource.password=1234
spring.jpa.hibernate.ddl-auto=update
```
### Execute com Maven
````bash
mvn spring-boot:run
````
###  Docker Compose
````bash
docker-compose up -d --build
Acessível em: http://localhost:8080
````


### 📚 Documentação da API
 - Interface Swagger UI: http://localhost:8080/swagger-ui.html
 - Documentação OpenAPI (JSON): http://localhost:8080/v3/api-docs

### endpoint
 - Método	Endpoint	Descrição
 - GET	/tasks	Lista paginada de tarefas
 - POST	/tasks	Cria nova tarefa
 - GET	/tasks/{id}	Busca tarefa por ID
 - PUT	/tasks/{id}	Atualiza tarefa existente
 - DELETE	/tasks/{id}	Remove tarefa

# Exemplo de Request
````json
{
  "titulo": "Revisar documentação",
  "descricao": "Atualizar README.md",
  "status": "EM_ANDAMENTO"
}
````
### 🧪 Testes
````bash

# Stack Tecnológico
Tecnologia	- Ferramenta
Backend	Spring Boot 3.4.3
Banco de Dados	PostgreSQL 17
Documentação	OpenAPI 3.0
Build	Maven 3.9+
Containerização	Docker + Docker Compose
````
