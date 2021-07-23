package javacore.enum_classes.test;

import javacore.enum_classes.classes.Cliente;
import javacore.enum_classes.classes.TipoCliente;

public class Cliente_Test {
    public static void main(String[] args) {
        Cliente a20 = new Cliente("Lucas", TipoCliente.FISICA);

        System.out.println(a20);
    }
}
