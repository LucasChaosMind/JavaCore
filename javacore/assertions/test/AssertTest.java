package javacore.assertions.test;
public class AssertTest {
    public static void main(String[] args) {
        calculaSalario(10);
        calcSalario(10);
    }
    private static void calculaSalario (double salario){
        assert (salario > 0) : "O salario Nao Deve ser Menor Que Zero";
        System.out.println(salario);
    }
    public static void calcSalario(double salario){
        if(salario < 0){
            throw new IllegalArgumentException();
        }
    }
}
