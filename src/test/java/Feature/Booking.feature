#language: pt


Funcionalidade: Fazer uma reserva de uma hospedagem e comprar um ingresso de uma atração


  Contexto:
    Dado que estou no site https://www.booking.com


  Cenario: Escolher o local, o hotel e fazer a reserva
    Quando Preencho os dados de viagem
    Quando seleciono o local da hospedagem e faco a reserva
    Quando preencho os dados dos hospedes
    E preencho os dados de pagamento
    Então valido se os dados estao corretos



  Cenario: Comprar ingresso de uma atração
    Quando clico em atracao e clico em paris
    Quando seleciono uma atracao e seleciono a quantidade de ingressos
    E preencho os dados pessoais
    Então preencho os dados de pagamento do ingresso e valido o botao Pagar agora