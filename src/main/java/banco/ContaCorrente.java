package main.java.banco;

public class ContaCorrente extends Conta implements Tributavel{

    public String getTipo(){
        return "Conta Corrente";
    }


    @Override
    public double getValorImposto() {
        return this.getSaldo() * 0.01;
    }
}
