package javacore.introduçaometodos;

public class Args_For_It_This {
    public String nome;
    public String matricula;
    public double[] nota = new double[5];


    public void SomaArgs(int... x){
        int soma=0;
        for(int i : x){
            soma +=i;
        }
        System.out.println("Faltas: "+soma);
    }

    public void imprime (){
        System.out.println(this.nome);
        System.out.println(this.matricula);
    }
    public double notacalc(double x[]){
        double aux=0, cont=0;

        for(int i=0;i<x.length;i++){
            aux+=x[i];
            cont++;
        }
        return (aux/cont);
    }

}
