import java.security.Principal;
import java.util.Scanner;

public class Problema06 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int[][] coordinates = new int[4][4]; 

        for(int x = 0; x < 4; x++) {
            System.out.println("Digite a "+(x+1)+" coordenada: ");
            for(int y = 0; y < 4; y++) {
                coordinates[x][y] = input.nextInt();
            }
        }

        if ((coordinates[0][1] < coordinates[1][0]) || (coordinates[1][1] < coordinates[0][0]) || (coordinates[0][1] < coordinates[1][0]) || (coordinates[1][1] < coordinates[1][1]) || (coordinates[1][0] > coordinates[0][1]) || (coordinates[0][0] > coordinates[1][1]) || (coordinates[1][0] > coordinates[0][1])) {
            System.out.println("Não");
        } else {
            System.out.println("Sim");
        }
    }
}