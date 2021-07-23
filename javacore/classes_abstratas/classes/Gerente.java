package javacore.classes_abstratas.classes;

public class Gerente extends Funcionario {

    public Gerente() {
    }

    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

    @Override
    public void calculaSalario(){
        double salario= this.salario;
        this.salario = salario +(salario*0.2);
    }

}
