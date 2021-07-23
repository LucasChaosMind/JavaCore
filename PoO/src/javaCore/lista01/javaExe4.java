package javaCore.lista01;

import javax.swing.*;
import java.util.Scanner;

public class javaExe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tipoPeso;

        double kg = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite seu peso em Kg:","Cálculo IMC - Peso",JOptionPane.QUESTION_MESSAGE));
        double alt = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe sua altura Em metros:","Cálculo IMC - Peso",JOptionPane.QUESTION_MESSAGE));

        double imc = kg / (alt*alt);

        if(imc<20){
            tipoPeso="Magro";
        }
        else if (imc>19&&imc<25){
            tipoPeso="Normal";
        }
        else if(imc>24&&imc<30){
            tipoPeso="Acima do Peso";
        }
        else if(imc>29&&imc<35){
            tipoPeso="Obeso";
        }
        else{
            tipoPeso="Muito Obeso";
        }
        String meessage ="Peso: "+kg+"\nAltura: "+alt+"\nIMC: "+imc+"\nCosiderado: "+tipoPeso;
        JOptionPane.showMessageDialog(null,meessage,"Resultado IMC",JOptionPane.INFORMATION_MESSAGE);

    }
}
