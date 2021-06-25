package main.java.bancoInterface;

public class ContaPoupancaImplementandoInterface implements Conta{

    private double saldo;

    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 3;
    }

    @Override
    public void deposita(double valor) {
        this.saldo += (valor - 0.1);
    }

    @Override
    public void saca(double valor) {
        this.saldo -= valor;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }
}
