#language: pt

Funcionalidade: Pesquisar produto desejado

  Contexto: Buscar pelo produto desejado

  @CTWeb @CTAmazon @CTAmazonProdutoDisponivel
  Esquema do Cenario: Validar que o produto esteja disponivel
    Dado que seja acessado o site da amazon
    E seja preenchida a barra de pesquisa com o nome do "<produto>" que desejo procurar
    Quando o botao de pesquisar e pressionado
    Entao deve ser retornado o "<produto>" pesquisado
    Exemplos:
      | produto |
      | mi band |

  @CTWeb @CTAmazon @CTAmazonProdutoIndisponivel
  Esquema do Cenario: Validar que o produto esteja indisponivel
    Dado que seja acessado o site da amazon
    E seja preenchida a barra de pesquisa com o nome do "<produto>" que desejo procurar
    Quando o botao de pesquisar e pressionado
    Entao deve ser retornado a mensagem de "<produto>" indisponivel
    Exemplos:
      | produto                              |
      | asjdajsdkasjdklsajdklasjldjasjdsajda |

