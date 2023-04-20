#language: pt

Funcionalidade: Adicionar produto ao carrinho

    Contexto: adicionar produto ao carrinho com sucesso

    @CTWeb @CTAmazon @CTAmazonCarrinhoSucesso
    Esquema do Cenario: Validar que produto foi adicionado ao carrinho
        Dado que seja acessado o site da amazon
        E seja preenchida a barra de pesquisa com o nome do "<produto>" que desejo procurar
        E o botao de pesquisar e pressionado
        E deve ser retornado o "<produto>" pesquisado
        E e selecionado o produto desejado
        E o perfil do produto e carregado
        Quando a opcao de adicionar ao carrinho e pressionado
        Entao validar que produto foi adicionado ao carrinho com sucesso
        Exemplos:
        | produto |
        | mi band |