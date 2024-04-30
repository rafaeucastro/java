package aula;

import java.util.Locale;

public class ResourceBundle {
    public static void main(String[] args) {
        System.out.println("Locale atual:  " + Locale.getDefault());
        java.util.ResourceBundle rb = java.util.ResourceBundle.getBundle("meu-texto");

        System.out.println("Hello: " + rb.getString("world"));

        Locale.setDefault(new Locale("pt_BR", "pt_BR"));
        rb = java.util.ResourceBundle.getBundle("meu-texto");
        System.out.println("Olá " + rb.getString("world"));
    }
}
