package javacore.introduçaometodos;

public class Private_Get_Set {
    private String nome;
    private int idade;
    private String mat;

    public void setNome(String nome){
        this.nome=nome;
    }
    public void setIdade(int idade){
        this.idade=idade;
    }
    public void setMat(String mat){
        this.mat=mat;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getMat(){
        return this.mat;
    }
}
