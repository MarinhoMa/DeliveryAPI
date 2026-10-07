# Delivery API

API REST para gestão de delivery, construída com Java 21 e Spring Boot 4.1.1.

## Visão geral

A aplicação fornece recursos para:
- autenticação e cadastro de usuários
- gerenciamento de clientes
- cadastro e consulta de restaurantes
- cadastro e consulta de produtos
- criação, cálculo e acompanhamento de pedidos
- endpoints de health check e observabilidade

## Stack

- Java 21
- Spring Boot 4.1.1
- Spring Web
- Spring Security
- Spring Data JPA
- H2 Database
- Actuator
- JWT
- Swagger/OpenAPI
- Maven

## Requisitos

- Java 21
- Maven 3.9+
- (opcional) Docker + Docker Compose

## Executar localmente

Na raiz do projeto:

```bash
./mvnw spring-boot:run
```

A aplicação ficará disponível em:
- http://localhost:8080
- http://localhost:8080/actuator/health
- http://localhost:8080/swagger-ui/index.html

## Variáveis de ambiente

```bash
JWT_SECRET=myVerySecureDefaultSecretKeyForLocalDevelopment123456
JWT_EXPIRATION=86400000
MANAGEMENT_TRACING_ENABLED=false
```

## Testes

```bash
./mvnw test
```

## Docker

O projeto também inclui suporte ao Docker Compose:

```bash
docker compose up --build
```

## Endpoints principais

### Autenticação
- POST /api/auth/login
- POST /api/auth/register
- GET /api/auth/me

### Clientes
- POST /clientes
- GET /clientes
- GET /clientes/{id}
- PUT /clientes/{id}
- PATCH /clientes/{id}/status
- GET /clientes/email/{email}

### Restaurantes
- POST /api/restaurantes
- GET /api/restaurantes
- GET /api/restaurantes/{id}
- PUT /api/restaurantes/{id}
- PATCH /api/restaurantes/{id}/status

### Produtos
- POST /api/produtos
- GET /api/produtos/{id}
- PUT /api/produtos/{id}
- DELETE /api/produtos/{id}

### Pedidos
- POST /api/pedidos
- GET /api/pedidos/{id}
- GET /api/pedidos
- PATCH /api/pedidos/{id}/status
- DELETE /api/pedidos/{id}

### Monitoramento
- GET /health
- GET /info
- GET /actuator/health

## Observações

- Para desenvolvimento local, o Redis e o Zipkin ficam desativados por padrão.
- O banco usado em desenvolvimento é H2 em memória.
