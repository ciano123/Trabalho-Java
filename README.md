# Contas

   O programa de Contas inicialmente tem como objetivo expor o que foi aprendido até o momento na disciplina 'Técnicas de Programação' em Java.  O programa é formado por três tipos distintos de conta Conta-Comum, Conta-Poupança e Conta-Especial.
   
  Autor:
  
Nome: Francisco Cassiano de Vasconcelos Souza	   Matrícula: 413067

E-mail: casinho.555@gmail.com    Curso: Engenharia de Computação

Instituição: Universidade Federal do Ceará (Campus Sobral).

  Operações :
  
-Saque		- Deposito	-Transferência		-Reajustar	-Ver  Saldos	-Sair

  Executando:
  
  Ao executar o programa o usuário receberá uma mensagem de boas vindas, apertando em “Ok”, será direcionado a uma janela de cadastro. Inicialmente cadastrando a Conta-Comum preenchendo os campos – Nome, N° Conta e Saldo, em seguida clica-se em “Cadastrar” caso esteja ciente dos dados. Em seguida direcionado a janela de cadastro da Conta-Poupança onde preencherá – Nome, N° Conta e Saldo e em seguida a Conta-Especial preenchendo – Nome, N° Conta, Saldo, Limite e Multa. Clicando em “Cadastrar” em todos será direcionando ao menu de operações que foram citados acima.

Saque: Escolhendo essa operação o usuário será direcionado a uma janela de saque, onde preencherá os campos – N° Conta e abaixo Valor saque. Clicando no botão “Pesquisar” será exibido em baixo na frente do Label ‘Saldo’ o valor do saldo do correntista. Digitando o valor de saque e clicando em “Ok” será exibida uma caixa de confirmação, clicando em “Sim” verifica se o saldo é maior ou igual ao valor de saque, se sim exibe o nome do dono da conta e a mensagem “Saque efetuado com sucesso”, se o saque for maior que o saldo exibe a mensagem “Saldo insuficiente” e volta o menu de operações. E na janela de confirmação clicando nos botões “Não” e “Cancelar” exibe uma mensagem que a operação não foi realizada e volta pra janela de saque. Clicando em “Cancelar” nessa outra janela o usuário é direcionado ao menu de operações.

Depósito: Escolhendo essa operação o usuário é direcionado a uma janela de depósito, onde preencherá os campos – N° Conta e abaixo Depositar. Clicando no botão “Pesquisar” o usuário saberá o saldo atual. Digitando o valor de depósito e clicando em “Ok” será exibida uma caixa de confirmação, clicando em “Sim” o depósito é efetuado e exibi o nome do dono da conta e uma mensagem “Depósito efetuado com sucesso”. Clicando em “Não” ou “Cancelar” exibe uma mensagem em que a operação foi cancelada ou não realizou a operação e volta para a janela de depósito. Clicando em “Cancelar” nessa outra janela o usuário é direcionado ao menu de operações.

Transferência: Escolhendo essa operação o usuário é direcionado a uma janela de transferência onde em primeiro momento irá preencher os campos – N° Conta e tem a opção de “Pesquisar” sabendo assim o valor de saldo. Esse primeiro campo é o campo em que será efetuado um saque. No campo ao lado preencherá – N° Conta em que também terá a opção “Pesquisar” e assim verá o saldo. Nesse campo será efetuado o depósito, e assim é feita a transferência. Feito isso o usuário ira digitar no campo “Transferir” o valor que deseja sacar da primeira conta para depositar na segunda conta. Clicando em “Ok” é emitida uma caixa de confirmação perguntando se deseja continuar, clicando em “Sim” aparece a mensagem com o nome do dono da primeira conta e exibe “Saque efetuado” clicando em “Ok” emite outra janela com nome do segundo dono da conta e exibe “Depósito efetuado.” Clicando “Ok” por fim aparece a mensagem “Transferência feita com sucesso” e clicando em ”Ok” é direcionado para o menu de operações. Clicando em “Não” ou “Cancelar” exibe uma mensagem em que a operação foi cancelada ou não realizou a operação e volta para o menu de operações.

Reajustar: Escolhendo essa operação o usuário é direcionado a uma janela de reajuste, em que deve digitar a taxa em % que deseja reajustar, caso o usuário não digite nada o programa entende que deve reajustar num reajuste fixo de 10%. Clicando em “Ok” em ambos os casos é emitida uma mensagem “Reajuste feito com sucesso” e clicando em “Ok” volta ao menu de operações.

Ver Saldos: Escolhendo essa operação o usuário é direcionado a uma janela Ver saldos, em que nela está contida os tipos de conta (Conta-comum, Conta-Poupança e Conta-Especial), os números de cada conta e os saldos atualizados de cada conta respectiva. Clicando em “Ok” o usuário volta ao menu de operações.

Sair: Escolhendo essa operação o usuário encerra o programa e ele fecha automaticamente.

