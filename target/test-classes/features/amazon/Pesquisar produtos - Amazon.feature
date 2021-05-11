#language: pt

Funcionalidade: Pesquisar produto desejado

  Contexto: Buscar pelo produto desejado para realizar a compra

  @CTAmazon @CTAmazonProdutoDisponivel
  Esquema do Cenario: Validar que o produto esteja disponivel
    Dado que seja acessado o "<site>" da amazon
    E seja preenchida a barra de pesquisa com o nome do "<produto>" que desejo procurar
    Quando o botao de pesquisar e pressionado
    Entao deve ser retornado o "<produto>" pesquisado
    Exemplos:
      | produto | site                                   |
      | mi band | https://www.amazon.com.br/ref=nav_logo |

  @CTAmazon @CTAmazonProdutoIndisponivel
  Esquema do Cenario: Validar que o produto esteja indisponivel
    Dado que seja acessado o "<site>" da amazon
    E seja preenchida a barra de pesquisa com o nome do "<produto>" que desejo procurar
    Quando o botao de pesquisar e pressionado
    Entao deve ser retornado a mensagem de "<produto>" indisponivel
    Exemplos:
      | produto                       | site                                   |
      | carro azul tunado aviao verde | https://www.amazon.com.br/ref=nav_logo |
      | dnhasjkdlhasdhasda            | https://www.amazon.com.br/ref=nav_logo |

  @CTAmazon @CTAmazonCarrinho
  Esquema do Cenario: Validar que produto foi adicionado ao carrinho
    Dado que seja acessado o "<site>" da amazon
    E seja preenchida a barra de pesquisa com o nome do "<produto>" que desejo procurar
    E o botao de pesquisar e pressionado
    E deve ser retornado o "<produto>" pesquisado
    E e selecionado o produto desejado
    E o perfil do produto e carregado
    Quando a opcao de adicionar ao carrinho e pressionado
    Entao validar que produto foi adicionado ao carrinho com sucesso
    Exemplos:
      | produto | site                                   |
      | mi band | https://www.amazon.com.br/ref=nav_logo |