import java.util.Scanner;

public class Problema01 {
    public static void main(String args[]) {
      Scanner entrada = new Scanner(System.in);
      int comprimento = 160, largura = 70;
      int base = 0, topo = 0;
      int area_da_nota = 160 * 70;

      //pedir os valores ao usuário
      System.out.println("Digite o valor da Base: ");
      base = entrada.nextInt();
      System.out.println("Digite o valor do Topo: ");
      topo = entrada.nextInt();

      //calcular a área da esquerda usando a fórmula do trapézio
      int area_esquerda = (((base+topo)/2)*largura);
      int area_direita = area_da_nota - area_esquerda;

      //lógica
      if((base == (comprimento/2)) && (topo == (comprimento/2))) {
        System.out.println("O valor da nota se perdeu");
      } else if(area_esquerda > area_direita) {
        System.out.println("Francisco ficou com o pedaço maior!");
      } else {
        System.out.println("Francisca ficou com o pedaço maior!");
      }
    }
  }