# CadastroDeAnuncios
Sistema de Cadastro de Anúncios feito para o desafio da Academia Capgemini

Para Compilar e executar o programa é preciso está com o MySQL instalado no computador para que possa funcionar corretamente por causa do banco de dados.
Antes de executar o programa precisa ser criado o banco de dados com o nome anunciosdb , para isso execute o comando MySQL create database anunciosdb no seu terminal do MySQL
ou utilize o script que acompanha o projeto.

Após está com o banco de dados criado importe o projeto como projeto maven e o execute como aplicação java, o sistema iniciará e ficará disponivel para uso no navegador de
internet que desejar utilizar.

Para utilizar o sistema abra o seu navegador de internet e digite na barra de endereços: http://localhost:8080/
Feito isso será aberto a tela inicial do sistema e ele estará pronto para ser utilizado.

Como usar o sistema:
  
  Na tela inicial do sistema são exibidos dois botões um de cadastrar anúncio e outro de relatório de anúncios
  
  Ao clicar no botão Cadastrar Anúncio o sistema será redirecionado para a tela de cadastro de anúncios, nessa tela tem os campos: Cliente, Nome do Anúncio, Data Inicial e Data
  de Término, Quantidade de Dias, e Valor investido por dia. Para cadastrar um anúncio é necessário preencher todos campos, com exceção do campo quantidade de dias que será
  calculado automaticamente.
  
  Ao clicar no botão Relatório de Anúncios o sistema será redirecionado para uma tela onde mostra todos os anúncios e os dados solicitados no desafio, como valor investido,
  quantidade máxima de visualizações, quantidade máxima de compartilhamentos e os demais valores solicitados.
  
  Sei que foi pedido para que fosse possível fazer uma pesquisa, mas não consegui concluir, sendo assim enviei dessa forma onde mesmo assim é possível ver os detalhes de cada
  anúncio cadastrado no sistema
