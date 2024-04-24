package threads;

public class MinhaThreadSoma implements Runnable {
    private String nome;
    private int[] nums;
    private static Calculadora calculadora = new Calculadora();

    MinhaThreadSoma(String nome, int[] nums){
        this.nome = nome;
        this.nums = nums;

        new Thread(this, nome).start();
    }

    @Override
    public void run() {
        System.out.println(this.nome + " iniciada");
        int soma = calculadora.somarArray(this.nums);
    
        System.out.println("Resultado da soma para a thread " + this.nome + " é: " + soma);

        System.out.println(this.nome + " terminada!");
    }
}
