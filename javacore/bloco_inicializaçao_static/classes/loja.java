package javacore.bloco_inicializaçao_static.classes;

public class loja {
    private static int[] parcelas;

    static {
        parcelas = new int[100];
        for(int i=0;i<100;i++){
            loja.parcelas[i]=i;
        }
    }


    public static int[] getParcelas() {
        return parcelas;
    }

    public static void print() {
        for (int i = 0; i < 100; i++) {
            System.out.print(loja.parcelas[i] + " ");
            if (i  % 10 == 0&& i!=0) {
                System.out.print("\n");
            }
        }
    }

}







