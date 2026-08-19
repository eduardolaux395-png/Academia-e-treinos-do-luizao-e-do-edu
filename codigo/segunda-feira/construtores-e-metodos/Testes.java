public class Testes {
    private static int total;

    private static void verificar(boolean condicao, String mensagem) {
        total++;
        if (!condicao) {
            throw new AssertionError(mensagem);
        }
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno(1, "Luiz", 18, "99999-9999");
        Instrutor instrutor = new Instrutor(1, "Eduardo", "CREF12345", "Musculação");
        Treino treino = new Treino(1, "Treino A", "Membros superiores", 60);
        Academia academia = new Academia("Academia Teste", "Rua A");

        verificar(aluno.getNome().equals("Luiz"), "O nome do aluno está incorreto.");
        verificar(instrutor.getNome().equals("Eduardo"), "O nome do instrutor está incorreto.");

        aluno.atualizarDados("98888-8888");
        instrutor.cadastrarTreino();
        treino.adicionarExercicio("Supino reto");
        treino.removerExercicio("Supino reto");
        academia.cadastrarAluno(aluno);
        academia.cadastrarInstrutor(instrutor);

        System.out.println("OK: " + total + " testes de construtores e métodos.");
    }
}
