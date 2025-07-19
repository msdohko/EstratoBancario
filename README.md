# 🏦 Sistema de Extrato Bancário

## 📋 Descrição

Este projeto foi desenvolvido como parte do curso da Alura, implementando um sistema simples de extrato bancário em Java. O sistema permite que um cliente realize operações básicas de conta bancária através de um menu interativo no console.

## 🚀 Funcionalidades

### Operações Disponíveis

1. **Consultar Saldo** - Exibe o saldo atual da conta
2. **Transferir Valor** - Permite transferir um valor da conta (com validação de saldo)
3. **Receber Valor** - Permite adicionar um valor à conta
4. **Sair** - Encerra o programa

### Características do Sistema

- ✅ Interface de console interativa
- ✅ Validação de saldo para transferências
- ✅ Atualização automática do saldo
- ✅ Menu de opções claro e intuitivo
- ✅ Tratamento de opções inválidas

## 📁 Estrutura do Projeto

```
EstratoBancario/
├── src/
│   ├── Desafio.java      # Implementação principal do sistema
│   └── Main.java         # Versão alternativa do sistema
├── EstratoBancario.iml   # Arquivo de configuração do IntelliJ IDEA
└── README.md            # Este arquivo
```

## 🛠️ Como Executar

### Pré-requisitos

- Java JDK 8 ou superior
- IDE Java (recomendado: IntelliJ IDEA, Eclipse ou VS Code)

### Passos para Execução

1. **Clone ou baixe o projeto**
2. **Abra o projeto na sua IDE**
3. **Compile e execute a classe principal:**
   ```bash
   # Para executar o Desafio.java
   javac src/Desafio.java
   java -cp src Desafio
   
   # Para executar o Main.java
   javac src/Main.java
   java -cp src Main
   ```

## 💡 Diferentes Implementações

### Desafio.java
- Implementação mais robusta com loop while
- Menu de opções mais elaborado
- Melhor tratamento de erros
- Interface mais polida

### Main.java
- Implementação mais simples
- Execução única (sem loop)
- Estrutura básica para aprendizado

## 🎯 Objetivos de Aprendizado

Este projeto foi desenvolvido para praticar:

- **Estruturas de Controle**: if/else, while
- **Entrada de Dados**: Scanner
- **Variáveis e Tipos de Dados**: String, double, int
- **Operadores**: Aritméticos e de comparação
- **Interface de Console**: System.out.println()
- **Lógica de Programação**: Validações e fluxo de dados

## 🔮 Melhorias Futuras Sugeridas

### Funcionalidades Avançadas

1. **Sistema de Autenticação**
   - Login com senha
   - Múltiplos usuários
   - Níveis de acesso

2. **Histórico de Transações**
   - Registro de todas as operações
   - Data e hora das transações
   - Exportação de extrato

3. **Múltiplas Contas**
   - Conta corrente e poupança
   - Transferência entre contas
   - Diferentes tipos de conta

4. **Persistência de Dados**
   - Salvamento em arquivo
   - Banco de dados simples
   - Backup automático

### Melhorias na Interface

5. **Interface Gráfica**
   - GUI com Swing ou JavaFX
   - Interface web com Spring Boot
   - Aplicação mobile

6. **Validações Aprimoradas**
   - Validação de entrada de dados
   - Formatação de valores monetários
   - Tratamento de exceções robusto

### Recursos Bancários

7. **Operações Financeiras**
   - Pagamento de contas
   - Investimentos
   - Cartão de crédito
   - Empréstimos

8. **Relatórios e Análises**
   - Gráficos de gastos
   - Relatórios mensais
   - Análise de padrões de gasto

### Segurança e Performance

9. **Segurança**
   - Criptografia de dados
   - Logs de auditoria
   - Proteção contra fraudes

10. **Performance**
    - Otimização de consultas
    - Cache de dados
    - Processamento assíncrono

## 🎓 Contexto Educacional

Este projeto faz parte do curso da **Alura**, focado no aprendizado de Java básico. É um excelente ponto de partida para entender:

- Conceitos fundamentais de programação
- Estruturas de controle em Java
- Manipulação de entrada e saída
- Lógica de negócio simples

## 👨‍💻 Autor

Desenvolvido como parte do curso de Java da Alura.

## 📝 Licença

Este projeto é de uso educacional, desenvolvido para fins de aprendizado.

---

**💡 Dica**: Este projeto serve como base sólida para expandir seus conhecimentos em Java e desenvolvimento de sistemas bancários. Cada melhoria sugerida pode ser implementada como um novo projeto ou extensão deste código existente. 