package javacore.enum_classes.classes;

public class Cliente {
    private String nome;
    private TipoCliente tipo;

    public Cliente(String nome ,TipoCliente tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return ("Nome: "+nome+"\nTipo: Pessoa "+tipo+"\nDigito: "+tipo.getDig());
    }
}
