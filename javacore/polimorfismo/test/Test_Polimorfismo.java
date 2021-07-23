package javacore.polimorfismo.test;

import javacore.polimorfismo.classes.Gerente;
import javacore.polimorfismo.classes.RelatorioPagamento;
import javacore.polimorfismo.classes.Vendedor;

public class Test_Polimorfismo {
    public static void main(String[] args) {
        Gerente a1 = new Gerente("Spook",5000,2500);
        Vendedor a2 = new Vendedor("Yooda",3500,20000);
        RelatorioPagamento r= new RelatorioPagamento();

        r.relatorioPagamentoGenerico(a1);
        r.relatorioPagamentoGenerico(a2);
    }
}
