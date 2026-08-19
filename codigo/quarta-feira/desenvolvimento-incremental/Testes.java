public class Testes {
    private static int total;

    private static void verificar(boolean condicao, String mensagem) {
        total++;
        if (!condicao) {
            throw new AssertionError(mensagem);
        }
    }

    private static void esperarErro(Runnable acao, String mensagem) {
        total++;
        try {
            acao.run();
            throw new AssertionError(mensagem);
        } catch (IllegalArgumentException esperado) {
            // A validação funcionou corretamente.
        }
    }

    public static void main(String[] args) {
        Frequencia frequencia = new Frequencia(18, 20);
        verificar(Math.abs(frequencia.calcularFrequencia() - 90.0) < 0.0001,
                "A frequência deveria ser 90%.");

        Frequencia semAulas = new Frequencia(0, 0);
        verificar(semAulas.calcularFrequencia() == 0.0,
                "A frequência sem aulas deveria ser zero.");

        esperarErro(() -> new Frequencia(-1, 20), "Presenças negativas deveriam ser rejeitadas.");
        esperarErro(() -> new Frequencia(21, 20), "Presenças acima das aulas deveriam ser rejeitadas.");
        esperarErro(() -> new Frequencia(0, -1), "Total negativo de aulas deveria ser rejeitado.");

        System.out.println("OK: " + total + " testes do desenvolvimento incremental.");
    }
}
