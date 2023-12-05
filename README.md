Introdução
=
---
<h4>Projeto pessoal de estudo em automação de testes web. </h4>

Utiliza o <b> selenium </b> para navegar pelas páginas web, o <b> AssertJ </b> para validar as informações presentes
e ao final da execução utiliza o <b> ExtentReport </b> para gerar um relatório com o status dos teste, captura 
de tela e em caso de falha o motivo do mesmo.

Requisitos
=
---
* Java 11
* Maven 3.9.4
* ChromeDriver (Versão mais recente do seu navegador)
* FirefoxDriver (Versão mais recente do seu navegador)

Ferramentas
=
---
* Java
* Maven
* Lombok
* Selenium
* AssertJ
* ExtentReport
* Jacoco
* Cucumber
* Junit

Setup
=
---
 Utilize o arquivo <b> src/test/resources/definitions.properties </b> para definir caminhos de arquivos e 
 comportamentos do projeto.

Execução
=
---
Para rodar apenas os testes unitários utilize: 
````
mvn clean test
````

Para rodar os testes de integração utilize:
````
mvn clean verify "-DskipUnitTests=false"
````

Cobertura/Relatório
=
---
Teste unitário: 
````
target/site/jacoco/index.html
````
Teste de integração: 
`````
target/relatorio-extent.html
`````

