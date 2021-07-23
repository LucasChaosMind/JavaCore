package javacore.polimorfismo.classes;

public class ArquivoDAOImpl implements DAO{
    @Override
    public void save(){
        System.out.println("Salvado dados nos arquivos...");
    }

}
