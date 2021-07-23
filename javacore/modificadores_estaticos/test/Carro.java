package javacore.modificadores_estaticos.test;

public class Carro {
    private String nome;
    private String velocidadeMax;
    public static int limiteVel = 240;

    public void Print() {
        System.out.println("------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Maxima: " + this.velocidadeMax);
        System.out.println("Velocidade Permitidada: " + limiteVel);
    }

    public Carro(String nome, String velocidadeMax) {
        this.nome= nome;
        this.velocidadeMax=velocidadeMax;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVelocidadeMax(String velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }
}
