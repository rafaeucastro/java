import java.util.ArrayList;
import java.util.Scanner;

public class problema4 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int vote = 0;
        int guga = 0;
        int hercules = 0;
        int lucca = 0;
        int emilly = 0;
        int nulos = 0;
        int brancos = 0;

        do {
            System.out.println("---Sistema de votos---");
            System.out.println("# ELEIÇÃO PRESIDENCIAL");
            System.out.println("Insira seu voto de acordo com as opções abaixo:");
            System.out.println("1- George\n2- Heitor\n3- Luccas\n4- Emilly");
            System.out.println("5 - Nulo\n6- Branco\n0- Finalizar");
            System.out.println("Seu voto: ");
            vote = input.nextInt();

            switch (vote) {
                case 1:
                    guga++; 
                    break;
                case 2:
                    hercules++;
                    break;
                case 3:
                    lucca++;
                    break;
                case 4:
                    emilly++;
                    break;
                case 5:
                    nulos++;
                    break;
                case 6:
                    brancos++;
                    break;
                case 0:
                    System.out.println("Votação finalizada com sucesso!");
                    break;
                default:
                    System.out.println("CODIGO INVALIDO!");
                    break;
            }

        }while(vote != 0);

        input.close();

        int total_votos = guga + hercules + lucca + emilly + nulos + brancos;

        System.out.println(total_votos);

        System.out.println("CANDIDATO - VOTOS - PORCENTAGEM");
        System.out.println("# George      " + guga + "        " + (guga*100)/total_votos + "%");
        System.out.println("# Heitor      " + hercules + "        " + (hercules*100)/total_votos + "%");
        System.out.println("# Luccas      " + lucca + "        " + (lucca*100)/total_votos + "%");
        System.out.println("# Emilly      " + emilly + "        " + (emilly*100)/total_votos + "%");
        System.out.println("# Nulos       " + nulos + "        " + (nulos*100)/total_votos + "%");
        System.out.println("# Branco      " + brancos + "        " + (brancos*100)/total_votos + "%");
    }
}
