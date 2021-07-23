package javacore.modificador_final.classes;

public class Carro {
    public static final double VELLOCIDADE_MAX = 220;
    public final Comprador comprador = new Comprador();
    private String nome;
    private String marca;

    //Final torna a variavel imodificavel
     //Final Em Classe faz vc não poder criar uma nova referencia

    public final void print() {
        System.out.println("------------------");
        System.out.println("Nome do Carro: " + this.nome);
        System.out.println("Marca: " + this.marca);
        System.out.println("Velocidade Maxima: " + Carro.VELLOCIDADE_MAX);
        System.out.println("Comprador: " +comprador.getNome());
    }

    //Metodo Final são metodos inalteraveis em classes filhas

    public static double getVellocidadeMax() {
        return VELLOCIDADE_MAX;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
