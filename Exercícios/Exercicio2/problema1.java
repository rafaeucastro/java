import java.util.Scanner;

public class problema1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        float valor = 5;
        int ingressos = 120;
        int despesas = 200;
        float lucro = 0;
        // float porcentagem_de_aumento = 1.13;

        lucro = (valor*ingressos)-despesas;

        System.out.println("Preço do ingresso: "+ valor);
        System.out.println("Ingressos vendidos: "+ ingressos);
        System.out.println("Lucro esperado: "+ lucro);

        for(int i = 0; i<= 7; i++) {
            valor -= 0.5;
            ingressos += 26;
            lucro = (valor*ingressos)-despesas;
            
            System.out.println("\nPreço do ingresso: "+ valor);
            System.out.println("Ingressos vendidos: "+ ingressos);
            System.out.println("Lucro esperado: "+ lucro);
        }
        
    }
}