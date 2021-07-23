package javacore.modificadores_estaticos.test;

public class Carro_Test {
    public static void main(String[] args) {

        Carro a24 = new Carro("Tesla","245");
        Carro a25 = new Carro("BMW","265");
        Carro a26 = new Carro("T-Cross","220");

        Carro.limiteVel=220;

        a24.Print();
        a25.Print();
        a26.Print();
    }

}
