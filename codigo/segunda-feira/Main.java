public class Main {

    public static void main(String[] args) {

        Academia academia = new Academia();

        Pessoa aluno = new Aluno(
                "João",
                "Hipertrofia"
        );

        Pessoa instrutor = new Instrutor(
                "Carlos",
                "Musculação"
        );

        academia.apresentarPessoa(aluno);
        academia.apresentarPessoa(instrutor);
    }
}
