package javacore.polimorfismo.classes;

public class Vendedor extends Funcionario {
    private double venda;

    public Vendedor(String nome, double salario, double venda) {
        super(nome, salario);
        this.venda = venda;
    }
    @Override
    public void calculaPagamento(){
        double salario = this.salario;
        this.salario = salario + (venda*0.05);
    }

    public double getVenda() {
        return venda;
    }

    public void setVenda(double venda) {
        this.venda = venda;
    }
}
