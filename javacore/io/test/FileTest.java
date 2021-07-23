package javacore.io.test;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("MyFileTest.txt");

        try{
            System.out.println("File Criado: "+file.createNewFile());
            if(file.exists()){
                System.out.println("Deletado: "+file.delete());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
