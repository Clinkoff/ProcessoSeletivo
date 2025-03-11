# Processo Seletivo

Este projeto é uma simulação de um **processo seletivo** simples, onde candidatos são analisados com base no salário pretendido e podem ser contatados para a vaga.

## 📌 Funcionalidades
- Simula um processo seletivo com uma lista de candidatos.
- Verifica se o candidato aceita um salário dentro do orçamento.
- Seleciona candidatos que atendem aos critérios.
- Realiza tentativas de contato com os candidatos selecionados.

## 📜 Explicação do Código
O código possui os seguintes métodos principais:

### 🔹 `selecaoCandidato()`
- Percorre uma lista de candidatos.
- Verifica se o salário pretendido está dentro do orçamento.
- Adiciona o candidato à lista de selecionados se atender ao critério.

### 🔹 `valorPretendido()`
- Gera um valor aleatório entre **R$1800** e **R$2200** para simular o salário desejado pelo candidato.

### 🔹 `analisarCandidato(double salarioPretendido)`
- Compara o salário pretendido com o salário base (**R$2000**).
- Retorna a decisão sobre o candidato:
  - **Salário pretendido menor:** Ligar imediatamente.
  - **Salário igual ao base:** Ligar com uma contraproposta.
  - **Salário maior:** Aguardar outros candidatos.

### 🔹 `imprimirSelecionados(List<String> selecionados)`
- Exibe a lista de candidatos selecionados com seu número de ordem.

### 🔹 `entrandoEmContato(String candidato)`
- Tenta ligar para o candidato até **3 vezes**.
- Se o candidato atender, o contato é concluído com sucesso.
- Caso contrário, exibe uma mensagem indicando que não foi possível o contato.

### 🔹 `atender()`
- Simula se o candidato atende a ligação usando um número aleatório.

## 🔧 Tecnologias Utilizadas
- **Java 8+**
- **Java Collections (List, ArrayList)**
- **Random e ThreadLocalRandom**
- **Estruturas de controle (if, while, do-while)**

## 🏁 Como Executar
1. Clone este repositório:
   ```bash
   git clone https://github.com/Clinkoff/ProcessoSeletivo.git
   ```
2. Compile o código:
   ```bash
   javac src/candidatura/ProcessoSeletivo.java
   ```
3. Execute o programa:
   ```bash
   java candidatura.ProcessoSeletivo
   ```

## 📌 Exemplo de Saída
```
Processo seletivo
O candidato Felipe solicitou 1850.0 de salário
O candidato Felipe foi selecionado para a vaga
...
Candidatos selecionados:
O candidato de n°1 é Felipe
...
Conseguimos contato com Felipe na tentativa 2
```

## 📜 Licença
Este projeto é apenas para fins educacionais e não possui uma licença específica.
