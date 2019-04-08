# **Desafio do Estacionamento de Carros**

# Motivação
Avaliar o desempenho de desenvolvedores ao utilizar o framework ASP.NET Core para implementar uma API RESTful.

# Introdução 
Você foi procurado para implementar uma API que gerencie um estaciomento privado de veículos. 

O cliente precisa que o sistema seja feito em ASP.NET Core já que ele é produtivo, eficiente e multi-plataforma.

# Descrição do sistema
- No estacionamento do cliente existe um número predefinido de vagas (V) que não muda durante a execução do sistema e que deve ser maior ou igual a 15.
- O valor do estacionamento é definido como P1 reais por H horas de permanência mais P2 reais por hora excedente. Esses valores também são fixos durante a execução do sistema.
- Só pode haver um carro não estacionado por vez no estacionamento.
- O estacionamento é composto por vagas numeradas.
- Na entrada do estacionamento existe uma cancela, um painel de informações e uma impressora de tickets.
- Ao se aproximar da entrada, o carro será detectado e o painel exibirá se há vagas disponíveis ou se já há um carro sendo estacionado.
    - Caso haja vagas, será capturada a data/hora de entrada e a placa do carro e a cancela se erguerá para que o carro entre. 
Os dados capturados serão impressos num ticket com código QR para validação na saída.
    - Ao estacionar, será informado ao sistema em que vaga o carro foi estacionado.
    - No caso de não haver vagas, será exibida a mensagem "Não há vagas disponíveis".
    - No caso de haver um carro sendo estacionado, será exibida a mensagem "Aguarde o estacionamento "



# Build and Test
TODO: Describe and show how to build your code and run the tests. 

# Contribute
TODO: Explain how other users and developers can contribute to make your code better. 

If you want to learn more about creating good readme files then refer the following [guidelines](https://www.visualstudio.com/en-us/docs/git/create-a-readme). You can also seek inspiration from the below readme files:
- [ASP.NET Core](https://github.com/aspnet/Home)
- [Visual Studio Code](https://github.com/Microsoft/vscode)
- [Chakra Core](https://github.com/Microsoft/ChakraCore)