package javacore.introduçaometodos;

public class ProfExe {
    public String nome;
    public int idade;
    public double[] nota = new double[3];

    public void Printg (double total){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);

        if(total>=6.0){
            System.out.println("Aprovado ! Nota: "+total);
        }
        else{
            System.out.println("Reprovado! Nota: "+total);
        }

    }

    public double Notadev(double[] vet){
        double cont=0,soma=0;

        for(int i=0;i<3;i++){
         soma=soma+ vet[i];
         cont++;
        }
        return (soma/cont);
    }
}
