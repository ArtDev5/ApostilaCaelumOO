package main.java.banco;

public abstract class Conta {
    private String nomeDoTitular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataDeAbertura;

    public Conta() {}

    public Conta(String nome){
        this.nomeDoTitular = nome;
    }

    public void saca(double valor){
        this.saldo -= valor;
    }

    public void deposita(double valor){
        this.saldo+= valor;
    }

    public double calculaRendimento(){
        return this.saldo *0.1;
    }

    public String recuperaDadosParaImpressao(){
        String dados = "Titular: " + this.nomeDoTitular;
        dados += "\nNúmero: " + this.numero;
        dados += "\nAgência: " + this.agencia;
        dados += "\nSaldo: R$" + this.saldo;
        dados += "\nData de abertura: " + this.dataDeAbertura;
        return dados;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getDataDeAbertura() {
        return dataDeAbertura;
    }

    public void setDataDeAbertura(String dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

    public abstract String getTipo();

    @Override
    public String toString() {
        return "Conta{" +
                "nomeDoTitular='" + nomeDoTitular + '\'' +
                ", numero=" + numero +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
                ", dataDeAbertura='" + dataDeAbertura + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return numero == conta.numero && agencia.equals(conta.agencia);
    }

}
