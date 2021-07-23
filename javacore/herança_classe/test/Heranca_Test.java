package javacore.herança_classe.test;

import javacore.herança_classe.classes.Endereco;
import javacore.herança_classe.classes.Funcionario;
import javacore.herança_classe.classes.Pessoa;

public class Heranca_Test {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Armando");

        p.setCpf("76298643-24");

        Endereco end = new Endereco();
        end.setRua("Julio Tavares");
        end.setBairro("Geraldão");

        Funcionario fun = new Funcionario("Juliana");

        fun.setCpf("86935749-53");
        fun.setSalario(2157.75);

        fun.setEndereco(end);
        p.setEndereco(end);

        p.print();
        fun.print();
    }
}
