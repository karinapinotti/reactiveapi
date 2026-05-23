# Reactive API — Spring WebFlux Study Project

Projeto desenvolvido para estudo de APIs reativas utilizando Spring WebFlux e programação reativa com Reactor.

## Objetivo

Demonstrar na prática:

* construção de APIs reativas
* uso de `Mono` e `Flux`
* programação não bloqueante
* integração com Spring WebFlux
* operações assíncronas em aplicações Java

---

# Tecnologias Utilizadas

* Java 17+
* Spring Boot
* Spring WebFlux
* Project Reactor
* Maven
* Lombok
* MongoDB (caso utilizado no projeto)

---

# Conceitos Aplicados

## API Reativa

A aplicação utiliza programação reativa para lidar com operações assíncronas e não bloqueantes.

Principais benefícios:

* melhor escalabilidade
* menor bloqueio de threads
* melhor uso de recursos
* suporte a alta concorrência

---

# Reactor

## Mono

Representa:

* 0 ou 1 resultado

Exemplo:

```java
Mono<Usuario>
```

---

## Flux

Representa:

* múltiplos resultados

Exemplo:

```java
Flux<Usuario>
```

---

# Estrutura do Projeto

```text
src
 ├── controller
 ├── service
 ├── repository
 ├── model
 └── config
```

### Camadas

| Camada     | Responsabilidade        |
| ---------- | ----------------------- |
| Controller | Exposição dos endpoints |
| Service    | Regras de negócio       |
| Repository | Acesso aos dados        |
| Model      | Entidades da aplicação  |

---

# Funcionalidades

* Criar registros
* Buscar registros
* Atualizar registros
* Remover registros
* Fluxos reativos com WebFlux
* Retornos assíncronos usando Mono e Flux

---

# Como Executar o Projeto

## Clonar repositório

```bash
git clone https://github.com/karinapinotti/reactiveapi.git
```

---

## Entrar no diretório

```bash
cd reactiveapi
```

---

## Executar aplicação

### Maven Wrapper

Linux/Mac:

```bash
./mvnw spring-boot:run
```

Windows:

```bash
mvnw.cmd spring-boot:run
```

---

# Configuração

## application.properties

Configure:

```properties
spring.data.mongodb.uri=
server.port=8080
```

Caso utilize banco diferente, ajuste conforme necessário.

---

# Endpoints

Exemplo:

| Método | Endpoint  | Descrição         |
| ------ | --------- | ----------------- |
| GET    | /api      | Lista registros   |
| GET    | /api/{id} | Busca por ID      |
| POST   | /api      | Cria registro     |
| PUT    | /api/{id} | Atualiza registro |
| DELETE | /api/{id} | Remove registro   |

---

# Exemplo de Retorno Reativo

```java
@GetMapping
public Flux<Usuario> listar() {
    return service.listar();
}
```

---

# Diferença entre Spring MVC e WebFlux

| Spring MVC            | Spring WebFlux |
| --------------------- | -------------- |
| Bloqueante            | Não bloqueante |
| Thread por requisição | Event Loop     |
| Síncrono              | Assíncrono     |
| RestTemplate          | WebClient      |

---

# Objetivo Acadêmico

Este projeto foi criado com foco em:

* aprendizado de APIs reativas
* entendimento do Spring WebFlux
* prática com Reactor
* estudo de arquitetura reativa

---
