package javacore.introduçaometodos.Test;

import javacore.introduçaometodos.Private_Get_Set;

public class Private_Get_Set_Test {
    public static void main(String[] args){
        Private_Get_Set lucas= new Private_Get_Set();

        lucas.setNome("Lucas Calado");
        lucas.setIdade(20);
        lucas.setMat("2037882");

        System.out.println("Nome: "+lucas.getNome());
        System.out.println("Idade: "+lucas.getIdade());
        System.out.println("Matricula: "+lucas.getMat());
    }
}
