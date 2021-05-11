$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/amazon/Pesquisar produtos - Amazon.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Pesquisar produto desejado",
  "description": "",
  "id": "pesquisar-produto-desejado",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "line": 29,
  "name": "Validar que produto foi adicionado ao carrinho",
  "description": "",
  "id": "pesquisar-produto-desejado;validar-que-produto-foi-adicionado-ao-carrinho",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 28,
      "name": "@CTAmazon"
    },
    {
      "line": 28,
      "name": "@CTAmazonCarrinho"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "que seja acessado o \"\u003csite\u003e\" da amazon",
  "keyword": "Dado "
});
formatter.step({
  "line": 31,
  "name": "seja preenchida a barra de pesquisa com o nome do \"\u003cproduto\u003e\" que desejo procurar",
  "keyword": "E "
});
formatter.step({
  "line": 32,
  "name": "o botao de pesquisar e pressionado",
  "keyword": "E "
});
formatter.step({
  "line": 33,
  "name": "deve ser retornado o \"\u003cproduto\u003e\" pesquisado",
  "keyword": "E "
});
formatter.step({
  "line": 34,
  "name": "e selecionado o produto desejado",
  "keyword": "E "
});
formatter.step({
  "line": 35,
  "name": "o perfil do produto e carregado",
  "keyword": "E "
});
formatter.step({
  "line": 36,
  "name": "a opcao de adicionar ao carrinho e pressionado",
  "keyword": "Quando "
});
formatter.step({
  "line": 37,
  "name": "validar que produto foi adicionado ao carrinho com sucesso",
  "keyword": "Entao "
});
formatter.examples({
  "line": 38,
  "name": "",
  "description": "",
  "id": "pesquisar-produto-desejado;validar-que-produto-foi-adicionado-ao-carrinho;",
  "rows": [
    {
      "cells": [
        "produto",
        "site"
      ],
      "line": 39,
      "id": "pesquisar-produto-desejado;validar-que-produto-foi-adicionado-ao-carrinho;;1"
    },
    {
      "cells": [
        "mi band",
        "https://www.amazon.com.br/ref\u003dnav_logo"
      ],
      "line": 40,
      "id": "pesquisar-produto-desejado;validar-que-produto-foi-adicionado-ao-carrinho;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 2871753101,
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
  "line": 40,
  "name": "Validar que produto foi adicionado ao carrinho",
  "description": "",
  "id": "pesquisar-produto-desejado;validar-que-produto-foi-adicionado-ao-carrinho;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 28,
      "name": "@CTAmazonCarrinho"
    },
    {
      "line": 28,
      "name": "@CTAmazon"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "que seja acessado o \"https://www.amazon.com.br/ref\u003dnav_logo\" da amazon",
  "matchedColumns": [
    1
  ],
  "keyword": "Dado "
});
formatter.step({
  "line": 31,
  "name": "seja preenchida a barra de pesquisa com o nome do \"mi band\" que desejo procurar",
  "matchedColumns": [
    0
  ],
  "keyword": "E "
});
formatter.step({
  "line": 32,
  "name": "o botao de pesquisar e pressionado",
  "keyword": "E "
});
formatter.step({
  "line": 33,
  "name": "deve ser retornado o \"mi band\" pesquisado",
  "matchedColumns": [
    0
  ],
  "keyword": "E "
});
formatter.step({
  "line": 34,
  "name": "e selecionado o produto desejado",
  "keyword": "E "
});
formatter.step({
  "line": 35,
  "name": "o perfil do produto e carregado",
  "keyword": "E "
});
formatter.step({
  "line": 36,
  "name": "a opcao de adicionar ao carrinho e pressionado",
  "keyword": "Quando "
});
formatter.step({
  "line": 37,
  "name": "validar que produto foi adicionado ao carrinho com sucesso",
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
  "duration": 2313837399,
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
  "duration": 369232301,
  "status": "passed"
});
formatter.match({
  "location": "PesquisarProdutoStepDef.o_botao_de_pesquisar_e_pressionado()"
});
formatter.result({
  "duration": 2249604600,
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
  "duration": 2288607599,
  "status": "passed"
});
formatter.match({
  "location": "PesquisarProdutoStepDef.e_selecionado_o_produto_desejado()"
});
formatter.result({
  "duration": 3306279401,
  "status": "passed"
});
formatter.match({
  "location": "PesquisarProdutoStepDef.o_perfil_do_produto_e_carregado()"
});
formatter.result({
  "duration": 93509301,
  "status": "passed"
});
formatter.match({
  "location": "PesquisarProdutoStepDef.a_opcao_de_adicionar_ao_carrinho_e_pressionado()"
});
formatter.result({
  "duration": 2421011300,
  "status": "passed"
});
formatter.match({
  "location": "PesquisarProdutoStepDef.validar_que_produto_foi_adicionado_ao_carrinho_com_sucesso()"
});
formatter.result({
  "duration": 308523200,
  "status": "passed"
});
formatter.after({
  "duration": 1053864900,
  "status": "passed"
});
});