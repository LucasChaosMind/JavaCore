package javacore.sobrecarga_metodos.Test;

import javacore.sobrecarga_metodos.Classes.Funcionario;

public class Funcionario_Test {
    public static void main(String[] args) {
        Funcionario lucas = new Funcionario();
        lucas.init("Lucas","78542389-73",5500,"Masculino");
        lucas.print();
    }
}

