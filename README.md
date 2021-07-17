# Desafio Orage Talents

> Sobre esta implementação:
> Foi um grande desafio, com muito aprendizado, a cada erro e bug corrigido ao longo da aplicação dava mais forças de continuar. Desenvolvimento é um caminho de aprendizado continuo e muita pesquisa, mas no fim sempre traz uma imença satisfação, des do primeiro "Hello World". de ante mão peço para que entre en contato caso aja algo errado ou tenha outra forma, aprendemos mais trocando figurinha, assim evoluimos. "Vida longa e próspera!"

## Contexto do projeto

Você está fazendo uma API REST que precisará controlar endereços de usuários!

O primeiro passo deve ser a construção de um cadastro de usuários, sendo obrigatório dados como: nome, e-mail, CPF e data de nascimento, onde e-mail e CPF devem ser únicos.
O segundo passo é criar um cadastro de endereços, sendo obrigatório dados mínimos para cadastro como: logradouro, número, complemento, bairro, cidade, estado e CEP, associando este endereço ao usuário.
O terceiro passo é criar um endpoint que retornará um usuário com a lista de todos seus endereços cadastrados.
Você deve construir apenas 3 endpoints neste sistema, o cadastro do usuário, o cadastro de endereços e a listagem dos endereços de um usuário específico.

- Caso os cadastros estejam corretos, é necessário voltar o Status 201, caso haja erros de preenchimento de dados, o Status deve ser 400.
- Caso a busca esteja correta, é necessário voltar o status 200, caso haja erro na busca, retornar o Status adequado e uma mensagem de erro amigável.
