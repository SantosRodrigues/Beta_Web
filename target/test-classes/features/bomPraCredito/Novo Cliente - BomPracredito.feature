# language: pt

Funcionalidade: Solicitação de emprestimo

  @CTBomPraCredito
  Esquema do Cenario: Cenario: Novo cliente solicita credito com sucesso - Pegando CPF do 4Devs
    Dado que eu acesse o "<site>"
    E preencho as seguintes informacoes
      | valor   | parcelas   | nome   | email   | aceitoTermo   |
      | <valor> | <parcelas> | <nome> | <email> | <aceitoTermo> |
    E clico no botao continuar sem custo e sem compromisso
    E aguardo o carregamento da tela de motivo do emprestimo
    E seleciono o "<motivo>" do emprestimo
    E aguardo o carregamento da tela de possui veiculo
    E seleciono uma altenativa na tela de possui "<veiculo>"
    E aguardo o carregamento da tela possui imovel
    E seleciono uma alternativa na tela de possui "<imovel>"
    E aguardo o carregamento da tela de cpf
    E acesso o site do 4devs
    E solicito a geracao de um novo cpf
    E copio o cpf gerado
    E encerro a pagina do fourdevs
    Quando colo o documento no campo cpf
    Entao clico no botao continuar
    Exemplos:
      | site                             | valor | parcelas | nome         | email | aceitoTermo | motivo | veiculo | imovel |
      | https://www.bompracredito.com.br | 1500  | 12       | marcos silva | auto  | sim         | outro  | nao     | nao    |