# API REST com Spring Boot

[Gravação de tela de 2024-10-16 20-40-51.webm](https://github.com/user-attachments/assets/1f406566-4352-4c58-9263-63dddad033e3)


### Introdução
### Neste projeto, embarquei na jornada de construção de uma API REST básica utilizando Spring Boot. O objetivo principal era consolidar meus conhecimentos em desenvolvimento de APIs e explorar as facilidades oferecidas pelo Spring Boot.

### **Tecnologias Utilizadas**
* **Java:** Linguagem de programação principal.
* **Spring Boot:** Framework para desenvolvimento de aplicações Java.
* **Maven:** Ferramenta de gerenciamento de dependências.
* **IDE:** IntelliJ IDEA

### Funcionalidades
A API criada neste projeto possui as seguintes funcionalidades básicas:
* **Criação de registros:** A API permite que você crie novos registros.
* **Leitura de registros:** A API permite que você leia os registros existentes.
* **Atualização de registros:** A API permite que você atualize os registros existentes.
* **Exclusão de registros:** A API permite que você exclua os registros existentes.

### Utilizando a API
Para interagir com a API, você pode utilizar ferramentas como Postman, curl ou um navegador.

### Endpoints:

* **GET /[tarefas]:** Retorna uma lista de todos os [recursos].
* localhost:8080/tarefas
* **POST /[recurso]:** Cria um novo [recurso].
* localhost:8080/tarefas
* **GET /[recurso}/{id}:** Retorna um [recurso] específico.
* localhost:8080/tarefas/2
* **PUT /[recurso}/{id}:** Atualiza um [recurso] específico.
* localhost:8080/tarefas/1
* **DELETE /[recurso}/{id}:** Deleta um [recurso] específico.
* localhost:8080/tarefas/1

A arquitetura utilizada nesta aplicação é MVC (Model-View-Controller). Isso significa que a aplicação é dividida em três camadas:

* **Model:** Esta camada é responsável por representar os dados da aplicação.
* **View:** Esta camada é responsável por apresentar os dados ao usuário.
* **Controller:** Esta camada é responsável por controlar o fluxo de dados entre o modelo e a visualização. Esta arquitetura é uma boa escolha para aplicações web porque permite que os desenvolvedores se concentrem em uma única tarefa de cada vez. Isso torna a aplicação mais fácil de desenvolver, testar e manter.

