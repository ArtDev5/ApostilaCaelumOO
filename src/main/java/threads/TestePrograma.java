package main.java.threads;

public class TestePrograma {
    public static void main(String[] args) {
        // Rodando com a classe anônima
//        Runnable r = new Runnable() {
//            public void run() {
//                for(int i = 0; i < 10; i++){
//                    System.out.println("Programa 1 valor: " + i);
//                }
//            }
//        };
//
//        Thread t = new Thread(r);
//        t.start();

        // com lambda 8
        // não é necessário escrever o nome do método
        // caso haja parâmetros, são passados diretamente nas ()
//        Runnable r = () -> {
//            for(int i = 0; i < 10000; i++)
//                System.out.println("programa 1 valor " + i);
//        };
//        Thread t = new Thread(r);
//        t.start();

        // Utilizando o lambda ciretamente para o construtor de Thread
        // Sem criar variável temporária
        new Thread(() -> {
            for(int i = 0; i < 10; i++)
                System.out.println("programa 1 valor " + i);
        }).start();
    }
}
