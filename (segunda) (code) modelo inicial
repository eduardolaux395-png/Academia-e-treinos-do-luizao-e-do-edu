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
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    // Método definido no diagrama
    public void visualizarTreino(Treino treino) {
        System.out.println("\n===== TREINO DO ALUNO =====");
        treino.exibirDados();
    }

    // Método definido no diagrama
    public void atualizarDados(String nome, int idade, String telefone) {
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
}


// ==========================
// CLASSE INSTRUTOR
// ==========================
class Instrutor {

    private int id;
    private String nome;
    private String cref;
    private String especialidade;

    public Instrutor(int id, String nome, String cref, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.cref = cref;
        this.especialidade = especialidade;
    }

    // Método definido no diagrama
    public void cadastrarTreino(Treino treino) {
        System.out.println(
            "Instrutor " + nome +
            " cadastrou o treino: " + treino.getNome()
        );
    }

    // Método definido no diagrama
    public void atualizarTreino(Treino treino, String descricao, int duracao) {
        treino.setDescricao(descricao);
        treino.setDuracao(duracao);

        System.out.println("Treino atualizado pelo instrutor " + nome);
    }

    public void exibirDados() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("CREF: " + cref);
        System.out.println("Especialidade: " + especialidade);
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

    public Treino(int id, String nome, String descricao, int duracao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.exercicios = new ArrayList<>();
    }

    // Método definido no diagrama
    public void adicionarExercicio(String exercicio) {
        exercicios.add(exercicio);

        System.out.println(
            "Exercício \"" + exercicio +
            "\" adicionado ao treino."
        );
    }

    // Método definido no diagrama
    public void removerExercicio(String exercicio) {

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

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
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
        this.nome = nome;
        this.endereco = endereco;

        alunos = new ArrayList<>();
        instrutores = new ArrayList<>();
    }

    // Método definido no diagrama
    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);

        System.out.println(
            "Aluno " + aluno.getNome() +
            " cadastrado com sucesso!"
        );
    }

    // Método definido no diagrama
    public void cadastrarInstrutor(Instrutor instrutor) {
        instrutores.add(instrutor);

        System.out.println(
            "Instrutor cadastrado com sucesso!"
        );
    }

    // Método definido no diagrama
    public void pesquisarAluno(int id) {

        for (Aluno aluno : alunos) {

            if (aluno.getId() == id) {
                System.out.println("\nAluno encontrado:");
                aluno.exibirDados();
                return;
            }
        }

        System.out.println("Aluno não encontrado.");
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

        // Criando a academia
        Academia academia = new Academia(
            "Academia Eduzão e Luizão",
            "Rua Principal, 100"
        );

        // Criando um aluno
        Aluno aluno = new Aluno(
            1,
            "João",
            20,
            "51999999999"
        );

        // Criando um instrutor
        Instrutor instrutor = new Instrutor(
            1,
            "Carlos",
            "123456-G/RS",
            "Musculação"
        );

        // Criando um treino
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
    }
}
