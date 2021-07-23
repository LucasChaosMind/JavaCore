package javacore.io.test;

import java.io.File;
import java.io.IOException;

public class FIlleDirectoryTest {
    public static void main(String[] args) {
        File diretorio = new File("TestFolder");
        boolean mkdir = diretorio.mkdir();
        System.out.println("Directorio Criado: "+mkdir);

        File arquivo = new File("C:\\Users\\Lucas Onvwer\\IdeaProjects\\TestFolder\\MyTestFile.txt");
        try{
            arquivo.createNewFile();
        }catch(IOException e){
            e.printStackTrace();
        }
        /**Mudando o nome do arquivo**/
        File newName = new File("C:\\Users\\Lucas Onvwer\\IdeaProjects\\TestFolder\\TestZero.txt");
        arquivo.renameTo(newName);

        /**Mudando o nome do diretorio**/
        File newDirectory = new File("TestZeroFolder");
        diretorio.renameTo(newDirectory);

        buscaArquivos();
    }


    public static void buscaArquivos(){
        File file = new File("TestZeroFOlder");
        String[] list = file.list();
        for(String arquivo : list){
            System.out.println(arquivo);
        }
    }
}
