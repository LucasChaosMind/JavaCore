package javacore.herança_classe.classes;

public class Funcionario extends Pessoa{

    private double salario;

    public Funcionario(String nome) {
        super(nome);
    }
    

    public void print(){
        super.print();
        System.out.println("Salario: "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
