package javacore.introduçaometodos.Test;

import javacore.introduçaometodos.ProfExe;

import java.util.Scanner;

public class ProfExeTest {
    public static void main (String[] args){

        ProfExe lucas = new ProfExe();
        Scanner ler = new Scanner(System.in);

        System.out.println("Nome: ");
        lucas.nome = ler.nextLine();
        System.out.println("Idade: ");
        lucas.idade= ler.nextInt();

        for(int i=0;i<3;i++){
            System.out.println("Informe a Nota: ");
            lucas.nota[i]=ler.nextDouble();
        }
        lucas.Printg(lucas.Notadev(lucas.nota));


    }
}
