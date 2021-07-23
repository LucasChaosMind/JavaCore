package javacore.interfaces.test;

import javacore.interfaces.classes.Produto;

public class Test_Inrtefaces {
    public static void main(String[] args) {
        Produto p = new Produto("Rtx 3080",2.45,1870);
        p.calculaFrete();
        p.calculaImpostoMaisDolar();
        System.out.println(p);

    }
}
