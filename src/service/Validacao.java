package service;

import model.Aluno;

public class Validacao {
    public interface Validador {
        boolean validar(Aluno aluno);
    }

    public static class FrequenciaValidador implements Validador {
        @Override
        public boolean validar(Aluno aluno) {
            return aluno.getFrequencia() >= 75;
        }
    }

    public static class NotaValidador implements Validador {
        @Override
        public boolean validar(Aluno aluno) {
            return aluno.getNota() >= 4;
        }
    }
}

