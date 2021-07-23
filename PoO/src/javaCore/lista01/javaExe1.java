package javaCore.lista01;

import java.util.Scanner;

public class javaExe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x , y;
        System.out.print("Informe Limite Inferior: ");
        x = scanner.nextInt();
        System.out.print("Informe o Limete Superior: ");
        y = scanner.nextInt();
        scanner.close();


        if(x>y){
            int aux = x;
            x = y;
            y = aux;
        }
        intervalo(x,y);
    }
    public static void intervalo(int x, int y){
        for(int i=x;i<=y;i++){
            if(i%2==0){
                System.out.println("Valor: "+i);
            }
        }
    }
}
