package main.java.arrays;

import main.java.banco.Conta;
import main.java.banco.ContaCorrente;

public class TestaArrays {
    public static void main(String[] args) {

        Conta[] contas = new Conta[10];

        for(int i = 0; i < contas.length; i++){
            Conta conta = new ContaCorrente();
            conta.deposita(i*100);
            contas[i] = conta;
        }

        double total = 0;

        for(int i = 0; i < contas.length; i++){
            total += contas[i].getSaldo();
        }

        System.out.println("Média: " + (total/contas.length));
    }
}
