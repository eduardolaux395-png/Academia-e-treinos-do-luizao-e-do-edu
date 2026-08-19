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
        Aluno aluno = new Aluno("  Maria  ", 25, "12345678901");
        verificar(aluno.getNome().equals("Maria"), "O nome deveria ser normalizado.");
        verificar(aluno.getIdade() == 25, "A idade está incorreta.");
        verificar(aluno.getCpf().equals("12345678901"), "O CPF está incorreto.");

        aluno.setIdade(26);
        verificar(aluno.getIdade() == 26, "A idade não foi atualizada.");

        esperarErro(() -> new Aluno("", 20, "12345678901"), "Nome vazio deveria ser rejeitado.");
        esperarErro(() -> new Aluno("Maria", 0, "12345678901"), "Idade zero deveria ser rejeitada.");
        esperarErro(() -> aluno.setIdade(-1), "Idade negativa deveria ser rejeitada.");
        esperarErro(() -> new Aluno("Maria", 20, "123"), "CPF incompleto deveria ser rejeitado.");
        esperarErro(() -> aluno.setCpf(null), "CPF nulo deveria ser rejeitado.");

        System.out.println("OK: " + total + " testes de encapsulamento e validação.");
    }
}
