package javacore.polimorfismo.test;

import javacore.polimorfismo.classes.ArquivoDAOImpl;
import javacore.polimorfismo.classes.DAO;

import java.util.ArrayList;
import java.util.List;

public class DAO_Test {
    public static void main(String[] args) {
        DAO arquivoDAO = new ArquivoDAOImpl();
        arquivoDAO.save();

        List<String> lista = new ArrayList<>();

        lista.add("Yooda");
        lista.add("Marvis");
        lista.add("ZeroTwo");

        for(String nome : lista){
            System.out.println("Awwww: "+nome);
        }
    }
}
