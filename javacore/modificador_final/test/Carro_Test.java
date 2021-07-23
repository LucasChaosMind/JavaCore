package javacore.modificador_final.test;

import javacore.modificador_final.classes.Carro;

public class Carro_Test {
    public static void main(String[] args) {
        Carro c23 = new Carro();
        c23.setNome("Marvis");
        c23.setMarca("Tesla");
        c23.getComprador().setNome("Lucas!");

        Carro c24 = new Carro();
        c24.setNome("Cool");
        c24.setMarca("Toyota");
        c24.getComprador().setNome("Love!");

        c24.print();
        c23.print();
    }
}
