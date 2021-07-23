package javaCore.lista01;

import java.util.Scanner;

public class javaExe2 {
    public static void main(String[] args) {
        double volume, comprimento, altura, largura;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o Comprimento: ");
        comprimento = scanner.nextDouble();
        System.out.print("Informe a Altura: ");
        altura = scanner.nextDouble();
        System.out.print("Informe a Largura: ");
        largura = scanner.nextDouble();
        scanner.close();

        volume = volume(comprimento,altura,largura);
        System.out.print("Volume: "+volume);

    }
    public static double volume(double comp, double alt, double larg){
        return (comp * alt * larg);
    }
}

