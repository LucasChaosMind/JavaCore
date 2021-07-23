package javacore.introduçaometodos.Test;

import javacore.introduçaometodos.MetodoBolha;

import java.util.Scanner;

public class MetodoBolhaTest {
    public static void main (String[] args){

        int vet[]= new int[5];

        MetodoBolha aux = new MetodoBolha();

        Scanner ler = new Scanner (System.in);

        for(int i=0;i<vet.length;i++){
            vet[i] = ler.nextInt();
        }
        aux.bolha(vet);

        for(int i=0;i<vet.length;i++){
            System.out.println(vet[i]);
        }
    }
}
