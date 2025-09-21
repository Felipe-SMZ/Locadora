Claro, Felipe! Aqui está o conteúdo completo do `README.md` para o seu projeto da Locadora de Filmes com Spring Boot. Você pode copiar e colar diretamente no arquivo `README.md` na raiz do seu projeto:

```markdown
# 🎬 Locadora de Filmes

Este projeto é uma API REST desenvolvida com **Spring Boot** para gerenciar uma locadora de filmes. Ele permite cadastrar filmes, tipos de filme (como ação, comédia, etc.), e clientes com CPF validado.

---

## 🚀 Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate Validator
- H2 Database (para testes)
- Maven

---

## 📦 Funcionalidades

- Cadastro, listagem, atualização e exclusão de **filmes**
- Cadastro e gerenciamento de **tipos de filme**
- Cadastro de **clientes** com validação de CPF
- Relacionamento entre filmes e tipos (`@ManyToOne`)
- Validação de campos obrigatórios com `@NotNull`, `@Valid` e `@CPF`

---

## 📂 Estrutura do projeto

```
src/
├── main/
│   ├── java/com/locadora/
│   │   ├── model/        # Entidades JPA
│   │   ├── repository/   # Repositórios Spring Data
│   │   └── controller/   # Controllers REST
│   └── resources/
│       └── application.properties
└── README.md
```

---

## 🔧 Como executar

1. Clone o projeto:
   ```bash
   git clone https://github.com/seu-usuario/locadora.git
   cd locadora
   ```

2. Execute com Maven:
   ```bash
   ./mvnw spring-boot:run
   ```

3. Acesse a API:
   ```
   http://localhost:8080
   ```

---

## 📮 Endpoints principais

### 🎬 Filmes
- `GET /filmes` → Lista todos os filmes
- `POST /filmes` → Cria um novo filme
- `PUT /filmes/{id}` → Atualiza um filme existente
- `DELETE /filmes/{id}` → Remove um filme

### 🏷️ Tipos
- `GET /tipos` → Lista os tipos de filme
- `POST /tipos` → Cria um novo tipo
- `DELETE /tipos/{id}` → Remove um tipo

### 👤 Clientes
- `GET /clientes` → Lista todos os clientes
- `POST /clientes` → Cria um novo cliente
- `PUT /clientes/{id}` → Atualiza um cliente
- `DELETE /clientes/{id}` → Remove um cliente

---

## 👤 Autor

**Felipe S.**  
Cotia, São Paulo — Brasil 🇧🇷  
Projeto acadêmico para fins de estudo e prática com Spring Boot.
```

Se quiser, posso te ajudar a adicionar instruções para deploy em produção, conexão com banco MySQL ou até gerar uma versão em inglês. Quer deixar ele mais robusto?