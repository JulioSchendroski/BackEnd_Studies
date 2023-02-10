# **DESIGN PATTERNS**
<!-- ![tret](imgs/ds_patterns.png) -->
Intenção | Padrões
---------|----------
Interfaces      | Adpater, Facade, Composite
Responsabilidade      | Singleton, Observer, Mediator, Chain of Responsability
Construção      | Builder, Factory, Abstract Factory
Operações      | Strategy, Command, Interpreter
Extensões | Decorator, Iterator, Visitor

### **Strategy :**
Strategy permite que os algoritmos mudem independentemente entre os clientes que os utilizam.

* Padrão **Comportamental**.
* Quando precisa encapsular algoritmos similares para tomar alguma decisão.

Existem três entidades dentro do Strategy:
1. Estratégia (Interface)
2. Estratégia Concreta (Implementação do contrato da interface)
3. Contexto (Quem utiliza a estratégia)

![Estrutura Strategy](imgs/strategy1.png)

Quando usar?
* Classes relacionadas forem diferentes **apenas** no **comportamento**.
* Quando uma classe define muitos **comportamentos**, e estes aparecem na forma de **condicional** em suas operações.

### **Factory :**
Factory Method permite que uma classe delegue a responsabilidade de instanciamento às subclasses

* Design Pattern de **Construção**.
* Desacopla o cliente dos tipos de produtos específicos.
*Remove da classe cliente todo conhecimento sobre as subclasses de produtos.
* Estende o programa de forma dinâmica.
* *Consequência negativa* → Aumenta o número de classes do sistema.

![Estrutura Facotry](imgs/factory.png)


### **Abstract Factory :**
* Design Pattern de **Criação**.
* É uma Factory Method, porém composto por **múltiplas Factory Methods**.
* Visa agrupar família de produtos compativeis compativeis, criando assim uma factory divida por grupos.

Algumas consequência são levadas em conta, dentre delas:
* *Positivas* → Os produtos sempre são compatíveis, aplicação do Open-Closed (SOLID), e aplicação do Single Responsibility Principle (SOLID) ou seja, o código que cria está separado do que usa.
* *Negativos* → Muitas classes e maior complexidade.

![Estrutura Abs.Facotry](imgs/abs_factory.png)

### **Reflection :**
Vale notar que Reflection **não é considerado um Design Pattern.**
* Manipulador de classes, obter informações de classes, etc…
* Utilizado em tempo de execução do programa.

### **Dep. Injection :**
Podemos dizer que a injeção de dependência é uma inversão de controle, uma vez que não mais seu business realiza a instanciação de classes, mas sim quem está consumindo a classes, passando a responsabilidade de definir qual instância será utilizada para um “agente externo”.

* Uso benéfico de interfaces.
* Menor acoplamento.
* Um objeto implementar várias interfaces, ou seja, várias dependências injetadas.
* Facilita evolução do objeto.

![Estrutura Dep.Inject](imgs/dep_inject.png)


### **Chain Of Responsibility :**
* É usado quando uma requisição precisa passar por uma **sequência de operações** até ser totalmente tratada.
* Desacopla quem envia a requisição de quem vai tratar a requisição.
* Muito utilizado em requisição HTTP.

![Estrutura Chain.Resp](imgs/chain_of_resp.png)



# **ECOSISTEMA SPRING**
Spring Boot é uma ferramenta que nasceu do framework Spring, baseado em design patterns de inversão de controle e injeção de dependência. 

No geral, ele fornece a maioria dos componentes necessários em aplicações em geral de maneira pré-configurada, possibilitando uma aplicação rodando em produção rapidamente, com o esforço mínimo de configuração e implantação.
Em outras palavras, podemos entender o Spring Boot como um template pré-configurado para desenvolvimento e execução de aplicações baseadas no Spring.

* Oferecer uma experiência de início de projeto rápida e direta.
* Apresentar uma visão opinativa e flexível sobre o modo como os projetos Spring devem ser configurados.
* Fornecer requisitos não funcionais pré-configurados.
* Não prover geração de código e zerar a necessidade de arquivos XML.

Dentre o Spring framework, pode-se dividir em 7 grupos

* Core Container;
* Data Access/Integration;
* Web;
* Aspect Oriented Programming (AOP);
* Instrumentation;
* Messaging;
* Test;

![Estrutura Spring.Container](imgs/spring_contanier.png)

Core Container → Responsáveis por conter funcionalidades fundamentais como classes básicas e avançadas, assim como configurações por anotações ou XML.

Data Access / Integration → Funcionalidades para transação com banco de dados.

Web → Recursos web como implementação de MVC, Web Services, REST.

Módulo AOP → Implementação para programação orientada a aspectos, em resumo, mensageria de microsserviços.

Test → Testes unitários utilizando JUnit, e testes de integração.

### **Beans :** 
Dentro do Spring Framework, faz-se utilização da injeção de dependência, na qual a implementação está presente no Core Container. Quando a aplicação é executada, as configurações pré-definidas em classes ou arquivos XML são lidas e criadas através da inversão de controle, sendo criadas e destruídas durante a execução do projeto. Essas dependências são chamadas de Beans dentro do contexto Spring.

![Estrutura Bean.Life](imgs/bean_life.png)