package javacore.metodos_staticos.test;

import javacore.metodos_staticos.classes.Calc;

public class Calc_Test {
    public static void main(String[] args) {
        Calc xt = new Calc();

        xt.setX(20);
        xt.setY(5);
        Calc.soma(xt.getX(),xt.getY());
        Calc.divisao(xt.getX(),xt.getY());
        System.out.println(Calc.multiplica(xt.getX(),xt.getY()));
       System.out.println(Calc.subtrai(xt.getX(),xt.getY()));
    }

}
