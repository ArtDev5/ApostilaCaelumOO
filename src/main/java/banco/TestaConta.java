package main.java.banco;

import main.java.bancoInterface.ContaCorrenteImplementandoInterface;

public class TestaConta {
    public static void main(String[] args) {

    //        Conta banco = new Conta("Artur");
    //        banco.setNumero(1);
    //        banco.deposita(1000);
    //        banco.setDataDeAbertura("04//07/2001");
    //
    //        System.out.println(banco.recuperaDadosParaImpressao());

        ContaCorrenteImplementandoInterface conta = new ContaCorrenteImplementandoInterface();
        conta.saca(1000);

    }
}
