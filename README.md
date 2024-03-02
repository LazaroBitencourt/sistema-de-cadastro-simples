# Projeto de API Simples para Cadastro de Usuários

## Descrição

Este projeto consiste em uma API simples para realizar o cadastro de usuários. A aplicação foi desenvolvida utilizando a linguagem de programação Java, com o framework Spring Boot, que oferece uma estrutura robusta e eficiente para a construção de aplicativos Java.

A API permite a execução das operações básicas de criação, leitura, atualização e exclusão (CRUD) de registros de usuários em um banco de dados. Além disso, ela oferece a funcionalidade de buscar usuários pelo nome.

## Tecnologias Utilizadas

- **Java:** Linguagem de programação principal.
- **Spring Boot:** Framework que simplifica o desenvolvimento de aplicativos Java, fornecendo uma configuração pré-definida e facilitando a criação de APIs RESTful.
- **Spring Data JPA:** Facilita o acesso a dados com o padrão de mapeamento objeto-relacional (ORM) para interação com o banco de dados.
- **Banco de Dados:** Pode ser escolhido de acordo com as necessidades, como MySQL, PostgreSQL, H2 (para ambientes de desenvolvimento) etc.
- **Maven:** Gerenciador de dependências utilizado para a construção do projeto.
- **Swagger:** Ferramenta de documentação que facilita a compreensão e teste das APIs.

## Funcionalidades

1. **Cadastro de Usuários:** Permite a criação de novos registros de usuários, fornecendo informações como nome, e-mail, senha, entre outros.

2. **Listagem de Usuários:** Recupera a lista completa de usuários cadastrados no sistema.

3. **Atualização de Usuários:** Possibilita a atualização dos dados de um usuário específico.

4. **Exclusão de Usuários:** Permite a remoção de um usuário do sistema.

5. **Busca por Nome:** Recupera uma lista de usuários que contenham o nome fornecido na busca.

## Documentação

A documentação da API pode ser acessada através do Swagger, que fornece uma interface interativa para testar os endpoints e entender os parâmetros necessários para cada operação. Acesse [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) após iniciar a aplicação.

A aplicação estará disponível em [http://localhost:8080](http://localhost:8080).

Lembre-se de configurar as informações do banco de dados no arquivo `application.properties` ou `application.yml` de acordo com a sua escolha de banco de dados.

## Considerações Finais

Este projeto serve como uma base simples para desenvolvimento de APIs em Java com Spring Boot. Pode ser expandido com novas funcionalidades, melhorias de segurança, entre outros aspectos, de acordo com os requisitos específicos do seu aplicativo.

## Estado do Projeto

Atualmente, este projeto encontra-se em fase de desenvolvimento ativo. Novas funcionalidades estão sendo implementadas, e melhorias estão sendo realizadas regularmente. 
