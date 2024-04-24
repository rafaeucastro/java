import java.util.Scanner;

public class Problema04 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int distance = 0;

        do {
            System.out.println("Digite a distância do robô para o início da quadra (entre 0 e 2000): ");
            distance = input.nextInt();
        }while(distance < 0 || distance > 2000 );

        if(distance <= 800) {
            System.out.println("1");
        } else if (distance <= 1400) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }
    }
}
