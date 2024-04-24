import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Matricula {

    public static void main(String args[]){
        double[] n1 = {5.7, 6.8};
        double[] n2 = {8.9, 7.0};
        String nome = "";
        int matricula = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        nome = entrada.next();
        System.out.println("Digite a sua matrícula: ");
        matricula = entrada.nextInt();
        System.out.println("A nota da 1ª avaliação: ");
        n1[0] = entrada.nextDouble();
        System.out.println("A nota da 2ª avaliação: ");
        n1[1] = entrada.nextDouble();
        System.out.println("A nota da 1ª avaliação (2a Etapa): ");
        n2[0] = entrada.nextDouble();
        System.out.println("A nota da 2ª avaliação (2a Etapa): ");
        n2[1] = entrada.nextDouble();
        
        Aluno novo_aluno = new Aluno(matricula, nome, n1, n2);


        Map<String, Integer> pesoEtapa1 = new HashMap<String, Integer>();
        Map<String, Integer> pesoEtapa2 = new HashMap<String, Integer>();
        
        System.out.println("Digite o peso da avaliação 1: ");
        pesoEtapa1.put("avaliacao1", entrada.nextInt());
        System.out.println("Digite o peso da avaliação 2: ");
        pesoEtapa1.put("avaliacao2", entrada.nextInt());
        System.out.println("Digite o peso da avaliação 1 (2ª Etapa): ");
        pesoEtapa2.put("avaliacao1", entrada.nextInt());
        System.out.println("Digite o peso da avaliação 2 (2ª Etapa): ");
        pesoEtapa2.put("avaliacao2", entrada.nextInt());

        novo_aluno.calcularMediaPorEtapa(1, pesoEtapa1.get("avaliacao1"), pesoEtapa1.get("avaliacao2"));
        novo_aluno.calcularMediaPorEtapa(2, pesoEtapa2.get("avaliacao1"), pesoEtapa2.get("avaliacao2"));

        System.out.println(novo_aluno.apresentaResultado());

        entrada.close();
    }
}