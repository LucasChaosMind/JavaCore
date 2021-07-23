package javacore.polimorfismo.classes;

public class DatabaseDaoImpl implements DAO {
    @Override
    public void save(){
        System.out.println("Salavando no Banco de dados...");
    }
}
