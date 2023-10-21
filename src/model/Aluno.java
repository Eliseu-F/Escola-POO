package model;

public class Aluno {
    private int id;
    private String nome;
    private String turma;
    private double nota;
    private int frequencia;

    private Aluno() {
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTurma() {
        return turma;
    }

    public double getNota() {
        return nota;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public static class AlunoBuilder {
        private int id;
        private String nome;
        private String turma;
        private double nota;
        private int frequencia;

        public AlunoBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public AlunoBuilder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public AlunoBuilder setTurma(String turma) {
            this.turma = turma;
            return this;
        }

        public AlunoBuilder setNota(double nota) {
            this.nota = nota;
            return this;
        }

        public AlunoBuilder setFrequencia(int frequencia) {
            this.frequencia = frequencia;
            return this;
        }

        public Aluno build() {
            Aluno aluno = new Aluno();
            aluno.id = this.id;
            aluno.nome = this.nome;
            aluno.turma = this.turma;
            aluno.nota = this.nota;
            aluno.frequencia = this.frequencia;
            return aluno;
        }
    }
}