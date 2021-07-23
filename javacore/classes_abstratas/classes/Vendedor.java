package javacore.classes_abstratas.classes;

public class Vendedor extends Funcionario{
    private double vendas;

    public Vendedor(String nome, String clt, double salario, double vendas) {
        super(nome, clt, salario);
        this.vendas = vendas;
    }

    public Vendedor(){}

    @Override
    public void calculaSalario(){
        double salario = this.salario;

        this.salario= salario+(vendas*0.5);
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }
}
