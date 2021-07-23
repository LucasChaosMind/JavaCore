package javacore.resourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("menssages", new Locale("en","US"));
        System.out.println(rb.getString("ola"));
        System.out.println(rb.getString("bomdia"));
        System.out.println(rb.getString("entende"));
        rb = ResourceBundle.getBundle("menssages", new Locale("jp","JP"));
        System.out.println(rb.getString("ola"));
        System.out.println(rb.getString("bomdia"));
        System.out.println(rb.getString("entende"));

    }
}
