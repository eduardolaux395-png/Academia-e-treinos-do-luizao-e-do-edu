public class NewClass2 {
    public static void main(String[] args) {
        Pessoa aluno = new Aluno("João", "Hipertrofia");
        Pessoa instrutor = new Instrutor("Carlos", "Musculação");

        System.out.println(aluno.apresentar());
        System.out.println(instrutor.apresentar());
    }
}

abstract class Pessoa {
    private final String nome;

    Pessoa(String nome) {
        this.nome = nome;
    }

    protected String getNome() {
        return nome;
    }

    abstract String apresentar();
}

class Aluno extends Pessoa {
    private final String objetivo;

    Aluno(String nome, String objetivo) {
        super(nome);
        this.objetivo = objetivo;
    }

    @Override
    String apresentar() {
        return "Aluno: " + getNome() + " | Objetivo: " + objetivo;
    }
}

class Instrutor extends Pessoa {
    private final String especialidade;

    Instrutor(String nome, String especialidade) {
        super(nome);
        this.especialidade = especialidade;
    }

    @Override
    String apresentar() {
        return "Instrutor: " + getNome() + " | Especialidade: " + especialidade;
    }
}
