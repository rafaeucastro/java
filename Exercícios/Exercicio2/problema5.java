import java.util.Scanner;
import java.text.DecimalFormat;

public class problema5 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        DecimalFormat formater = new DecimalFormat("0.00");

        System.out.println("Digite o valor do seu salário: ");
        float mary_wage = input.nextFloat();

        float jhon_wage = mary_wage / 3;

        int months = 0;

        while(jhon_wage < mary_wage) {
            mary_wage += mary_wage * 1/100; //0,01
            jhon_wage += jhon_wage * 3/100; //0,03
            months++;
            System.out.println(formater.format(mary_wage));
            System.out.println(formater.format(jhon_wage));
        }

        System.out.println("Foi/Foram necessário(s) "+ months +" meses para que o valor de João igualasse ou ultrapassase o de Maria.");
    }
}
