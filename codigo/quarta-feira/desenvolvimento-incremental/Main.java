class Aluno {
    private String nome;
    private int idade;
    private String telefone;

    public Aluno(String nome, int idade, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Telefone: " + telefone);
    }
}

class Treino {
    private String nome;
    private String descricao;

    public Treino(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public void exibirTreino() {
        System.out.println("Treino: " + nome);
        System.out.println("Descrição: " + descricao);
    }
}

class Frequencia {
    private int totalPresencas;
    private int totalAulas;

    public Frequencia(int totalPresencas, int totalAulas) {
        if (totalAulas < 0 || totalPresencas < 0 || totalPresencas > totalAulas) {
            throw new IllegalArgumentException("Os totais de aulas e presenças são inválidos.");
        }

        this.totalPresencas = totalPresencas;
        this.totalAulas = totalAulas;
    }

    public double calcularFrequencia() {
        if (totalAulas == 0) {
            return 0;
        }

        return (totalPresencas * 100.0) / totalAulas;
    }

    public void exibirFrequencia() {
        System.out.printf("Frequência: %.2f%%%n", calcularFrequencia());
    }
}

class Evolucao {
    private double peso;
    private double altura;

    public Evolucao(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public void exibirEvolucao() {
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
    }
}

public class Main {
    public static void main(String[] args) {

        // Incremento 1 - Cadastro do aluno
        Aluno aluno = new Aluno(
            "João",
            20,
            "(51) 99999-9999"
        );

        // Incremento 2 - Gerenciamento do treino
        Treino treino = new Treino(
            "Treino A",
            "Peito, ombro e tríceps"
        );

        // Incremento 3 - Controle de frequência
        Frequencia frequencia = new Frequencia(
            18,
            20
        );

        // Incremento 4 - Acompanhamento da evolução
        Evolucao evolucao = new Evolucao(
            75.5,
            1.75
        );

        System.out.println("===== SISTEMA DA ACADEMIA =====");

        System.out.println("\n--- DADOS DO ALUNO ---");
        aluno.exibirDados();

        System.out.println("\n--- TREINO ---");
        treino.exibirTreino();

        System.out.println("\n--- FREQUÊNCIA ---");
        frequencia.exibirFrequencia();

        System.out.println("\n--- EVOLUÇÃO FÍSICA ---");
        evolucao.exibirEvolucao();
    }
}
