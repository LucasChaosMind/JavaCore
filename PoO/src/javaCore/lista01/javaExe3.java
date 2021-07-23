package javaCore.lista01;

import java.util.Scanner;

public class javaExe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var, i=0;
        double calc=0;

        System.out.print("Informe o numero de funcionarios: ");
        var = scanner.nextInt();
        while(var>i){
            System.out.print("Informe o salario do Funcionario "+i+": ");
            calc+= scanner.nextDouble();
            i++;
        }
        scanner.close();
        double aux = calc / i;
        System.out.println("Media de salario: "+aux);
    }
}
