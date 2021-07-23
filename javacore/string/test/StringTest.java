package javacore.string.test;

public class StringTest {
    public static void main(String[] args) {
        String nome = "Lucas";

        /** String são imutaveis, ao concatenar ela gera 3 Strings**/
        nome += " Nex";

        String test01 = "Dark Yooda";
        String test02 = "12345";
        String test03 = "dark yooda";
        String test04 = "  Nex  ";

        /**Pega a "letra" na posição informada**/
        System.out.println(test01.charAt(3));
        /**Testa se a Strings são igauis, ignorando uppercase ou lowercase**/
        System.out.println(test01.equalsIgnoreCase(test03));
        /**Mede o tamanh da String**/
        System.out.println(test01.length());
        /**Reescreve toda "letra" Ex:'o' pela "letra" Ex:'0'**/
        System.out.println(test01.replace("o", "0"));
        /**Tudo em letra minuscula**/
        System.out.println(test01.toLowerCase());
        /**Tudo maiusculo**/
        System.out.println(test01.toUpperCase());
        /**Alt+shift+f10 Bhother**/
        System.out.println(test02.substring(0, 5));
        /**Remove Espaços**/
        System.out.println(test04.trim());

        long inicio = System.currentTimeMillis();
        concatString(300000);
        long termino = System.currentTimeMillis();
        System.out.println("Tempo gasto: "+(termino -inicio)+"ms");

        inicio = System.currentTimeMillis();
        concatStringBuider(300000);
        termino = System.currentTimeMillis();
        System.out.println("Tempo gasto: "+(termino -inicio)+"ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(300000);
        termino = System.currentTimeMillis();
        System.out.println("Tempo gasto: "+(termino -inicio)+"ms");

    }

    private static void concatString(int tam) {
        String string = "";
        for (int i = 0; i < tam; i++) {
            string += i;
        }
    }

    private static void concatStringBuider(int tam) {
        StringBuilder sb = new StringBuilder(tam);
        for (int i = 0; i < tam; i++) {
            sb.append(i);
        }
    }

    /**
     * mesma coisa q StringBUider, mas com sistema de proteção de thead. Mais seguro, mas menos otimizado
     **/
    private static void concatStringBuffer(int tam) {
        StringBuffer sb = new StringBuffer(tam);
        for (int i = 0; i < tam; i++) {
            sb.append(i);
        }
    }
    /**sb.append escreve algo na sb**/
    /**sb.insert(x,"test") apartir da posição x insere test na sb**/
    /**sb.reverse invert a sb**/
    /**sb.delete(x,y) delata os caracters de x a y, so com o y contando do 1 e o x do 0**/
}
