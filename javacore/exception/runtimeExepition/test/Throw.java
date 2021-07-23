package javacore.exception.runtimeExepition.test;

public class Throw {
    public static void main(String[] args) {
        try{
            divisao(10,0);
        }catch(RuntimeException e){
            e.printStackTrace();
        }
    }
    private static void divisao(int num1, int num2){
        int result = num1 / num2;
        if(num2==0){
            throw new IllegalArgumentException("Informe um Numero Diferente de 0 como Variavel!");
        }
        System.out.println(result);
    }
}
