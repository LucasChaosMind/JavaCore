package javacore.expressões_regulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) {
         // \d todos os digitos, numeros
         // \D todos os não digitos, caracteres especiais e letras
         // \s espaços em branco e os /t /n /f /r
         // \S epaços que não estão em branco
         // \w caracteres A-z a-z, digitos e _
         // /W não A-Z a-z, digitos e _ [não carateres de palavra]
         // [] [a-z] procura de a ate z. [A-Z0-9] procura de a A ate Z e de 0 ate 9 [abcHJK] procura a ou b ou c ou H ou J ou K
         // a busca pelo numero exadecimal
         // ? zero ou uma vez
         // * zero ou mais vezes
         // + uma ou mais vezes
         // {m,n} de n ate m vezes
         // ( ) agrupa
         // | ou
         // $ fim de linha

        //String regex ="0[xX]([0-9a-fA-F])+(\\s|$)";
        //String text ="12 0x 0X 0X01FFABC 0x10g 0x1";
        //Pattern pattern = Pattern.compile(regex);
        //Matcher matcher = pattern.matcher(text);
        /**buscar**/
        String regex ="([a-zA-z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String text ="leandro01@gmail.com 1025adm@email turing@tbox.com.br@@@!! ajax@hotseler.br";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Texto: "+text);
        System.out.println("Procura:  "+matcher.pattern());
        System.out.println("---Posição---");
        while(matcher.find()){
            System.out.println(matcher.start()+" - "+matcher.group());
        }
        /**validar**/
        System.out.println("Email Valido? "+"#@!leandrin@zeca.br".matches(regex));


    }
}
