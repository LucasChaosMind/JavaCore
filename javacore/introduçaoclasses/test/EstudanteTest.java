package javacore.introduçaoclasses.test;

import javacore.introduçaoclasses.classes.Estudante;

public class EstudanteTest {
    public static  void main (String[] args){
        Estudante lucas = new Estudante();

        lucas.nome = "Lucas Calado Bresolino";
        lucas.idade = 20;
        lucas.matricula = "2037882";

        System.out.println("Nome: "+lucas.nome);
        System.out.println("Idade: "+ lucas.idade);
        System.out.println("Matricula: "+lucas.matricula);
    }
}
