package service;

import model.Aluno;
import model.AlunosPattern;

public abstract class SituacaoService {
    public String processarSituacao(Aluno aluno){



        var frequencia = aluno.getFrequencia();

        var nota = new AlunosPattern() 
            
        };

        if (frequencia < 75) {
            return "Reprovado por falta";
        }
        if (nota < 4) {
            return "Reprovado por nota";
        }
        if (nota < 7) {
            return "Exame";
        }
        return "Aprovado";
    }

   

    
}
