package javacore.expressões_regulares.test;

import java.util.Scanner;

public class ScannerTest {
    public static void main (String[] args){
        Scanner scanner = new Scanner("1 true 100 oi");
        //scanner.useDelimiter()
        //hasNext ve se ha um valor se não houver ele retorna false e para o while
        while(scanner.hasNext()){
            //.next aulmenta o contador por si só
            System.out.println(scanner.next());
        }
        System.out.println("-------------------------");
        Scanner scanner2 = new Scanner("1 true 100 oi");
        /*classe scaner conegue transferir o valor da varivel scanner2 e
         transformar os valores encontrados para o tipo selecionado como ne exeplo
         que se transforma um valor contido em uma String para int ou bolleaan*/
        while(scanner2.hasNext()){
            if(scanner2.hasNextInt()){
                int i= scanner2.nextInt();
                System.out.println(i);
            }else if(scanner2.hasNextBoolean()){
                boolean b = scanner2.nextBoolean();
                System.out.println(b);
            }
            else{
                System.out.println(scanner2.next());
            }
        }

    }
}
