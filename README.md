## Link para a vizualização da documentação local:
 ** Interface Swagger UI: http://localhost:8080/swagger-ui.html
 ** Documentação OpenAPI (JSON): http://localhost:8080/v3/api-docs

## Rotas
 - curl -X POST http://localhost:8080/tasks -H "Content-Type: application/json" -d '{"titulo":"Database","descricao":"", "status":""}'
 - curl -X GET http://localhost:8080/tasks
 - curl -X GET http://localhost:8080/tasks/{id}
 - curl -X PUT http://localhost:8080/tasks/{id} -H "Content-Type: application/json" -d '{"descricao":"Atualizado","concluida":true}'
 - curl -X DELETE http://localhost:8080/tasks/{id}
