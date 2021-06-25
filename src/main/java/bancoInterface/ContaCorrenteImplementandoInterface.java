package main.java.bancoInterface;

import main.java.banco.SaldoInsuficienteException;
import main.java.banco.Tributavel;

public class ContaCorrenteImplementandoInterface implements Conta, Tributavel {
    private double saldo;

    @Override
    public void deposita(double valor){
        if(valor < 0){
            throw new IllegalArgumentException("Você tentou depositar um valor" +
                    " negativo");
        }else{
            this.saldo+= valor;
        }
    }

    @Override
    public void saca(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Você tentou sacar um valor negativo");
        }
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException();
        }
        this.saldo -= (valor + 0.10);
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }

    @Override
    public double getValorImposto(){
        return this.saldo * 0.01;
    }

}
