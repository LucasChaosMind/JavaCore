package javacore.sobrecarga_contrutores.classes;

public class Prof {
    private String nome;
    private String matricula;
    private String turma;
    private int idadeson;

    public Prof(String nome, String matricula, String turma) {
        this.nome = nome;
        this.matricula = matricula;
        this.turma = turma;
    }
    public Prof(String nome, String matricula,String turma, int idadeson){
        this(nome,matricula, turma);
        this.idadeson=idadeson;
    }
    public Prof(){

    }
    public void print(){
        System.out.println(this.nome);
        System.out.println(this.matricula);
        System.out.println(this.turma);
        System.out.println(idadeson);
        System.out.println("System Time \n!Nightmare!");
    }

}
