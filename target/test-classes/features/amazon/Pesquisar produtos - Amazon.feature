#language: pt

Funcionalidade: Pesquisar lista de produto desejado

  Contexto: Buscar pelo produto desejado para realizar a compra

  @CTAmazon
  Esquema do Cenario: Pesquisar produto que esteja disponivel
    Dado que seja acessado o "<site>" da amazon
    E seja preenchida a barra de pesquisa com o nome do "<produto>" que desejo procurar
    Quando o botao de pesquisar e pressionado
    Entao deve ser retornado o "<produto>" pesquisado
    Exemplos:
      | produto | site                                   |
      | mi band | https://www.amazon.com.br/ref=nav_logo |