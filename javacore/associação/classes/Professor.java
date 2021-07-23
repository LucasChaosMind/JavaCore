package javacore.associação.classes;

public class Professor {
    private Seminario[] seminario;
    private String nome;
    private String especialidade;


    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void print() {
        System.out.println("-------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Seminario[s]: ");
        if (seminario != null) {
            for (Seminario sem : seminario) {
                System.out.println(sem.getTitulo());
            }
            return;
        }
        System.out.println("Professor Sem Seminario[s]");

    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecialidade(String especialidade) {
        especialidade = especialidade;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}
