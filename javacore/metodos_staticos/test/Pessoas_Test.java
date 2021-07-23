package javacore.metodos_staticos.test;

import javacore.metodos_staticos.classes.Pessoas;

public class Pessoas_Test {
    public static void main(String[] args) {
        Pessoas x = new Pessoas();
        Pessoas.setIdade(20);
        Pessoas.setNome("lucas");

        Pessoas.printf(x);
    }
}
