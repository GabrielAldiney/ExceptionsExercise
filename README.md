# 💳 Sistema de Conta Bancária com Tratamento de Exceções

Este repositório contém a resolução de um exercício proposto no curso de Java do grande professor Nelio Alves, com foco em **tratamento de exceções personalizadas** e manipulação de entrada de dados via console. O objetivo é simular um sistema bancário simples com verificação de regras para saque.

---

## 📌 Descrição do Exercício

Criar um programa que:

1. 💡 Solicite os dados de uma conta bancária:
   - Número da conta
   - Nome do titular
   - Saldo inicial
   - Limite de saque

2. 💸 Realize uma operação de saque:
   - Se o valor do saque for **maior que o saldo**, lançar exceção.
   - Se o valor do saque for **maior que o limite de saque**, lançar exceção.
   - Caso contrário, atualizar e mostrar o novo saldo.

---

## 🧱 Estrutura do Projeto

📂 `application/Program.java`  
📂 `entities/Account.java`  
📂 `exceptions/DomainException.java`

---

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
