# Projeto Full Cycle - Conversão de TypeScript para Java

## Descrição do Projeto

Este projeto é uma conversão do projeto base do curso Full Cycle de Clean Architecture, originalmente desenvolvido em TypeScript, para a linguagem Java. A conversão foi realizada com o objetivo de aproveitar os benefícios do Java, tais como desempenho, segurança, e uma ampla biblioteca de frameworks e ferramentas.

## Estrutura do Projeto

A estrutura do projeto segue os princípios da Clean Architecture, dividindo o código em camadas distintas para manter a separação de responsabilidades e facilitar a manutenção e a escalabilidade do software.

### Camadas

1. **Domain**: Contém as entidades, interfaces de repositórios, e casos de uso do negócio.
2. **Application**: Inclui os casos de uso e as regras de negócio.
3. **Infrastructure**: Implementações de repositórios, configurações, e integrações com serviços externos.
4. **Interface Adapters**: Controladores, DTOs, e outros componentes que fazem a interface entre a aplicação e os usuários (por exemplo, APIs REST).

## Tecnologias Utilizadas

- **Java 11+**: Linguagem de programação utilizada para a implementação do projeto.
- **Spring Boot**: Framework utilizado para facilitar a criação de aplicações Java.
- **JUnit**: Biblioteca de testes para Java.
- **Gradle**: Ferramenta de automação de compilação e gerenciamento de dependências.

## Requisitos

- **Java 11+**: Certifique-se de ter o Java Development Kit (JDK) 11 ou superior instalado.
- **Gradle**: Ferramenta de gerenciamento de projetos Java.

## Instalação

1. Clone o repositório para o seu ambiente local:
   ```sh
   git clone https://github.com/FredyHG/clean-architecture.git
   ```

2. Navegue até o diretório do projeto:
   ```sh
   cd clean-architecture
   ```

3. Compile e construa o projeto utilizando o Gradle:
   ```sh
   ./gradlew build
   ```

4. Execute a aplicação:
   ```sh
   ./gradlew bootRun
   ```

## Testes

Para executar os testes, utilize o seguinte comando:
```sh
./gradlew test
```

---
