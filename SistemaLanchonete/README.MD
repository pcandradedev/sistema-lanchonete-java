
# Projeto Completo — Sistema de Lanchonete

## Objetivo do Projeto

Desenvolver um sistema simples de pedidos de uma lanchonete usando Java e Programação Orientada a Objetos.

O sistema deve permitir:

* Cadastrar clientes
* Criar produtos da lanchonete
* Criar pedidos
* Adicionar produtos ao pedido
* Calcular o valor total
* Mostrar os dados do pedido

Você deve aplicar:

* Encapsulamento
* Modificadores de acesso
* Classes e objetos
* Métodos
* Construtores
* Organização em pacotes

Sem usar:

* List
* ArrayList
* Coisas que você ainda não estudou

---

# Estrutura do Projeto

Crie esta estrutura de pacotes:

```
lanchonete
 ├── model
 │    ├── Cliente
 │    ├── Produto
 │    └── Pedido
 │
 └── app
      └── Main
```

---

# Classe 1 — Cliente

Pacote:

```
model
```

## Atributos (privados)

Você deve criar:

* nome do cliente
* telefone do cliente

## Construtor

O construtor deve receber:

* nome
* telefone

## Métodos que você precisa criar

* Método para obter o nome do cliente
* Método para obter o telefone
* Método para mostrar as informações do cliente

As informações exibidas devem conter:

```
Nome do cliente
Telefone
```

---

# Classe 2 — Produto

Pacote:

```
model
```

## Atributos privados

Crie os seguintes atributos:

* nome do produto
* preço do produto

## Construtor

Deve receber:

* nome
* preço

## Métodos obrigatórios

Você deve criar métodos para:

* Obter o nome do produto
* Obter o preço do produto
* Mostrar as informações do produto

Quando mostrar o produto, deve aparecer algo como:

```
Produto:
Preço:
```

---

# Classe 3 — Pedido (Classe Principal do Projeto)

Pacote:

```
model
```

Essa classe é a mais importante.

## Atributos privados

Crie:

* número do pedido
* cliente do pedido
* produto1
* produto2
* produto3
* valor total do pedido

Observação importante:

O pedido pode ter **no máximo 3 produtos**.

---

# Construtor do Pedido

O construtor deve receber:

* número do pedido
* cliente

Quando o pedido for criado:

* o total começa em 0

---

# Métodos que você precisa implementar

Você deve criar métodos para:

Adicionar produtos ao pedido.

Sugestão de lógica:

* método para adicionar primeiro produto
* método para adicionar segundo produto
* método para adicionar terceiro produto

Cada vez que adicionar um produto:

* o valor total deve ser atualizado.

---

# Método para mostrar o pedido

Esse método deve mostrar todas as informações do pedido.

A saída deve conter algo parecido com:

```
Número do pedido
Nome do cliente
Produtos do pedido
Valor total
```

Se algum produto ainda não tiver sido adicionado, ele não deve aparecer.

---

# Classe Main

Pacote:

```
app
```

Aqui você vai testar o sistema.

Na classe principal você deve:

1. Criar um cliente
2. Criar pelo menos 3 produtos
3. Criar um pedido
4. Adicionar produtos ao pedido
5. Mostrar o pedido completo

---

# Regras importantes do projeto

Você deve garantir:

* Todos os atributos privados
* Acesso aos dados somente por métodos
* Não acessar atributos diretamente fora da classe
* Usar construtor corretamente
* Organizar as classes nos pacotes corretos

---

# Desafios extras (isso deixa o projeto forte no GitHub) 🚀

Faça depois que terminar o básico.

## Desafio 1

Não permitir adicionar mais de 3 produtos.

---

## Desafio 2

Criar método:

```
calcularTotalPedido
```

---

## Desafio 3

Criar método:

```
finalizarPedido
```

Esse método deve mostrar uma mensagem indicando que o pedido foi concluído.

---

## Desafio 4

Adicionar um novo atributo no pedido:

```
statusPedido
```

Possíveis valores:

```
Recebido
Em preparo
Pronto
Entregue
```

---

## Desafio 5 (nível professor gosta muito)

Adicionar na classe Produto:

```
categoria
```

Exemplos:

* Lanche
* Bebida
* Sobremesa

---

# Desafio final (para deixar seu GitHub muito bom)

Criar um método que mostre:

```
Resumo do Pedido
```

Exemplo do que deve aparecer:

```
Pedido Nº:
Cliente:
Quantidade de produtos:
Valor total:
Status:
```

---

# Como subir no GitHub

Nome do projeto:

```
sistema-lanchonete-java
```

Descrição no README:

```
Projeto desenvolvido para praticar Programação Orientada a Objetos em Java.

Conceitos utilizados:
Encapsulamento
Classes e objetos
Métodos
Construtores
Organização em pacotes
```

