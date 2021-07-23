package javacore.introduçaometodos;

public class MetodoBolha {
    public void bolha (int Vet[]){
        int Aux;
        for(int i=0;i<Vet.length;i++){
            for(int j=0;j<i;j++){
                if(Vet[i]>Vet[j]){
                    Aux=Vet[i];
                    Vet[i]=Vet[j];
                    Vet[j]=Aux;
                }
            }
        }
       /* int j=0;
        while (Vet.length>j){
            System.out.println(Vet[j]);
            j++;
        }*/
    }

}
