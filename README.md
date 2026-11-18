# Academia do Eduzão e do Luizão

Uma aplicação para gerenciar alunos, instrutores e treinos de academias de pequeno porte, substituindo controles em planilhas e anotações por um sistema centralizado e organizado.

## Problema

Muitas academias utilizam planilhas ou anotações para controlar alunos e treinos, o que dificulta organização, histórico de evolução e compartilhamento entre instrutores. Este projeto tem como objetivo centralizar o cadastro e o acompanhamento de treinos, tornando mais fácil o gerenciamento e a consulta das informações.

## Público-alvo

- Alunos da academia
- Instrutores
- Administradores da academia

## Funcionalidades iniciais

- Cadastro de alunos
- Cadastro de instrutores
- Cadastro de treinos
- Associação de treinos aos alunos
- Consulta dos treinos de cada aluno
- Atualização de treinos
- Exclusão de alunos e treinos
- Pesquisa de alunos por nome

## Histórias de usuário

- Como aluno, quero visualizar meus treinos para saber quais exercícios devo realizar.
- Como instrutor, quero cadastrar alunos para manter o controle dos clientes da academia.
- Como instrutor, quero cadastrar treinos para montar programas de exercícios personalizados.
- Como instrutor, quero associar um treino a um aluno para que ele tenha acesso ao seu plano de exercícios.
- Como instrutor, quero atualizar um treino para acompanhar a evolução do aluno.
- Como instrutor, quero remover treinos antigos para manter o sistema organizado.
- Como administrador, quero cadastrar instrutores para controlar quem pode acessar o sistema.
- Como administrador, quero pesquisar alunos para localizar rapidamente seus dados.
- Como administrador, quero excluir alunos inativos para manter o cadastro atualizado.

## Backlog inicial (prioridade)

| Prioridade | Funcionalidade |
|---|---|
| Alta | Cadastro de alunos |
| Alta | Cadastro de treinos |
| Alta | Associar treino ao aluno |
| Alta | Visualizar treinos do aluno |
| Média | Atualizar treinos |
| Média | Pesquisa de alunos |
| Média | Cadastro de instrutores |
| Baixa | Exclusão de treinos |
| Baixa | Exclusão de alunos inativos |

## Como contribuir

1. Faça um fork do repositório.
2. Crie uma branch com sua feature: `git checkout -b feature/nome-da-feature`.
3. Faça as alterações e commite: `git commit -m "Minha contribuição"`.
4. Envie para o repositório remoto e abra um Pull Request.

## Licença

Licença a definir — adicione aqui a licença do projeto (por exemplo: MIT).

### Polimorfismo

O projeto utiliza polimorfismo através da classe abstrata Pessoa.

Aluno e Instrutor herdam de Pessoa e implementam o método apresentar()
de maneiras diferentes.

A classe Academia recebe uma referência do tipo Pessoa e chama o
método apresentar() sem verificar se o objeto é um Aluno ou um
Instrutor.

Dessa forma, o mesmo código pode executar comportamentos diferentes
dependendo do objeto recebido. Não são utilizados instanceof, casts
ou verificações de tipo.

Isso caracteriza polimorfismo porque o código cliente trabalha com
a abstração Pessoa enquanto cada classe concreta fornece seu próprio
comportamento.
                 Pessoa
                /      \
               /        \
           Aluno      Instrutor
             ↓            ↓
       apresentar()  apresentar()
             \            /
              \          /
               Academia
# 🏋️ Academia do Eduzão e do Luizão

## 📌 Sobre o projeto

O projeto Academia do Eduzão e do Luizão consiste no desenvolvimento de um sistema para gerenciamento de academias, permitindo organizar informações de alunos, instrutores e treinos.

A proposta é facilitar o gerenciamento das atividades de uma academia por meio de um sistema organizado, reduzindo a dependência de planilhas e anotações manuais.

## 🎯 Objetivo

Desenvolver uma aplicação utilizando Java e os conceitos de Programação Orientada a Objetos (POO), proporcionando melhor organização das informações e facilitando o gerenciamento de alunos, instrutores e treinos.

## 👥 Equipe e responsabilidades

| Integrante | Responsabilidade |
|---|---|
| Eduardo Weber Laux | Desenvolvimento, documentação e organização do projeto |
| Luizão | Desenvolvimento e modelagem do sistema |
| Kleber | [Adicionar responsabilidade] |
| Homio | [Adicionar responsabilidade] |

As responsabilidades são distribuídas entre os integrantes, envolvendo planejamento, desenvolvimento, documentação, testes e organização do projeto.

## 🛠️ Tecnologias utilizadas

- **Java:** linguagem de programação utilizada no desenvolvimento.
- **Git:** ferramenta de controle de versão.
- **GitHub:** plataforma de hospedagem do código e documentação.
- **Programação Orientada a Objetos:** utilização de classes, objetos, herança, encapsulamento e polimorfismo.

## ⚙️ Funcionalidades do sistema

- Cadastro de alunos.
- Cadastro de instrutores.
- Cadastro e gerenciamento de treinos.
- Associação de treinos aos alunos.
- Consulta de informações cadastradas.
- Organização dos dados por meio de classes e objetos.

*Observação: manter nesta lista somente as funcionalidades efetivamente implementadas e disponíveis na versão atual.*

## 📋 Requisitos do sistema

### Requisitos funcionais

- **RF01:** O sistema deve permitir cadastrar alunos.
- **RF02:** O sistema deve permitir cadastrar instrutores.
- **RF03:** O sistema deve permitir cadastrar treinos.
- **RF04:** O sistema deve permitir associar treinos aos alunos.
- **RF05:** O sistema deve permitir consultar informações cadastradas.

### Requisitos não funcionais

- **RNF01:** O código deve ser organizado em pacotes.
- **RNF02:** O sistema deve utilizar princípios de Programação Orientada a Objetos.
- **RNF03:** O código deve permitir manutenção e evolução do sistema.

*Os identificadores e descrições devem corresponder aos requisitos oficiais registrados na documentação do projeto.*

## 🏗️ Arquitetura do sistema

O projeto utiliza uma organização baseada em pacotes, buscando separar as responsabilidades e facilitar a manutenção do código.

A estrutura considera as seguintes responsabilidades:

- **dominio:** contém as classes principais e as regras de negócio.
- **servico:** concentra operações e funcionalidades do sistema, caso presente na implementação.
- **repositorio:** responsável pelo armazenamento e recuperação dos dados.
- **app:** contém a classe principal (`Main`) e inicia a aplicação.

Essa organização contribui para a separação de responsabilidades, reutilização de código e evolução do sistema.

### Programação Orientada a Objetos

O sistema utiliza conceitos fundamentais de POO:

- **Encapsulamento:** proteção e controle do acesso aos atributos.
- **Herança:** reutilização de características entre classes.
- **Polimorfismo:** possibilidade de utilizar comportamentos especializados por meio de uma estrutura comum.
- **Abstração:** representação dos elementos importantes do domínio do sistema.

## ▶️ Como executar o projeto

1. Clone o repositório:

   ```bash
   git clone https://github.com/eduardolaux395-png/Academia-e-treinos-do-luizao-e-do-edu.git
   ```

2. Abra o projeto em uma IDE compatível com Java.

3. Localize a classe `Main`, dentro do pacote responsável pela inicialização da aplicação.

4. Execute o método `main()`.

5. Utilize as funcionalidades disponíveis no sistema.

## 🧪 Testes

Os testes têm como objetivo verificar o funcionamento das principais funcionalidades do sistema.

Os cenários de teste devem contemplar:

- Cadastro de alunos.
- Cadastro de instrutores.
- Cadastro de treinos.
- Associação de treinos aos alunos.
- Consulta de informações cadastradas.
- Verificação de comportamentos esperados e tratamento de situações inválidas.

Os resultados devem ser registrados na documentação de testes, indicando os cenários executados e seus respectivos resultados.

## 📚 Documentação do projeto

A documentação do projeto está organizada em etapas, registrando a evolução desde a identificação do problema até o desenvolvimento e validação da solução.

| Documento | Conteúdo |
|---|---|
| `docs/01` | Problema, contexto, público-alvo e stakeholders |
| `docs/02` | Ciclo de vida e planejamento do projeto |
| `docs/03` | Entrevistas e levantamento de necessidades |
| `docs/04` | Requisitos funcionais e não funcionais |
| `docs/05` | Modelagem, histórias de usuário e critérios de aceitação |
| `docs/06` | Planejamento, arquitetura e rastreabilidade |

*Os caminhos e nomes devem ser ajustados para corresponder às pastas existentes no repositório.*

## 🔗 Matriz de rastreabilidade

A rastreabilidade permite acompanhar a relação entre as necessidades identificadas e as funcionalidades desenvolvidas.

O fluxo considera:

1. Necessidade identificada durante a entrevista.
2. História de usuário relacionada.
3. Requisito funcional correspondente.
4. Critério de aceitação.
5. Modelo ou diagrama relacionado.
6. Componente responsável pela implementação.
7. Caso de teste correspondente.
8. Solicitação de mudança e versão em que foi aplicada, quando houver.

Essa organização permite verificar a origem dos requisitos, acompanhar sua implementação e demonstrar como cada necessidade foi tratada durante o desenvolvimento.

## 🔄 Controle de mudanças

As alterações realizadas no projeto devem ser documentadas, permitindo acompanhar a evolução do sistema.

Cada solicitação de mudança deve considerar:

- Descrição da alteração solicitada.
- Motivo da mudança.
- Requisitos e componentes afetados.
- Impactos na documentação e nos testes.
- Decisão da equipe sobre aprovação ou rejeição.
- Versão em que a alteração foi implementada, quando aprovada.

As alterações e correções devem ser registradas no arquivo `CHANGELOG.md`.

## 📌 Versão do projeto

**Versão atual:** [Informar a versão real do projeto]

O histórico de alterações, correções e melhorias está disponível no arquivo `CHANGELOG.md`.

## 🤖 Declaração de uso de Inteligência Artificial

A Inteligência Artificial foi utilizada como ferramenta de apoio durante o desenvolvimento do projeto, auxiliando na organização da documentação, esclarecimento de conceitos, revisão de conteúdos e sugestões de melhorias.

As decisões finais, validações e responsabilidades pelo desenvolvimento permanecem com os integrantes da equipe.

Os registros detalhados de utilização da Inteligência Artificial estão disponíveis no arquivo `IA.md`.

## 📂 Repositório

O código-fonte, a documentação e o histórico de desenvolvimento estão disponíveis no GitHub:

[Academia do Eduzão e do Luizão](https://github.com/eduardolaux395-png/Academia-e-treinos-do-luizao-e-do-edu)

---

**Projeto acadêmico desenvolvido como parte das atividades de desenvolvimento de software.**
