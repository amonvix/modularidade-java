# Java Modular (JPMS)

Projeto de arquitetura modular em Java usando JPMS para separar contratos, implementações e consumidores de forma desacoplada.

Demonstra:

- contratos públicos bem definidos
- implementações desacopladas
- carregamento dinâmico de serviços com ServiceLoader
- encapsulamento forte entre módulos

---

## Architecture overview

This repository represents a single modular system split into multiple JPMS modules:

### [app-api-publica](https://github.com/amonvix/modularidade-java/tree/main/app-api-publica)

Defines public contracts (interfaces) shared between modules.

### [app-calculo](https://github.com/amonvix/modularidade-java/tree/main/app-calculo)

Implements business logic and provides a concrete implementation of the public API.

### [app-financeiro](https://github.com/amonvix/modularidade-java/tree/main/app-financeiro)

Consumes the public API using `ServiceLoader`, enabling loose coupling and plugin-like behavior.

### [app-logging](https://github.com/amonvix/modularidade-java/tree/main/app-logging)

Cross-cutting logging module shared across implementations.

The system demonstrates how to design a modular Java application with:

- clear contracts
- decoupled implementations
- dynamic service loading
- strict module encapsulation
