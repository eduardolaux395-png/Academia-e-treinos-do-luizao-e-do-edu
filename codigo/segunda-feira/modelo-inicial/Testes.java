import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Testes {
    private static int total;

    private static void verificar(boolean condicao, String mensagem) {
        total++;
        if (!condicao) {
            throw new AssertionError(mensagem);
        }
    }

    private static String capturarSaida(Runnable acao) {
        PrintStream original = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try {
            System.setOut(new PrintStream(buffer, true, StandardCharsets.UTF_8));
            acao.run();
            return buffer.toString(StandardCharsets.UTF_8);
        } finally {
            System.setOut(original);
        }
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno(1, "João", 20, "51999999999");
        verificar(aluno.getId() == 1, "O ID do aluno deveria ser 1.");
        verificar(aluno.getNome().equals("João"), "O nome do aluno está incorreto.");

        Treino treino = new Treino(1, "Treino A", "Membros superiores", 60);
        verificar(treino.getNome().equals("Treino A"), "O nome do treino está incorreto.");

        String saida = capturarSaida(() -> {
            treino.adicionarExercicio("Supino reto");
            treino.removerExercicio("Supino reto");
            treino.exibirDados();
        });
        verificar(saida.contains("Nenhum exercício cadastrado"),
                "O exercício deveria ter sido removido do treino.");

        Academia academia = new Academia("Academia Teste", "Rua A");
        String pesquisa = capturarSaida(() -> {
            academia.cadastrarAluno(aluno);
            academia.pesquisarAluno(1);
        });
        verificar(pesquisa.contains("Aluno encontrado"), "O aluno cadastrado deveria ser encontrado.");

        System.out.println("OK: " + total + " testes do modelo inicial.");
    }
}
