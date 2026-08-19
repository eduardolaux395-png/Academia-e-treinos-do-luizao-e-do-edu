public class Aluno {
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

    public void visualizarTreino() {
        System.out.println(nome + " está visualizando seu treino.");
    }

    public void atualizarDados(String telefone) {
        this.telefone = telefone;
        System.out.println("Dados do aluno atualizados.");
    }

    public String getNome() {
        return nome;
    }
}

-------------------------------------------------
public class Instrutor {
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

    public void cadastrarTreino() {
        System.out.println(nome + " cadastrou um novo treino.");
    }

    public void atualizarTreino() {
        System.out.println(nome + " atualizou um treino.");
    }

    public String getNome() {
        return nome;
    }
}

----------------------------------------------------
public class Treino {
    private int id;
    private String nome;
    private String descricao;
    private int duracao;

    public Treino(int id, String nome, String descricao, int duracao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
    }

    public void adicionarExercicio(String exercicio) {
        System.out.println("Exercício adicionado: " + exercicio);
    }

    public void removerExercicio(String exercicio) {
        System.out.println("Exercício removido: " + exercicio);
    }

    public void exibirTreino() {
        System.out.println("Treino: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Duração: " + duracao + " minutos");
    }
}

-------------------------------------------------------------
public class Academia {
    private String nome;
    private String endereco;

    public Academia(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void cadastrarAluno(Aluno aluno) {
        System.out.println("Aluno cadastrado: " + aluno.getNome());
    }

    public void cadastrarInstrutor(Instrutor instrutor) {
        System.out.println("Instrutor cadastrado: " + instrutor.getNome());
    }

    public void pesquisarAluno(String nome) {
        System.out.println("Pesquisando aluno: " + nome);
    }
}

------------------------------------------------------------
public class Main {
    public static void main(String[] args) {

        // Criando a academia
        Academia academia = new Academia(
                "Academia do Eduzão e do Luizão",
                "Rua Principal, 100"
        );

        // Criando um aluno
        Aluno aluno = new Aluno(
                1,
                "Luiz",
                18,
                "99999-9999"
        );

        // Criando um instrutor
        Instrutor instrutor = new Instrutor(
                1,
                "Eduardo",
                "CREF12345",
                "Musculação"
        );

        // Criando um treino
        Treino treino = new Treino(
                1,
                "Treino A",
                "Peito, ombro e tríceps",
                60
        );

        // Cenário do sistema
        System.out.println("===== SISTEMA DA ACADEMIA =====");

        academia.cadastrarAluno(aluno);
        academia.cadastrarInstrutor(instrutor);

        instrutor.cadastrarTreino();

        treino.adicionarExercicio("Supino reto");
        treino.adicionarExercicio("Desenvolvimento");
        treino.adicionarExercicio("Tríceps pulley");

        System.out.println();

        aluno.visualizarTreino();

        System.out.println();

        treino.exibirTreino();

        System.out.println();

        academia.pesquisarAluno("Luiz");
    }
}

----------------------------------------------------------
