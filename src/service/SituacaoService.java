package service;

import model.Aluno;

import service.Validacao.Validador;

public class SituacaoService {
    private Validador validador;

    public SituacaoService(Validador validador) {
        this.validador = validador;
    }

    public String processarSituacao(Aluno aluno) {
        if (validador.validar(aluno)) {
            var nota = aluno.getNota();
            if (nota < 4) {
                return "Reprovado por nota";
            }
            if (nota < 7) {
                return "Exame";
            }
            return "Aprovado";
        } else {
            return "Reprovado por falta";
        }
    }
}
