# Baozi Store – API REST

Trabalho de Desenvolvimento Web Back-End (UNINTER).
API REST simples para controle de **clientes**, **produtos** e **pedidos** de uma loja de pãozinho chinês.

**Tecnologias:** Java 17, Spring Boot 3, Spring Data JPA, H2 (padrão) ou MySQL, Postman.

## Como executar

Requisitos: JDK 17+ e Maven (ou abra a pasta no IntelliJ / VS Code / Eclipse e rode `BaoziStoreApplication`).

```bash
mvn spring-boot:run
```

A API sobe em `http://localhost:8080`. Console do H2 em `http://localhost:8080/h2-console`
(JDBC URL: `jdbc:h2:mem:baozidb`, usuário `sa`, senha vazia).

Para usar MySQL, veja o bloco comentado em `src/main/resources/application.properties`.

## Estrutura

```
src/main/java/com/baozistore
├── BaoziStoreApplication.java
├── model        -> Cliente, Produto, Pedido (entidades JPA)
├── repository   -> ClienteRepository, ProdutoRepository, PedidoRepository
├── controller   -> ClienteController, ProdutoController, PedidoController
└── dto          -> PedidoRequest
```

## Endpoints

| Recurso   | POST        | GET (todos) | GET por ID        | PUT (opcional)    | DELETE            |
|-----------|-------------|-------------|-------------------|-------------------|-------------------|
| Clientes  | `/clientes` | `/clientes` | `/clientes/{id}`  | `/clientes/{id}`  | `/clientes/{id}`  |
| Produtos  | `/produtos` | `/produtos` | `/produtos/{id}`  | `/produtos/{id}`  | `/produtos/{id}`  |
| Pedidos   | `/pedidos`  | `/pedidos`  | `/pedidos/{id}`   | `/pedidos/{id}`   | `/pedidos/{id}`   |

### Exemplos de corpo JSON

Cliente: `{ "nome": "Joao5178152", "clienteDesde": "2026-11-09" }`
Produto: `{ "nome": "Baozi de Carne", "preco": 8.50, "estoque": true }`
Pedido:  `{ "clienteId": 1, "produtoId": 1, "quantidade": 6 }`

## Postman

Importe `postman/BaoziStore.postman_collection.json` (Import > arquivo). Troque `Joao5178152` pelo seu nome + RU
no request "POST Cliente" antes de enviar.
