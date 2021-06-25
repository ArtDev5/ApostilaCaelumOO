package main.java.cap3;

public class Sintaxe {
    public static void main(String[] args) {

        for(int i = 150; i < 300; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        int sum = 0;
        for(int i = 1; i < 1000; i++){
            sum+=i;
        }
        System.out.println(sum);
        for(int i = 1; i < 100; i++){
            if(i % 3 == 0){
                System.out.print(i + " ");
            }
        }


        long fatorial = 1;
        for (int i = 1; i < 20; i++) {
            fatorial *=i;
            System.out.println("fatorial de "+ i +" é: " + fatorial);
        }

    }
}
