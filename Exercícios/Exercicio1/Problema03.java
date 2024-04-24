import java.util.Scanner;

public class Problema03 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int helicopter = 0, police_officer= 0, fugitive= 0, direction= 0;
        int h, p = 0;

        System.out.println("Valores válidos para as posições: 0 - 15");
        do{
            System.out.println("Digite a posição do helicóptero: ");
            helicopter = input.nextInt();
        } while(helicopter < 0 || helicopter > 15);

        do{
            System.out.println("Digite a posição do policial: ");
            police_officer = input.nextInt();
        } while(police_officer < 0 || police_officer > 15);

        do{
            System.out.println("Digite a posição do fugitivo: ");
            fugitive = input.nextInt();
        } while(fugitive < 0 || fugitive > 15);

        do{
            System.out.println("Digite a direção para onde o fugitivo irá (-1 para anti-horário e 1 para horário): ");
            direction = input.nextInt();
        } while(direction < -1 || direction > 1);

        p = (police_officer - fugitive) / direction;
        h = (helicopter - fugitive) / direction;

        if(p < 0) {
            p = p + 16;
        }

        if(h < 0) {
            p = p + 16;
        }

        if(h < p) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
        
        // if(direction == -1) {
        //     // anti-horário
        //     // incrementar();
            
        //     while(fugitive != helicopter && fugitive != police_officer){
        //         //quando chegar na posição limite, atribuir o valor como se fosse um incremento
        //         if(fugitive == 15) {
        //             fugitive = 0;
        //         } else {
        //             fugitive++;
        //         }
        //     }
        //     if(fugitive == helicopter) {
        //         System.out.println("S");
        //     } else {
        //         System.out.println("N");
        //     }

        // } else {
        //     // horário
        //     // decrementar();
        //     while(fugitive != helicopter && fugitive != police_officer){
        //         if(fugitive == 0) {
        //             fugitive = 15;
        //         } else {
        //             fugitive--;
        //         }
        //     }
        //     if(fugitive == helicopter) {
        //         System.out.println("S");
        //     } else {
        //         System.out.println("N");
        //     }
        // }

    }
}