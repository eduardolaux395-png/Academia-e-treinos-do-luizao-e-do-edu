import java.util.ArrayList;
import java.util.List;

// ==========================
// CLASSE ALUNO
// ==========================
class Aluno {

private int id;
private String nome;
private int idade;
private String telefone;

public Aluno(int id, String nome, int idade, String telefone) {
    validarId(id);
    validarNome(nome);
    validarIdade(idade);
    validarTelefone(telefone);

    this.id = id;
    this.nome = nome;
    this.idade = idade;
    this.telefone = telefone;
}

// Método definido no diagrama
public void visualizarTreino(Treino treino) {
    if (treino == null) {
        throw new IllegalArgumentException("O treino não pode ser nulo.");
    }

    System.out.println("\n===== TREINO DO ALUNO =====");
    treino.exibirDados();
}

// Método definido no diagrama
public void atualizarDados(String nome, int idade, String telefone) {
    validarNome(nome);
    validarIdade(idade);
    validarTelefone(telefone);

    this.nome = nome;
    this.idade = idade;
    this.telefone = telefone;

    System.out.println("Dados do aluno atualizados!");
}

public void exibirDados() {
    System.out.println("ID: " + id);
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Telefone: " + telefone);
}

public int getId() {
    return id;
}

public String getNome() {
    return nome;
}

private void validarId(int id) {
    if (id <= 0) {
        throw new IllegalArgumentException(
            "O ID do aluno deve ser maior que zero."
        );
    }
}

private void validarNome(String nome) {
    if (nome == null || nome.trim().isEmpty()) {
        throw new IllegalArgumentException(
            "O nome do aluno não pode ser vazio."
        );
    }
}

private void validarIdade(int idade) {
    if (idade <= 0) {
        throw new IllegalArgumentException(
            "A idade deve ser maior que zero."
        );
    }
}

private void validarTelefone(String telefone) {
    if (telefone == null || telefone.trim().isEmpty()) {
        throw new IllegalArgumentException(
            "O telefone não pode ser vazio."
        );
    }
}

}

// ==========================
// CLASSE INSTRUTOR
// ==========================
class Instrutor {

private int id;
private String nome;
private String cref;
private String especialidade;

public Instrutor(
    int id,
    String nome,
    String cref,
    String especialidade
) {
    validarId(id);
    validarTexto(nome, "O nome do instrutor");
    validarTexto(cref, "O CREF");
    validarTexto(especialidade, "A especialidade");

    this.id = id;
    this.nome = nome;
    this.cref = cref;
    this.especialidade = especialidade;
}

// Método definido no diagrama
public void cadastrarTreino(Treino treino) {
    if (treino == null) {
        throw new IllegalArgumentException(
            "O treino não pode ser nulo."
        );
    }

    System.out.println(
        "Instrutor " + nome +
        " cadastrou o treino: " + treino.getNome()
    );
}

// Método definido no diagrama
public void atualizarTreino(
    Treino treino,
    String descricao,
    int duracao
) {
    if (treino == null) {
        throw new IllegalArgumentException(
            "O treino não pode ser nulo."
        );
    }

    treino.setDescricao(descricao);
    treino.setDuracao(duracao);

    System.out.println(
        "Treino atualizado pelo instrutor " + nome
    );
}

public void exibirDados() {
    System.out.println("ID: " + id);
    System.out.println("Nome: " + nome);
    System.out.println("CREF: " + cref);
    System.out.println("Especialidade: " + especialidade);
}

public int getId() {
    return id;
}

public String getNome() {
    return nome;
}

private void validarId(int id) {
    if (id <= 0) {
        throw new IllegalArgumentException(
            "O ID do instrutor deve ser maior que zero."
        );
    }
}

private void validarTexto(String texto, String campo) {
    if (texto == null || texto.trim().isEmpty()) {
        throw new IllegalArgumentException(
            campo + " não pode ser vazio."
        );
    }
}

}

// ==========================
// CLASSE TREINO
// ==========================
class Treino {

private int id;
private String nome;
private String descricao;
private int duracao;

private List<String> exercicios;

public Treino(
    int id,
    String nome,
    String descricao,
    int duracao
) {
    validarId(id);
    validarTexto(nome, "O nome do treino");
    validarTexto(descricao, "A descrição do treino");
    validarDuracao(duracao);

    this.id = id;
    this.nome = nome;
    this.descricao = descricao;
    this.duracao = duracao;
    this.exercicios = new ArrayList<>();
}

// Método definido no diagrama
public void adicionarExercicio(String exercicio) {

    validarTexto(exercicio, "O exercício");

    if (exercicios.contains(exercicio)) {
        throw new IllegalArgumentException(
            "Esse exercício já está cadastrado no treino."
        );
    }

    exercicios.add(exercicio);

    System.out.println(
        "Exercício \"" + exercicio +
        "\" adicionado ao treino."
    );
}

// Método definido no diagrama
public void removerExercicio(String exercicio) {

    validarTexto(exercicio, "O exercício");

    if (exercicios.remove(exercicio)) {
        System.out.println(
            "Exercício \"" + exercicio +
            "\" removido do treino."
        );
    } else {
        System.out.println("Exercício não encontrado.");
    }
}

public void exibirDados() {

    System.out.println("ID: " + id);
    System.out.println("Nome: " + nome);
    System.out.println("Descrição: " + descricao);
    System.out.println("Duração: " + duracao + " minutos");

    System.out.println("Exercícios:");

    if (exercicios.isEmpty()) {
        System.out.println("- Nenhum exercício cadastrado");
    } else {
        for (String exercicio : exercicios) {
            System.out.println("- " + exercicio);
        }
    }
}

public int getId() {
    return id;
}

public String getNome() {
    return nome;
}

public String getDescricao() {
    return descricao;
}

public int getDuracao() {
    return duracao;
}

public void setDescricao(String descricao) {
    validarTexto(descricao, "A descrição do treino");
    this.descricao = descricao;
}

public void setDuracao(int duracao) {
    validarDuracao(duracao);
    this.duracao = duracao;
}

private void validarId(int id) {
    if (id <= 0) {
        throw new IllegalArgumentException(
            "O ID do treino deve ser maior que zero."
        );
    }
}

private void validarTexto(String texto, String campo) {
    if (texto == null || texto.trim().isEmpty()) {
        throw new IllegalArgumentException(
            campo + " não pode ser vazio."
        );
    }
}

private void validarDuracao(int duracao) {
    if (duracao <= 0) {
        throw new IllegalArgumentException(
            "A duração do treino deve ser maior que zero."
        );
    }
}

}

// ==========================
// CLASSE ACADEMIA
// ==========================
class Academia {

private String nome;
private String endereco;

private List<Aluno> alunos;
private List<Instrutor> instrutores;

public Academia(String nome, String endereco) {

    if (nome == null || nome.trim().isEmpty()) {
        throw new IllegalArgumentException(
            "O nome da academia não pode ser vazio."
        );
    }

    if (endereco == null || endereco.trim().isEmpty()) {
        throw new IllegalArgumentException(
            "O endereço não pode ser vazio."
        );
    }

    this.nome = nome;
    this.endereco = endereco;

    alunos = new ArrayList<>();
    instrutores = new ArrayList<>();
}

// Método definido no diagrama
public void cadastrarAluno(Aluno aluno) {

    if (aluno == null) {
        throw new IllegalArgumentException(
            "O aluno não pode ser nulo."
        );
    }

    for (Aluno existente : alunos) {
        if (existente.getId() == aluno.getId()) {
            throw new IllegalArgumentException(
                "Já existe um aluno com o ID " + aluno.getId() + "."
            );
        }
    }

    alunos.add(aluno);

    System.out.println(
        "Aluno " + aluno.getNome() +
        " cadastrado com sucesso!"
    );
}

// Método definido no diagrama
public void cadastrarInstrutor(Instrutor instrutor) {

    if (instrutor == null) {
        throw new IllegalArgumentException(
            "O instrutor não pode ser nulo."
        );
    }

    for (Instrutor existente : instrutores) {
        if (existente.getId() == instrutor.getId()) {
            throw new IllegalArgumentException(
                "Já existe um instrutor com o ID "
                + instrutor.getId() + "."
            );
        }
    }

    instrutores.add(instrutor);

    System.out.println(
        "Instrutor " + instrutor.getNome() +
        " cadastrado com sucesso!"
    );
}

// Método definido no diagrama
public void pesquisarAluno(int id) {

    if (id <= 0) {
        System.out.println("O ID deve ser maior que zero.");
        return;
    }

    for (Aluno aluno : alunos) {

        if (aluno.getId() == id) {
            System.out.println("\nAluno encontrado:");
            aluno.exibirDados();
            return;
        }
    }

    System.out.println("Aluno não encontrado.");
}

public void exibirDados() {
    System.out.println("Nome da academia: " + nome);
    System.out.println("Endereço: " + endereco);
    System.out.println("Quantidade de alunos: " + alunos.size());
    System.out.println(
        "Quantidade de instrutores: " + instrutores.size()
    );
}

}

// ==========================
// CLASSE MAIN
// ==========================
public class Main {

public static void main(String[] args) {

    System.out.println("================================");
    System.out.println("      SISTEMA DA ACADEMIA");
    System.out.println("================================");

    // ==========================
    // CRIANDO A ACADEMIA
    // ==========================

    Academia academia = new Academia(
        "Academia Eduzão e Luizão",
        "Rua Principal, 100"
    );

    // ==========================
    // CRIANDO UM ALUNO
    // ==========================

    Aluno aluno = new Aluno(
        1,
        "João",
        20,
        "51999999999"
    );

    // ==========================
    // CRIANDO UM INSTRUTOR
    // ==========================

    Instrutor instrutor = new Instrutor(
        1,
        "Carlos",
        "123456-G/RS",
        "Musculação"
    );

    // ==========================
    // CRIANDO UM TREINO
    // ==========================

    Treino treino = new Treino(
        1,
        "Treino A",
        "Treino para membros superiores",
        60
    );

    // ==========================
    // CADASTROS
    // ==========================

    academia.cadastrarAluno(aluno);
    academia.cadastrarInstrutor(instrutor);

    // ==========================
    // TREINO
    // ==========================

    instrutor.cadastrarTreino(treino);

    treino.adicionarExercicio("Supino reto");
    treino.adicionarExercicio("Rosca direta");
    treino.adicionarExercicio("Tríceps pulley");

    // ==========================
    // PESQUISAR ALUNO
    // ==========================

    academia.pesquisarAluno(1);

    // ==========================
    // ALUNO VISUALIZA TREINO
    // ==========================

    aluno.visualizarTreino(treino);

    // ==========================
    // ATUALIZAR TREINO
    // ==========================

    instrutor.atualizarTreino(
        treino,
        "Treino atualizado para membros superiores",
        70
    );

    // ==========================
    // EXIBIR TREINO ATUALIZADO
    // ==========================

    aluno.visualizarTreino(treino);

    // ==========================
    // INFORMAÇÕES DA ACADEMIA
    // ==========================

    System.out.println("\n===== INFORMAÇÕES DA ACADEMIA =====");
    academia.exibirDados();
}

}

