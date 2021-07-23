package javacore.associação.test;

import javacore.associação.classes.Aluno;
import javacore.associação.classes.Local;
import javacore.associação.classes.Professor;
import javacore.associação.classes.Seminario;

public class Associacao_Test {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Lucas", 20);
        Aluno aluno2 = new Aluno("Angelo", 20);
        Seminario sem = new Seminario("Como virar um Progamador de Respeito");
        Professor prof = new Professor("Dark Yoda", "Lado Negro da Progamação");
        Local local = new Local("Estrela da Morte", "Universo");

        sem.setProfessor(prof);
        sem.setLocal(local);
        sem.setAlunos(new Aluno[]{aluno,aluno2});

        prof.setSeminario(new Seminario[]{sem});

        aluno.setSeminario(sem);
        aluno2.setSeminario(sem);

        aluno.print();
        aluno2.print();

        sem.print();

        prof.print();
    }
}
