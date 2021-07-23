package javacore.metodos_staticos.classes;

public class Pessoas {
    private static int idade;
    private static String nome;

    public static int getIdade() {
        return idade;
    }

    public static void setIdade(int idade) {
        Pessoas.idade = idade;
    }

    public static void setNome(String nome) {
        Pessoas.nome = nome;
    }

    public static String getNome() {
        return nome;
    }


    public static void printf(Pessoas x){
        System.out.println(Pessoas.getIdade());
        System.out.println(Pessoas.getNome());
    }
}
