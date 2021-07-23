package javacore.introduçaometodos.Test;

import javacore.introduçaometodos.Args_For_It_This;

import java.util.Scanner;

public class Args_For_It_This_Test {
    public static void main(String[] args){
        Args_For_It_This lucas = new Args_For_It_This();

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o Nome do Aluno: ");
        lucas.nome=ler.nextLine();

        System.out.println("Informe Sua matricula: ");
        lucas.matricula= ler.nextLine();
        for(int i=0;i< lucas.nota.length;i++){
            System.out.println("Informe a sua nota: ");
            lucas.nota[i]=ler.nextDouble();
        }

        lucas.imprime();
        System.out.println("Nota Toatal: "+lucas.notacalc(lucas.nota));
        lucas.SomaArgs(4,2,7,9);


    }
}
