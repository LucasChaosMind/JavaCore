package javacore.metodos_staticos.classes;

public class Calc {
    private double x;
    private double y;

    public static void soma (double a , double b){
        Calc c = new Calc();
        c.x = a;
        c.y = b;
        System.out.println(c.y + c.x);
    }
    public static void divisao ( double a, double b){
        Calc c = new Calc();
        c.x=a;
        c.y=b;
        if(c.x>=c.y) {
            System.out.println(c.x / c.y);
        }
        else{
            System.out.println(c.y / c.x);
        }
    }
    public static double subtrai ( double a , double b){
        Calc c = new Calc();
        c.x=a;
        c.y=b;
        if(a>=b){
            return (a-b);
        }
        else{
            return (b-a);
        }

    }
    public static double multiplica ( double a , double b){
        Calc c = new Calc();
        c.x=a;
        c.y=b;
        return (c.x*c.y);
    }



    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
