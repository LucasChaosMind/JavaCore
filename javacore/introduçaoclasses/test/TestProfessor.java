package javacore.introduçaoclasses.test;

import javacore.introduçaoclasses.classes.Professor;

public class TestProfessor {

    public static void main (String[] args){

        Professor luiza = new Professor();
        Professor thais = new Professor();

        luiza.nome = "Luiza Necro hanst";
        luiza.matricula="204356-9";
        luiza.rg="29.824.12-43";
        luiza.cpf="064371054-17";

        thais.nome = "Thais Garrido";
        thais.matricula ="372248-9";
        thais.rg = "36.297.52-58";
        thais.cpf ="232793429-37";


        luiza.imprime();
        thais.imprime();
    }

}
