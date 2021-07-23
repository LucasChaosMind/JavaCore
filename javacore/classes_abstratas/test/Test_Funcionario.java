package javacore.classes_abstratas.test;

import javacore.classes_abstratas.classes.Gerente;
import javacore.classes_abstratas.classes.Vendedor;

public class Test_Funcionario {
    public static void main(String[] args) {
        Gerente a31 = new Gerente("Marvs","324593-5",3500);
        Vendedor a32 = new Vendedor("Buuu Aaa","232332-1",2900,500);

        a31.calculaSalario();
        a32.calculaSalario();
        System.out.println(a31);
        System.out.println(a32);
}
}
