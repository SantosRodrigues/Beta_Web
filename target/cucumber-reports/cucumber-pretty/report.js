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
  "duration": 2773840600,
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
  "duration": 3160614700,
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
  "duration": 671698700,
  "status": "passed"
});
formatter.match({
  "location": "PesquisarProdutoAmazonStepDef.o_botao_de_pesquisar_e_pressionado()"
});
formatter.result({
  "duration": 2274535400,
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
  "duration": 30195611100,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.example.stepsDefinitions.amazon.PesquisarProdutoAmazonStepDef.deve_ser_retornado_o_produto_pesquisado(PesquisarProdutoAmazonStepDef.java:39)\r\n\tat ✽.Entao deve ser retornado o \"mi band\" pesquisado(features/amazon/Pesquisar produto - Amazon.feature:12)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1153614200,
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
        "dnhasjkdlhasdhasda"
      ],
      "line": 25,
      "id": "pesquisar-produto-desejado;validar-que-o-produto-esteja-indisponivel;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 1513605700,
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
  "name": "seja preenchida a barra de pesquisa com o nome do \"dnhasjkdlhasdhasda\" que desejo procurar",
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
  "name": "deve ser retornado a mensagem de \"dnhasjkdlhasdhasda\" indisponivel",
  "matchedColumns": [
    0
  ],
  "keyword": "Entao "
});
formatter.match({
  "location": "PesquisarProdutoAmazonStepDef.que_seja_acessado_o_site_da_amazon()"
});
formatter.result({
  "duration": 1669169800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dnhasjkdlhasdhasda",
      "offset": 51
    }
  ],
  "location": "PesquisarProdutoAmazonStepDef.seja_preenchida_a_barra_de_pesquisa_com_o_nome_do_produto_que_desejo_procurar(String)"
});
formatter.result({
  "duration": 30349711300,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for element to be clickable: Proxy element for: DefaultElementLocator \u0027By.cssSelector: #twotabsearchtextbox\u0027 (tried for 30 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat org.example.stepsDefinitions.amazon.PagAmazonHomePagePO.preencherBarraDePesquisa(PagAmazonHomePagePO.java:26)\r\n\tat org.example.stepsDefinitions.amazon.PesquisarProdutoAmazonStepDef.seja_preenchida_a_barra_de_pesquisa_com_o_nome_do_produto_que_desejo_procurar(PesquisarProdutoAmazonStepDef.java:28)\r\n\tat ✽.E seja preenchida a barra de pesquisa com o nome do \"dnhasjkdlhasdhasda\" que desejo procurar(features/amazon/Pesquisar produto - Amazon.feature:20)\r\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#twotabsearchtextbox\"}\n  (Session info: chrome\u003d112.0.5615.138)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-B516F2P\u0027, ip: \u0027192.168.0.106\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 112.0.5615.138, chrome: {chromedriverVersion: 112.0.5615.49 (bd2a7bcb881c..., userDataDir: C:\\Users\\Higor\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:53946}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 08e9be986fd1a4fed7bd8c6393123cf6\n*** Element info: {Using\u003dcss selector, value\u003d#twotabsearchtextbox}\r\n\tat sun.reflect.GeneratedConstructorAccessor11.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:420)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:431)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.isDisplayed(Unknown Source)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.elementIfVisible(ExpectedConditions.java:314)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:43)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:300)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:297)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$23.apply(ExpectedConditions.java:670)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$23.apply(ExpectedConditions.java:666)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:249)\r\n\tat org.example.stepsDefinitions.amazon.PagAmazonHomePagePO.preencherBarraDePesquisa(PagAmazonHomePagePO.java:26)\r\n\tat org.example.stepsDefinitions.amazon.PesquisarProdutoAmazonStepDef.seja_preenchida_a_barra_de_pesquisa_com_o_nome_do_produto_que_desejo_procurar(PesquisarProdutoAmazonStepDef.java:28)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)\r\n\tat com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "PesquisarProdutoAmazonStepDef.o_botao_de_pesquisar_e_pressionado()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "dnhasjkdlhasdhasda",
      "offset": 34
    }
  ],
  "location": "PesquisarProdutoAmazonStepDef.deve_ser_retornado_a_mensagem_de_produto_indisponivel(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1300669800,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 28,
  "name": "Validar que produto foi adicionado ao carrinho",
  "description": "",
  "id": "pesquisar-produto-desejado;validar-que-produto-foi-adicionado-ao-carrinho",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 27,
      "name": "@CTWeb"
    },
    {
      "line": 27,
      "name": "@CTAmazon"
    },
    {
      "line": 27,
      "name": "@CTAmazonCarrinhoSucesso"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "que seja acessado o site da amazon",
  "keyword": "Dado "
});
formatter.step({
  "line": 30,
  "name": "seja preenchida a barra de pesquisa com o nome do \"\u003cproduto\u003e\" que desejo procurar",
  "keyword": "E "
});
formatter.step({
  "line": 31,
  "name": "o botao de pesquisar e pressionado",
  "keyword": "E "
});
formatter.step({
  "line": 32,
  "name": "deve ser retornado o \"\u003cproduto\u003e\" pesquisado",
  "keyword": "E "
});
formatter.step({
  "line": 33,
  "name": "e selecionado o produto desejado",
  "keyword": "E "
});
formatter.step({
  "line": 34,
  "name": "o perfil do produto e carregado",
  "keyword": "E "
});
formatter.step({
  "line": 35,
  "name": "a opcao de adicionar ao carrinho e pressionado",
  "keyword": "Quando "
});
formatter.step({
  "line": 36,
  "name": "validar que produto foi adicionado ao carrinho com sucesso",
  "keyword": "Entao "
});
formatter.examples({
  "line": 37,
  "name": "",
  "description": "",
  "id": "pesquisar-produto-desejado;validar-que-produto-foi-adicionado-ao-carrinho;",
  "rows": [
    {
      "cells": [
        "produto"
      ],
      "line": 38,
      "id": "pesquisar-produto-desejado;validar-que-produto-foi-adicionado-ao-carrinho;;1"
    },
    {
      "cells": [
        "mi band"
      ],
      "line": 39,
      "id": "pesquisar-produto-desejado;validar-que-produto-foi-adicionado-ao-carrinho;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 1504351600,
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
  "line": 39,
  "name": "Validar que produto foi adicionado ao carrinho",
  "description": "",
  "id": "pesquisar-produto-desejado;validar-que-produto-foi-adicionado-ao-carrinho;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 27,
      "name": "@CTAmazonCarrinhoSucesso"
    },
    {
      "line": 27,
      "name": "@CTAmazon"
    },
    {
      "line": 27,
      "name": "@CTWeb"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "que seja acessado o site da amazon",
  "keyword": "Dado "
});
formatter.step({
  "line": 30,
  "name": "seja preenchida a barra de pesquisa com o nome do \"mi band\" que desejo procurar",
  "matchedColumns": [
    0
  ],
  "keyword": "E "
});
formatter.step({
  "line": 31,
  "name": "o botao de pesquisar e pressionado",
  "keyword": "E "
});
formatter.step({
  "line": 32,
  "name": "deve ser retornado o \"mi band\" pesquisado",
  "matchedColumns": [
    0
  ],
  "keyword": "E "
});
formatter.step({
  "line": 33,
  "name": "e selecionado o produto desejado",
  "keyword": "E "
});
formatter.step({
  "line": 34,
  "name": "o perfil do produto e carregado",
  "keyword": "E "
});
formatter.step({
  "line": 35,
  "name": "a opcao de adicionar ao carrinho e pressionado",
  "keyword": "Quando "
});
formatter.step({
  "line": 36,
  "name": "validar que produto foi adicionado ao carrinho com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "PesquisarProdutoAmazonStepDef.que_seja_acessado_o_site_da_amazon()"
});
formatter.result({
  "duration": 2586722700,
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
  "duration": 663391200,
  "status": "passed"
});
formatter.match({
  "location": "PesquisarProdutoAmazonStepDef.o_botao_de_pesquisar_e_pressionado()"
});
formatter.result({
  "duration": 2029408000,
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
  "duration": 30165595500,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.example.stepsDefinitions.amazon.PesquisarProdutoAmazonStepDef.deve_ser_retornado_o_produto_pesquisado(PesquisarProdutoAmazonStepDef.java:39)\r\n\tat ✽.E deve ser retornado o \"mi band\" pesquisado(features/amazon/Pesquisar produto - Amazon.feature:32)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "PesquisarProdutoAmazonStepDef.e_selecionado_o_produto_desejado()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PesquisarProdutoAmazonStepDef.o_perfil_do_produto_e_carregado()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PesquisarProdutoAmazonStepDef.a_opcao_de_adicionar_ao_carrinho_e_pressionado()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PesquisarProdutoAmazonStepDef.validar_que_produto_foi_adicionado_ao_carrinho_com_sucesso()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1207126800,
  "status": "passed"
});
});