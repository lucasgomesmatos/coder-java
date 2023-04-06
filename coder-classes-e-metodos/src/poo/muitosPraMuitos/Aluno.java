package poo.muitosPraMuitos;

import java.util.ArrayList;

public class Aluno {

    final String nome;
    final ArrayList<Curso> cursos = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
    }

    void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }
}
