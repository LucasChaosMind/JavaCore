package javacore.associação.classes;

public class Seminario {

    private Aluno[] alunos;
    private Professor professor;
    private Local local;
    private String titulo;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void print() {
        System.out.println("-------------------");
        System.out.println("Titulo Seminario: " + titulo);
        if (professor != null) {
            System.out.println("Professor: " + professor.getNome());
        } else {
            System.out.println("Nenhum Professor Cadastrado!");
        }
        if (alunos != null) {
            System.out.println("Aluno[s]: ");
            for (Aluno aluno : alunos) {
                System.out.println(aluno.getNome());
            }
        } else {
            System.out.println("Nenhum Aluno Cadastrado!");
        }

        if (this.local != null) {
            System.out.println("Rua: " + local.getRua() + ". Bairro: " + local.getBairro());
            return;
        }
        System.out.println("Nenhum LOcal Cadastrado!");

    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Local getLocal() {
        return local;
    }

    public String getTitulo() {
        return titulo;
    }
}
