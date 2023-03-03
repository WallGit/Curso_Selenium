# language: pt

  Funcionalidade: Receber desconto da qazando
    Eu como usuário da qazando
    quero receber um cupom de desconto
    para comprar um curso com valor reduzido



   @gerar-cupom
    Cenário: Visualizar código de desconto
      Dado que estou no site do qazando
      Quando eu preencher meu e-mail
      E clico em ganhar cupom
      Entao eu vejo o código de desconto

     @gerar-cupom-rapido
    Cenário: xpto
      Dado que tenho um cupom gerado



