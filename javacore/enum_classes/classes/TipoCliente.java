package javacore.enum_classes.classes;

public enum TipoCliente {
    JURIDICA(1), FISICA(2);
    private int dig;
    TipoCliente(int dig){
        this.dig = dig;
    }

    public int getDig() {
        return this.dig;
    }
}
