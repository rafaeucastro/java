package threads;

public class TiqueTaque {
    boolean tique;

    synchronized void tique(boolean estaExecutando) {
        if(!estaExecutando){
            tique = true;   
            notify();
            return;
        }

        System.out.print("Tique ");

        tique = true;
        notify();

        while(tique) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }  
    }

    synchronized void taque(boolean estaExecutando) {
        if(!estaExecutando){
            tique = false;   
            notify();
            return;
        }

        System.out.print("Taque ");

        tique = false;
        notify();

        while(!tique) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }  
    }
}
