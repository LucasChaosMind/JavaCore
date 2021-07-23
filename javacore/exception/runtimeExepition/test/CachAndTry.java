package javacore.exception.runtimeExepition.test;

public class CachAndTry {
    public static void main(String[] args) {

        try{
            int[] array = new int[]{1,2,3,4,5};
            System.out.println(array[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Falha na linha 5 -Por Favor Chamar Suporte!");
        }
        System.out.println("Fora do Try And Catch!");
    }
}
