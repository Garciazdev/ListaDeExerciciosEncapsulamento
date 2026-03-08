# 📘 LISTA DE EXERCÍCIOS – ENCAPSULAMENTO (JAVA)
---

# 🟢 Nível 1 – Fundamentos

### 1️⃣ Classe Pessoa

Crie uma classe `Pessoa` com:

- nome
- idade

Regras:

- Idade não pode ser negativa
- Idade não pode ser maior que 130
- Nome não pode ser vazio

Pergunta importante:
→ Você realmente precisa de `setIdade()`?

---

### 2️⃣ Classe ContaCorrente

Atributos:

- numeroConta
- titular
- saldo

Regras:

- Saldo não pode ser alterado diretamente
- Não permitir saque maior que saldo
- Não permitir depósito negativo

Desafio:
→ Remova todos os setters e faça funcionar apenas com métodos de negócio.

---

# 🟡 Nível 2 – Pensamento de Regra de Negócio

### 3️⃣ Classe Produto (versão profissional)

Atributos:

- nome (imutável)
- preco
- quantidade

Regras:

- Preço não pode ser negativo
- Estoque não pode ficar negativo
- Nome não pode ser alterado depois da criação

Pergunta:
→ Como impedir alteração do nome sem usar setter?

---

### 4️⃣ Classe Aluno

Atributos:

- nome
- nota1
- nota2
- média (não pode ser atributo editável)

Regras:

- Notas entre 0 e 10
- Média deve ser calculada automaticamente
- Média não pode ter setter

Pergunta:
→ Média deve ser atributo armazenado ou método calculado?

---

# 🟠 Nível 3 – Encapsulamento Avançado

### 5️⃣ Classe CartaoCredito

Atributos:

- numeroCartao
- limite
- faturaAtual

Regras:

- Não pode gastar além do limite
- Fatura só aumenta por método `realizarCompra`
- Fatura não pode ser alterada por setter
- Método para pagar fatura (não permitir valor negativo)

Pergunta:
→ O número do cartão deve ter setter?

---

### 6️⃣ Classe Cofre

Atributos:

- senha (privada)
- saldo

Regras:

- Só pode abrir o cofre se a senha estiver correta
- Saldo só pode ser acessado se autenticado
- Não pode acessar saldo diretamente

Desafio:
→ Como impedir que alguém veja o saldo sem validar senha?

---

# 🔴 Nível 4 – Engenharia

### 7️⃣ Classe Pedido

Atributos:

- id
- listaDeProdutos
- status (CRIADO, PAGO, ENVIADO, CANCELADO)

Regras:

- Só pode pagar se status = CRIADO
- Só pode enviar se status = PAGO
- Cancelado não pode ser alterado
- Status não pode ter setter público

Pergunta:
→ Status deve ser alterado por setter ou por métodos específicos?
