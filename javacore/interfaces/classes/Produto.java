package javacore.interfaces.classes;

public class Produto implements Tributavel, Transportavel {
    private String nome;
    private double peso;
    private double preco;
    private double precoFinal;
    private double valorFrete;

    public Produto() {
    }

    public Produto(String nome, double peso, double preco) {
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }

    @Override
    public String toString() {
        System.out.println("================");
        return ("Nome: " + nome + "\nPeso: " + peso + "\nPreço: " + preco + "\nPreo Final: " + precoFinal + "\nFrete: " + valorFrete);
    }

    @Override
    public void calculaFrete() {
        this.valorFrete = this.preco / this.peso * 0.1;
    }

    @Override
    public void calculaImpostoMaisDolar() {
        this.precoFinal = this.preco*5.12*0.6;
    }

}
