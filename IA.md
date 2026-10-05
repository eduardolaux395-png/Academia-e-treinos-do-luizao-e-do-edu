# Instruções para IA — Academia do Eduzão e do Luizão

> Documento de contexto e regras para qualquer IA que analise, explique, documente ou altere este repositório.
>
> **Última atualização:** 2026-10-05

## 1. Objetivo deste arquivo

Este arquivo orienta a IA sobre o contexto acadêmico do projeto, o estado atual do código e as regras para propor ou realizar alterações.

A IA deve tratar este repositório como um **projeto acadêmico de Programação Orientada a Objetos em desenvolvimento incremental**, e não como uma aplicação de produção pronta.

Antes de alterar qualquer arquivo:

1. Ler este `IA.md`.
2. Ler o `README.md`.
3. Verificar a estrutura atual do repositório.
4. Inspecionar os arquivos diretamente relacionados à solicitação.
5. Diferenciar código de atividade/esboço de uma implementação consolidada.
6. Não assumir que uma funcionalidade descrita na documentação já está implementada no código.

---

## 2. Contexto do sistema

O projeto representa um sistema para gerenciamento de uma academia de pequeno porte.

O objetivo é centralizar informações que poderiam ser mantidas em planilhas ou anotações, principalmente:

* alunos;
* instrutores;
* treinos;
* exercícios;
* associação de treinos aos alunos;
* frequência;
* evolução física;
* consultas, atualizações e exclusões.

O público-alvo definido no projeto é:

* aluno;
* instrutor;
* administrador.

As funcionalidades descritas no `README.md` incluem cadastro de alunos, instrutores e treinos, associação de treinos aos alunos, consulta, atualização, pesquisa e exclusão.

**Importante:** essas funcionalidades representam o escopo/documentação do projeto. A IA deve verificar no código quais delas estão efetivamente implementadas antes de afirmar que estão prontas.

---

## 3. Tecnologia e nível esperado

A base do projeto é:

* Java;
* Programação Orientada a Objetos;
* classes e objetos;
* construtores;
* métodos;
* encapsulamento;
* herança;
* polimorfismo;
* composição;
* coleções;
* validação de dados;
* testes automatizados simples.

Não adicionar frameworks, bibliotecas ou arquiteturas externas sem necessidade e sem solicitação explícita.

O código deve continuar adequado ao nível acadêmico do projeto. Não transformar exercícios simples em uma arquitetura excessivamente complexa.

---

## 4. Estrutura atual do repositório

A estrutura contém, entre outros:

```text
/
├── codigo/
│   ├── segunda-feira/
│   │   ├── modelo-inicial/
│   │   ├── construtores-e-metodos/
│   │   ├── encapsulamento-validacao/
│   │   ├── Atividade 7 - Composição no projeto - ESBOÇO
│   │   ├── Composição no projeto
│   │   ├── Main.java
│   │   └── polimorfismotest.java
│   │
│   └── quarta-feira/
│       └── desenvolvimento-incremental/
│           ├── Main.java
│           └── Testes.java
│
├── documentacao/
├── README.md
├── IA.md
└── executar-testes.bat
```

As pastas de `codigo/segunda-feira` representam etapas/atividades de POO. A pasta `codigo/quarta-feira/desenvolvimento-incremental` contém uma versão incremental mais recente do modelo básico.

**Não tratar automaticamente todas as versões/atividades como partes de um único código compilável.**

---

## 5. Estado atual do código

### 5.1 Desenvolvimento incremental

O arquivo:

`codigo/quarta-feira/desenvolvimento-incremental/Main.java`

contém atualmente as classes:

* `Aluno`
* `Treino`
* `Frequencia`
* `Evolucao`
* `Main`

### Aluno

A implementação atual possui:

* `nome`;
* `idade`;
* `telefone`;
* construtor;
* método `exibirDados()`.

Os atributos são privados.

### Treino

A implementação atual possui:

* `nome`;
* `descricao`;
* construtor;
* método `exibirTreino()`.

### Frequencia

A classe possui:

* `totalPresencas`;
* `totalAulas`;
* construtor com validação;
* método `calcularFrequencia()`;
* método `exibirFrequencia()`.

Regra implementada:

```text
frequência = (total de presenças / total de aulas) * 100
```

Quando `totalAulas == 0`, o resultado é `0`.

São rejeitados:

* total de aulas negativo;
* total de presenças negativo;
* número de presenças maior que o número de aulas.

A rejeição é feita com `IllegalArgumentException`.

### Evolucao

A classe representa informações básicas de evolução física:

* peso;
* altura;
* método `exibirEvolucao()`.

A implementação atual não deve ser descrita como cálculo de IMC ou como sistema completo de acompanhamento médico. Essas regras não estão definidas.

---

## 6. Testes atuais

O arquivo:

`codigo/quarta-feira/desenvolvimento-incremental/Testes.java`

usa verificações simples com `AssertionError` e `IllegalArgumentException`.

Os testes atuais verificam:

1. frequência de 18 presenças em 20 aulas = 90%;
2. frequência quando não existem aulas = 0%;
3. rejeição de presenças negativas;
4. rejeição de presenças maiores que o número de aulas;
5. rejeição de número negativo de aulas.

O arquivo imprime uma mensagem no formato:

```text
OK: X testes do desenvolvimento incremental.
```

Ao alterar uma regra de negócio, atualizar ou criar testes correspondentes.

**Não remover um teste apenas para fazer o código passar.**

---

## 7. POO já trabalhada no projeto

O repositório possui atividades relacionadas a diferentes conceitos de POO.

### Encapsulamento e validação

O arquivo `codigo/segunda-feira/encapsulamento-validacao/Aluno.java` utiliza atributos privados e validações.

Ao modificar classes semelhantes:

* preservar o encapsulamento;
* evitar acesso direto desnecessário aos atributos;
* manter objetos em estado válido quando possível;
* usar exceções apropriadas para entradas inválidas.

### Herança e polimorfismo

O arquivo `codigo/segunda-feira/polimorfismotest.java` demonstra:

```text
Pessoa
├── Aluno
└── Instrutor
```

`Pessoa` é abstrata e define `apresentar()`.

`Aluno` e `Instrutor` sobrescrevem esse método com comportamentos diferentes.

A ideia central é permitir que uma referência do tipo `Pessoa` execute o comportamento específico do objeto sem depender de `instanceof` ou casts.

Ao continuar esse exercício, preservar esse princípio de polimorfismo.

### Composição

Os arquivos relacionados à atividade de composição apresentam a relação:

```text
Treino
└── Exercicios
```

O conceito trabalhado é que `Treino` controla os objetos `Exercicio` que fazem parte de sua estrutura.

A atividade também demonstra operações como:

* adicionar exercício;
* calcular repetições totais delegando aos exercícios;
* esvaziar os exercícios.

Não confundir automaticamente a atividade didática com uma implementação final integrada ao restante do sistema.

---

## 8. Regras para alterações feitas por IA

A IA deve:

1. Fazer a menor alteração necessária.
2. Preservar funcionalidades existentes.
3. Não apagar código sem justificativa.
4. Respeitar os nomes e o idioma já usados pelo projeto.
5. Manter o estilo simples do código.
6. Evitar abstrações desnecessárias.
7. Não adicionar dependências externas sem necessidade.
8. Não inventar requisitos.
9. Não inventar regras de negócio.
10. Não afirmar que algo foi testado sem realmente verificar.
11. Não afirmar que uma funcionalidade existe apenas porque aparece no README.
12. Atualizar documentação quando uma alteração realmente mudar o comportamento do sistema.
13. Separar claramente alterações de código, documentação e atividades acadêmicas.
14. Preservar exemplos e dados fictícios.
15. Não inserir credenciais, tokens, senhas ou chaves de API.

---

## 9. Regras de negócio

Somente implementar regras que estejam definidas no código, documentação ou solicitação explícita do usuário.

Não inventar, por exemplo:

* idade mínima ou máxima;
* frequência mínima obrigatória;
* cálculo de IMC;
* metas de peso;
* regras de pagamento;
* permissões detalhadas;
* autenticação;
* regras de exclusão;
* notificações;
* integração com banco de dados.

Quando uma regra for necessária e não estiver definida, perguntar ou registrar claramente a decisão antes de implementar.

---

## 10. Dados pessoais e segurança

O sistema pode representar dados pessoais de alunos.

A IA deve:

* usar somente dados fictícios em exemplos e testes;
* não inserir CPF, telefone, endereço ou outros dados reais desnecessariamente;
* nunca adicionar senhas, tokens ou chaves secretas;
* evitar colocar informações pessoais reais em documentação, exemplos ou commits.

---

## 11. Testes e validação antes de concluir

Quando houver alteração de código:

1. Identificar os arquivos afetados.
2. Compilar o código relacionado, quando possível.
3. Executar os testes existentes.
4. Verificar se o comportamento anterior foi preservado.
5. Corrigir erros encontrados.
6. Informar exatamente o que foi validado.

O script `executar-testes.bat`, quando aplicável, deve ser priorizado como forma oficial de execução.

Se a IA não tiver ambiente adequado para executar um teste, deve dizer isso explicit
