package model;

public abstract class AlunosPattern {

    private Aluno aluno;

    public AlunosPattern(Aluno aluno){
        this.aluno = aluno;
    }

    public abstract String calculaFrequencia();

    public abstract String calculaNota();

    public abstract String situacaoEsperada();

}
