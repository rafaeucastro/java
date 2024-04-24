package aula;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println(soma(2, 1, 5, 6));
    }

    //Varargs não aceita tipo primitivo e deve sempre ser colocado como último argumento
    static int soma(int a, int b, Integer... vetor) {
        int total = a + b;

        for (int i = 0; i < vetor.length; i++) {
            total += vetor[i];
        }

        return total;
    }
}
