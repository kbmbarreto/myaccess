# MyAccess

<p>Sistema para armazenamento e gerenciamento de senhas.</p>

## Ferramentas utilizadas

- Kotlin
- Maven
- Spring Framework
- H2 database
- JUnit
- Swagger 2

## Preparação do ambiente
Para rodar o projeto, utlize a IDE que você mais se identifique **(no meu caso, utilizo o IntelliJ)**, em seguida, altere o arquivo **application.properties** para que o projeto se adeque ao seu servidor de **banco de dados**:

**Exemplo do arquivo application.properties**:

````java
## Application port
server.port=8001

## default connection pool
spring.datasource.hikari.connectionTimeout=20000
spring.datasource.hikari.maximumPoolSize=5

## Configurações do H2 database
spring.datasource.url=jdbc:h2:mem:db;DB_CLOSE_DELAY=-1;INIT=CREATE SCHEMA IF NOT EXISTS myaccess
spring.datasource.username=sa
spring.datasource.password=sa
spring.datasource.driver-class-name=org.h2.Driver
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
````

Em seguida, basta criar um banco de dados no MySql com o comando `Create schema {Nome do banco de dados}`

## Tutoriais úteis para configurar sua estação de trabalho.

- [Configurar variáveis de ambiente JAVA](https://mauriciogeneroso.medium.com/configurando-java-4-como-configurar-as-vari%C3%A1veis-java-home-path-e-classpath-no-windows-46040950638f)
- [Configurar variáveis de ambiente MAVEN](https://pt.stackoverflow.com/questions/259927/como-configurar-vari%C3%A1veis-de-ambiente-maven-java)
- [Documentação da API (disponivel com o servidor rodando)](http://localhost:8001/myaccess/v1/swagger-ui.html#)
