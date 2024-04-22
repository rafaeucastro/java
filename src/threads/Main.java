package threads;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        MinhaThreadSoma t1 = new MinhaThreadSoma("#1", array);
        MinhaThreadSoma t2 = new MinhaThreadSoma("#2", array);

        //É possível definir a prioridade de uma thread.
        Thread prior = new Thread("Prior");
        prior.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Programa finalizado");
    }
}
