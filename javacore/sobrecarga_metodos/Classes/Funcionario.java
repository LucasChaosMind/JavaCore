package javacore.sobrecarga_metodos.Classes;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String sex;

    public void setNome(String nome){
        this.nome=nome;
    }
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    public void setSalario(double salario){
        this.salario=salario;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double getSalario() {
        return this.salario;
    }
    public void init(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;

        this.salario =salario;
    }
    public void init(String nome, String cpf, double salario, String sex){
        init(nome,cpf,salario);
        this.sex = sex;
    }
    public void print(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Cpf: "+this.cpf);
        System.out.println("Salario: "+this.salario);
        System.out.println("Sexo: "+this.sex);

    }

}
