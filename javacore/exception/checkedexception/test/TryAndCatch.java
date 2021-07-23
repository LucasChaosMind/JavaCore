package javacore.exception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class TryAndCatch {
    public static void main(String[] args) {
        try {
            criarArquivo();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(abrirAquivo());
    }
    public static void criarArquivo() throws IOException {
        File file = new File("Test.txt");
        try{
            System.out.println(file.createNewFile());
            System.out.println("Aquivo sendo Criado");
        }catch (IOException e){
            e.printStackTrace();
           throw e = new IOException();
        }
    }
    public static String abrirAquivo()
    {
        try{
            System.out.println("Abrindo Arquivo!");
            System.out.println("Execultando leitura do Arquivo!");
            System.out.println("Escrevendo no Arquivo!");
            return "oK";
        }catch(Exception e){
            System.out.println("Dentro do Catch!");
            e.printStackTrace();
        } finally{
            System.out.println("Fechar Arquivo!");
        }
        return null;

    }
}
