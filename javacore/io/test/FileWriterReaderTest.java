package javacore.io.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTest {
    public static void main(String[] args) {
        File file = new File("MyFileTest.txt");

        try {
            //vc passa a variavel ou o diretorio do arquivo e caso não queira sobrescrever o arquivo vc adicione o boolean true [º~º]
            FileWriter fw = new FileWriter(file,false);
            fw.write("Escrevendo arquivo\n 0-1 and 1-0");
            //o buffer [ caminho por onde o programa acessa a memoria do computador] deve ser limpo, para evidar compromentimento de dados
            fw.flush();
            //E necessario fechar o arquivo apos usar ele
            fw.close();

            FileReader fr = new FileReader(file);
            char[] in = new char [100];
                   int size = fr.read(in);
                   System.out.println("Tamanho: "+size);
                   for(char aux:in){
                       System.out.print(aux);
                   }
                   fr.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        /**Para execultar leitura e escrita do arquivo sem ter que usar o metodo close se usa o try if catch**/
        try (FileWriter fw = new FileWriter(file); FileReader fr = new FileReader(file)) {
            fw.write("Escrevendo arquivo\n 0-1 and 1-0");
            fw.flush();

            char[] in = new char [100];
            int size = fr.read(in);
            System.out.println("\nTamanho: "+size);
            for(char aux:in) {
                System.out.print(aux);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
