import java.util.Scanner;

public class problema2 {
    // public double[] listAdd(String code) {
    //     double[] in_cash = {};
    //     double[] on_term = {};

    //     if(code == "V") {
            
    //     } else {
            
    //     }
    //     double[] a =  {2.3, 3.4};
    //     return a;
    // }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        float total_purchases = 0;
        float total_in_cash = 0;
        float total_on_term = 0;
        int code = 1;
        float in_cash = 0;
        float on_term = 0;
        float value;

        for(int i = 0; i < 3; i++) {
            do {
                System.out.println("Códigos válidos para transação: 1 - À vista, 2 - Prazo");
                System.out.println("Digite o código da transação: ");
                code = input.nextInt();
            }while(code < 1 && code > 2);

            System.out.println("Agora o valor: ");
            value = input.nextFloat();

            if(code == 1) {
                total_in_cash += value;
            } else {
                total_on_term += value;
            }
        }

        total_purchases = total_in_cash + total_on_term;

        System.out.println("Valor total das compras à vista: " + total_in_cash);
        System.out.println("Valor total das compras à prazo: "+ total_on_term);
        System.out.println("Total de compras efetuadas: "+ total_purchases);
        System.out.println("Valor da primeira prestação à prazo juntas: "+ total_on_term/3);

        input.close();
    }
}