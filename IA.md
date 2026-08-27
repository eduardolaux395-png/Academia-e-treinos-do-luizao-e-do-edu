# Instruções para IA — Academia do Eduzão e do Luizão

## 1. Sobre o projeto

Este repositório contém o desenvolvimento de um sistema para gerenciamento de uma academia de pequeno porte.

O sistema tem como objetivo centralizar informações que poderiam ser controladas por planilhas ou anotações, permitindo gerenciar:

* alunos;
* instrutores;
* treinos;
* associação de treinos aos alunos;
* frequência;
* evolução física;
* consultas e atualizações de informações.

O público-alvo é composto principalmente por alunos, instrutores e administradores da academia.

Antes de realizar qualquer alteração, a IA deve consultar o `README.md` e a estrutura atual do projeto para entender o estado mais recente do desenvolvimento.

---

## 2. Tecnologias

O projeto utiliza principalmente:

* Java;
* programação orientada a objetos;
* classes e objetos;
* construtores;
* métodos;
* encapsulamento;
* validação de dados;
* testes automatizados simples.

Não introduzir frameworks, bibliotecas ou tecnologias externas sem necessidade e sem solicitação explícita.

---

## 3. Estrutura do projeto

A estrutura principal atualmente é:

```text
/
├── codigo/
│   ├── segunda-feira/
│   │   ├── modelo-inicial/
│   │   ├── construtores-e-metodos/
│   │   └── encapsulamento-validacao/
│   │
│   └── quarta-feira/
│       └── desenvolvimento-incremental/
│
├── documentacao/
├── README.md
├── IA.md
└── executar-testes.bat
```

As pastas dentro de `codigo` representam etapas do desenvolvimento. Não tratar necessariamente cada pasta como código de produção definitivo.

---

## 4. Estado atual do sistema

O projeto está sendo desenvolvido incrementalmente.

Existe uma implementação de `Aluno` que utiliza atributos privados:

* `nome`;
* `idade`;
* `cpf`.

A classe possui construtor, getters e setters e validações para impedir dados inválidos.

As validações atuais incluem:

* nome não pode ser nulo ou vazio;
* idade deve ser maior que zero;
* CPF deve possuir exatamente 11 dígitos.

Ao alterar essas regras, preservar o princípio de encapsulamento e a validação dos dados.

---

## 5. Desenvolvimento incremental

A versão de desenvolvimento incremental possui classes relacionadas a:

### Aluno

Representa um aluno da academia e possui informações como:

* nome;
* idade;
* telefone.

### Treino

Representa um treino e possui:

* nome;
* descrição.

### Frequencia

Representa a frequência do aluno.

Possui:

* total de presenças;
* total de aulas;
* cálculo percentual de frequência.

A regra atual é:

```text
frequência = (total de presenças / total de aulas) * 100
```

Quando não existem aulas, o resultado deve ser `0`.

Também devem ser rejeitados:

* valores negativos;
* número de presenças maior que o número de aulas.

### Evolucao

Representa informações básicas de evolução física, atualmente:

* peso;
* altura.

---

## 6. Regras para alterações feitas por IA

Ao modificar o projeto, a IA deve:

1. Entender primeiro o código existente.
2. Evitar alterações desnecessárias.
3. Não apagar funcionalidades existentes sem justificativa.
4. Preservar o estilo de programação já utilizado.
5. Manter nomes de classes e métodos em português quando eles já estiverem em português.
6. Preferir soluções simples e adequadas ao nível atual do projeto.
7. Não adicionar dependências externas sem necessidade.
8. Não transformar um exercício acadêmico simples em uma arquitetura excessivamente complexa.
9. Não criar funcionalidades que não foram solicitadas.
10. Explicar alterações relevantes antes ou depois de implementá-las.

---

## 7. Programação orientada a objetos

As implementações devem priorizar os conceitos de POO trabalhados no projeto.

### Encapsulamento

Atributos devem permanecer `private` quando fizer sentido.

O acesso aos dados deve ocorrer por métodos apropriados.

### Construtores

Os construtores devem garantir que os objetos sejam criados em um estado válido sempre que possível.

### Validação

Dados inválidos devem ser rejeitados explicitamente.

Quando uma regra de negócio não puder ser atendida, utilizar uma exceção apropriada, como `IllegalArgumentException`.

---

## 8. Testes

Toda alteração que modificar comportamento existente deve considerar os testes.

O projeto possui uma classe `Testes.java` que verifica regras como:

* cálculo de frequência;
* frequência sem aulas;
* rejeição de presenças negativas;
* rejeição de presenças maiores que o número de aulas;
* rejeição de quantidade negativa de aulas.

Ao criar uma nova regra de negócio importante, adicionar também um teste correspondente.

Não remover testes apenas para fazer o código passar.

---

## 9. Execução e validação

Antes de considerar uma alteração concluída:

1. Compilar o código alterado.
2. Executar os testes existentes.
3. Verificar se as funcionalidades anteriores continuam funcionando.
4. Corrigir erros de compilação ou comportamento encontrados.
5. Informar claramente quais testes foram executados.

Quando existir um script oficial de testes no projeto, priorizar seu uso.

---

## 10. Regras de negócio

Não inventar regras de negócio.

Se uma informação não estiver definida no código, documentação ou solicitação do usuário, perguntar ou deixar a decisão explícita.

Exemplos de regras que não devem ser inventadas:

* limite máximo de idade;
* frequência mínima obrigatória;
* cálculo de IMC;
* limite de peso;
* regras de pagamento;
* permissões específicas de usuários;
* regras de exclusão de alunos.

Essas regras somente devem ser implementadas quando forem definidas pelo projeto.

---

## 11. Segurança e dados

O sistema trabalha potencialmente com dados pessoais de alunos.

Não inserir dados pessoais reais no código.

Para exemplos e testes, utilizar dados fictícios.

Não adicionar senhas, tokens, chaves de API ou outras credenciais ao repositório.

---

## 12. Documentação

Quando uma alteração mudar o funcionamento do sistema, verificar se o `README.md` ou os documentos existentes precisam ser atualizados.

A documentação deve refletir o comportamento real do código.

Não documentar funcionalidades que ainda não existem.

---

## 13. Git

Ao sugerir commits:

* utilizar mensagens claras;
* descrever objetivamente a alteração;
* evitar commits que misturem várias funcionalidades sem relação.

Exemplos:

```text
feat: adiciona validação de aluno
test: adiciona testes de frequência
docs: atualiza documentação do projeto
refactor: organiza classe Aluno
```

Não realizar operações destrutivas de Git sem autorização explícita.

---

## 14. Como a IA deve responder

Ao receber uma solicitação relacionada ao projeto:

1. Identificar quais arquivos serão afetados.
2. Verificar o código existente antes de propor uma solução.
3. Explicar brevemente o que será alterado.
4. Fazer a menor alteração necessária.
5. Validar a solução.
6. Informar arquivos alterados.
7. Informar testes executados e seus resultados.
8. Caso exista alguma dúvida de requisito, não inventar uma resposta.

A IA deve priorizar **correção, simplicidade, consistência com o código existente e aprendizado dos conceitos de programação orientada a objetos**.

---

## 15. Regra principal

Este é um projeto acadêmico em desenvolvimento incremental.

A IA deve ajudar a desenvolver o projeto sem esconder a lógica por trás de soluções excessivamente complexas.

Sempre preferir:

**solução simples + código legível + validação + testes + explicação.**





Analisei o repositório do projeto Academia do Eduzão e do Luizão. O README confirma que o sistema tem como objetivo centralizar o cadastro e acompanhamento de alunos e treinos, com alunos, instrutores e administradores como público-alvo. As funcionalidades atuais incluem cadastro, associação e consulta de treinos, atualização, exclusão e pesquisa de alunos. Também há no repositório os documentos das atividades anteriores, incluindo a entrevista de elicitação, o recorte do problema e o esboço inicial de requisitos.

Abaixo está uma versão já revisada e organizada para a AP1, corrigindo principalmente problemas de ambiguidade, verificabilidade e falta de regras de acesso.

