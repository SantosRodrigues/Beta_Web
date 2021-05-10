$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/amazon/Pesquisar produtos - Amazon.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Pesquisar lista de produto desejado",
  "description": "",
  "id": "pesquisar-lista-de-produto-desejado",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Pesquisar produto que esteja disponivel",
  "description": "",
  "id": "pesquisar-lista-de-produto-desejado;pesquisar-produto-que-esteja-disponivel",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 7,
      "name": "@CTAmazon"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "que seja acessado o \"\u003csite\u003e\" da amazon",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "seja preenchida a barra de pesquisa com o nome do \"\u003cproduto\u003e\" que desejo procurar",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "o botao de pesquisar e pressionado",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "deve ser retornado o \"\u003cproduto\u003e\" pesquisado",
  "keyword": "Entao "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "pesquisar-lista-de-produto-desejado;pesquisar-produto-que-esteja-disponivel;",
  "rows": [
    {
      "cells": [
        "produto",
        "site"
      ],
      "line": 14,
      "id": "pesquisar-lista-de-produto-desejado;pesquisar-produto-que-esteja-disponivel;;1"
    },
    {
      "cells": [
        "mi band",
        "https://www.amazon.com.br/ref\u003dnav_logo"
      ],
      "line": 15,
      "id": "pesquisar-lista-de-produto-desejado;pesquisar-produto-que-esteja-disponivel;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 2136352000,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Buscar pelo produto desejado para realizar a compra",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.scenario({
  "line": 15,
  "name": "Pesquisar produto que esteja disponivel",
  "description": "",
  "id": "pesquisar-lista-de-produto-desejado;pesquisar-produto-que-esteja-disponivel;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 7,
      "name": "@CTAmazon"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "que seja acessado o \"https://www.amazon.com.br/ref\u003dnav_logo\" da amazon",
  "matchedColumns": [
    1
  ],
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "seja preenchida a barra de pesquisa com o nome do \"mi band\" que desejo procurar",
  "matchedColumns": [
    0
  ],
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "o botao de pesquisar e pressionado",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "deve ser retornado o \"mi band\" pesquisado",
  "matchedColumns": [
    0
  ],
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.amazon.com.br/ref\u003dnav_logo",
      "offset": 21
    }
  ],
  "location": "PesquisarProdutoStepDef.que_seja_acessado_o_site_da_amazon(String)"
});
formatter.result({
  "duration": 1415348300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mi band",
      "offset": 51
    }
  ],
  "location": "PesquisarProdutoStepDef.seja_preenchida_a_barra_de_pesquisa_com_o_nome_do_produto_que_desejo_procurar(String)"
});
formatter.result({
  "duration": 190834600,
  "status": "passed"
});
formatter.match({
  "location": "PesquisarProdutoStepDef.o_botao_de_pesquisar_e_pressionado()"
});
formatter.result({
  "duration": 1429279000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mi band",
      "offset": 22
    }
  ],
  "location": "PesquisarProdutoStepDef.deve_ser_retornado_o_produto_pesquisado(String)"
});
formatter.result({
  "duration": 1673616400,
  "status": "passed"
});
formatter.after({
  "duration": 1197236300,
  "status": "passed"
});
});