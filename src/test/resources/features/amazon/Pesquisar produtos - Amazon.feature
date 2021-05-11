#language: pt

Funcionalidade: Pesquisar produto desejado

  Contexto: Buscar pelo produto desejado para realizar a compra

  @CTAmazon @CTAmazonProdutoDisponivel
  Esquema do Cenario: Pesquisar produto que esteja disponivel
    Dado que seja acessado o "<site>" da amazon
    E seja preenchida a barra de pesquisa com o nome do "<produto>" que desejo procurar
    Quando o botao de pesquisar e pressionado
    Entao deve ser retornado o "<produto>" pesquisado
    Exemplos:
      | produto | site                                   |
      | mi band | https://www.amazon.com.br/ref=nav_logo |

  @CTAmazon @CTAmazonProdutoIndisponivel
  Esquema do Cenario: Pesquisar produto que esteja indisponivel
    Dado que seja acessado o "<site>" da amazon
    E seja preenchida a barra de pesquisa com o nome do "<produto>" que desejo procurar
    Quando o botao de pesquisar e pressionado
    Entao deve ser retornado a mensagem de "<produto>" indisponivel
    Exemplos:
      | produto                       | site                                   |
      | carro azul tunado aviao verde | https://www.amazon.com.br/ref=nav_logo |
      | dnhasjkdlhasdhasda            | https://www.amazon.com.br/ref=nav_logo |