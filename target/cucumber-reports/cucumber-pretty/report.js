$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/amazon/Pesquisar produto - Amazon.feature");
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
  "line": 8,
  "name": "Validar que o produto esteja disponivel",
  "description": "",
  "id": "pesquisar-produto-desejado;validar-que-o-produto-esteja-disponivel",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 7,
      "name": "@CTWeb"
    },
    {
      "line": 7,
      "name": "@CTAmazon"
    },
    {
      "line": 7,
      "name": "@CTAmazonProdutoDisponivel"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "que seja acessado o site da amazon",
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
  "id": "pesquisar-produto-desejado;validar-que-o-produto-esteja-disponivel;",
  "rows": [
    {
      "cells": [
        "produto"
      ],
      "line": 14,
      "id": "pesquisar-produto-desejado;validar-que-o-produto-esteja-disponivel;;1"
    },
    {
      "cells": [
        "mi band"
      ],
      "line": 15,
      "id": "pesquisar-produto-desejado;validar-que-o-produto-esteja-disponivel;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 2283017600,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Buscar pelo produto desejado para adicionar ao carrinho",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.scenario({
  "line": 15,
  "name": "Validar que o produto esteja disponivel",
  "description": "",
  "id": "pesquisar-produto-desejado;validar-que-o-produto-esteja-disponivel;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 7,
      "name": "@CTAmazonProdutoDisponivel"
    },
    {
      "line": 7,
      "name": "@CTAmazon"
    },
    {
      "line": 7,
      "name": "@CTWeb"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "que seja acessado o site da amazon",
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
  "location": "PesquisarProdutoAmazonStepDef.que_seja_acessado_o_site_da_amazon()"
});
formatter.result({
  "duration": 2093653300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mi band",
      "offset": 51
    }
  ],
  "location": "PesquisarProdutoAmazonStepDef.seja_preenchida_a_barra_de_pesquisa_com_o_nome_do_produto_que_desejo_procurar(String)"
});
formatter.result({
  "duration": 626370900,
  "status": "passed"
});
formatter.match({
  "location": "PesquisarProdutoAmazonStepDef.o_botao_de_pesquisar_e_pressionado()"
});
formatter.result({
  "duration": 1545211400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mi band",
      "offset": 22
    }
  ],
  "location": "PesquisarProdutoAmazonStepDef.deve_ser_retornado_o_produto_pesquisado(String)"
});
formatter.result({
  "duration": 2213858400,
  "status": "passed"
});
formatter.after({
  "duration": 842654000,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 18,
  "name": "Validar que o produto esteja indisponivel",
  "description": "",
  "id": "pesquisar-produto-desejado;validar-que-o-produto-esteja-indisponivel",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 17,
      "name": "@CTWeb"
    },
    {
      "line": 17,
      "name": "@CTAmazon"
    },
    {
      "line": 17,
      "name": "@CTAmazonProdutoIndisponivel"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "que seja acessado o site da amazon",
  "keyword": "Dado "
});
formatter.step({
  "line": 20,
  "name": "seja preenchida a barra de pesquisa com o nome do \"\u003cproduto\u003e\" que desejo procurar",
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "o botao de pesquisar e pressionado",
  "keyword": "Quando "
});
formatter.step({
  "line": 22,
  "name": "deve ser retornado a mensagem de \"\u003cproduto\u003e\" indisponivel",
  "keyword": "Entao "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "pesquisar-produto-desejado;validar-que-o-produto-esteja-indisponivel;",
  "rows": [
    {
      "cells": [
        "produto"
      ],
      "line": 24,
      "id": "pesquisar-produto-desejado;validar-que-o-produto-esteja-indisponivel;;1"
    },
    {
      "cells": [
        "carro azul tunado aviao verde"
      ],
      "line": 25,
      "id": "pesquisar-produto-desejado;validar-que-o-produto-esteja-indisponivel;;2"
    },
    {
      "cells": [
        "dnhasjkdlhasdhasda"
      ],
      "line": 26,
      "id": "pesquisar-produto-desejado;validar-que-o-produto-esteja-indisponivel;;3"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 1266726300,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Buscar pelo produto desejado para adicionar ao carrinho",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.scenario({
  "line": 25,
  "name": "Validar que o produto esteja indisponivel",
  "description": "",
  "id": "pesquisar-produto-desejado;validar-que-o-produto-esteja-indisponivel;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 17,
      "name": "@CTAmazonProdutoIndisponivel"
    },
    {
      "line": 17,
      "name": "@CTAmazon"
    },
    {
      "line": 17,
      "name": "@CTWeb"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "que seja acessado o site da amazon",
  "keyword": "Dado "
});
formatter.step({
  "line": 20,
  "name": "seja preenchida a barra de pesquisa com o nome do \"carro azul tunado aviao verde\" que desejo procurar",
  "matchedColumns": [
    0
  ],
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "o botao de pesquisar e pressionado",
  "keyword": "Quando "
});
formatter.step({
  "line": 22,
  "name": "deve ser retornado a mensagem de \"carro azul tunado aviao verde\" indisponivel",
  "matchedColumns": [
    0
  ],
  "keyword": "Entao "
});
formatter.match({
  "location": "PesquisarProdutoAmazonStepDef.que_seja_acessado_o_site_da_amazon()"
});
