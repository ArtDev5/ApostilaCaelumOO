package main.java.threads;

public class Programa1 implements Runnable {
    public void run () {
        for (int i = 0; i < 10; i++) {
            System.out.println("Programa 1 valor: " + i);
        }
    }
}
