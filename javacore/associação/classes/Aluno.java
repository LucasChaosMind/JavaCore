package javacore.associação.classes;

public class Aluno {
    private Seminario seminario;
    private String[] aluno;
    private String nome;
    private int idade;


    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void print() {
        System.out.println("-------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.seminario != null) {
            System.out.println("Seminario: " + this.seminario.getTitulo());
        }
        else{
            System.out.println("Aluno não esta inscrito e nenhum seminario!");
        }
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public void setAluno(String[] aluno) {
        this.aluno = aluno;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public String[] getAluno() {
        return aluno;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
