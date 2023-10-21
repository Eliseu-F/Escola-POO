import model.Aluno;
import model.Aluno.AlunoBuilder;
import service.SituacaoService;
import service.Validacao.FrequenciaValidador;
import service.Validacao.NotaValidador;
import service.Validacao.Validador;

public class App {
    public static void main(String[] args) {
        runTest();
    }

    private static void runTest() {
        Validador frequenciaValidador = new FrequenciaValidador();
        Validador notaValidador = new NotaValidador();
        
        SituacaoService service = new SituacaoService(frequenciaValidador);

        Aluno aluno1 = new AlunoBuilder()
            .setId(1)
            .setNome("João")
            .setTurma("A")
            .setNota(8.5)
            .setFrequencia(90)
            .build();

        test(service, aluno1, "Aprovado");

        service = new SituacaoService(notaValidador);
        Aluno aluno2 = new AlunoBuilder()
            .setId(2)
            .setNome("Maria")
            .setTurma("B")
            .setNota(3.5)
            .setFrequencia(85)
            .build();

        test(service, aluno2, "Reprovado por nota");
    }

    private static void test(SituacaoService service, Aluno aluno, String situacaoEsperada) {
        var situacao = service.processarSituacao(aluno);
        if (situacao.equals(situacaoEsperada)) {
            System.out.println(String.format("V - Aluno: %s, Situação: %s", aluno.getNome(), situacao));
        } else {
            System.out.println(String.format("X - Aluno: %s, Situação: %s", aluno.getNome(), situacao));
        }
    }
}