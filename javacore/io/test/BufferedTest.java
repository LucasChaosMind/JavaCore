package javacore.io.test;

import java.io.*;

public class BufferedTest {
    public static void main(String[] args) {

        File file = new File("MyBufferedText.txt");

        try{
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("One!");
            bw.newLine();
            bw.write("Two!");
            bw.flush();
            bw.close();

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String aux = null;

            while((aux= br.readLine()) != null){
                System.out.println(aux);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        /**Metodo simplificado  com Try if catch**/

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));
             BufferedReader br = new BufferedReader(new FileReader(file))){

            bw.write("One!");
            bw.newLine();
            bw.write("Two!");
            bw.flush();

            String aux = null;
            while ((aux = br.readLine()) != null){
                System.out.println(aux);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
