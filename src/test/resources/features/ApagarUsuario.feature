#language: pt
#encoding: UTF-8
#author: Vinicius Souza

    Funcionalidade: Acessar a lista de usuários e remover o usuário previamente criado

      @remover
      Cenario: Validar mensagem ao deletar usuário

        Dado que acesso a pagina com a lista de usuários
        E apago o usuário
        Entao visualizo na pagina "Seu Usuário foi removido com sucesso!"
