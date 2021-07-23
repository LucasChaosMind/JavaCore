package javacore.expressões_regulares.test;

public class TokenTest {
    public static void main (String[] args){
        /*----forma simples----*/
        String str = "Lucas, Gabriela, Lorena, Lolly";
        //divide as String com base na virgula
        String[] tokens =str.split(",");
        //trim tira os espasos da String
        for(String arr: tokens){
            System.out.println(arr.trim());
        }
    }
}
