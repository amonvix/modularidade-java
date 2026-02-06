## Architecture overview

This repository represents a single modular system split into multiple JPMS modules:

- `app-api-publica`  
  Defines public contracts (interfaces) shared between modules.

- `app-calculo`  
  Implements business logic and provides a concrete implementation of the public API.

- `app-financeiro`  
  Consumes the public API using `ServiceLoader`, enabling loose coupling and plugin-like behavior.

- `app-logging`  
  Cross-cutting logging module shared across implementations.

The system demonstrates how to design a modular Java application with:
- clear contracts
- decoupled implementations
- dynamic service loading
- strict module encapsulation
