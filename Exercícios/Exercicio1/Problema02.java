import java.util.Scanner;
import java.math.*;
import java.text.MessageFormat;

public class Problema02 {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        float valor_da_compra = 0, valor_da_parcela = 0, quantidade_de_parcelas = 0;

        //lendo o valor do usuário
        System.out.println("Digite o valor da compra: ");
        valor_da_compra = entrada.nextFloat();
        System.out.println("Em quantas parcelas você deseja pagar?");
        quantidade_de_parcelas = entrada.nextInt();

        //definir o valor da parcela
        valor_da_parcela = valor_da_compra/quantidade_de_parcelas;

        //arrendondar o valor da parcela
        final float valor_parcela_inteira = Math.round(valor_da_parcela);

        String parcelas  = "";

        if(valor_parcela_inteira > valor_da_parcela) {
            //for para colocar o valor das parcelas em uma string
            for(int parcela = 1; parcela <= quantidade_de_parcelas; parcela++) {
                //na última parcela subtrai 1
                if(parcela == quantidade_de_parcelas) {
                    parcelas = parcelas + MessageFormat.format("{0} ", valor_parcela_inteira - 1);
                } else {
                    parcelas = parcelas + MessageFormat.format("{0} ", valor_parcela_inteira);
                }
            }
        } else if (valor_parcela_inteira < valor_da_parcela){
            for(int parcela = 1; parcela <= quantidade_de_parcelas; parcela++) {
                //na primeira parcela soma 1
                if(parcela == 1) {
                    parcelas = parcelas + MessageFormat.format("{0} ", valor_parcela_inteira + 1);
                } else {
                    parcelas = parcelas + MessageFormat.format("{0} ", valor_parcela_inteira);
                }
            }
        } else {
            for(int parcela = 1; parcela <= quantidade_de_parcelas; parcela++) {
                parcelas = parcelas + MessageFormat.format("{0} ", valor_parcela_inteira);
            }
        }
        
        System.out.println("Valor da parcela em decimal: " + valor_da_parcela);
        System.out.println("Parcelas: " + parcelas);

    }
}