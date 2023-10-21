package model;

public class Aluno {

    private int id;
    private String nome;
    private int nota;
    private String turma;
    private int frequencia;

    public Aluno id(int id) {
        this.id = id;
        return this;
    }

    public Aluno nome(String nome) {
        this.nome = nome;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Aluno [id=" + id + ", nome=" + nome + ", nota=" + nota + ", turma=" + turma + ", frequencia="
                + frequencia + "]";
    }

}