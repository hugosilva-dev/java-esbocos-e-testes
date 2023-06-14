package modulo24.nestedclasses;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(new BigDecimal("1000"));
        System.out.println(conta.getSaldo());

        ContaCorrente.Transacao transacao01 = conta.new Transacao
                ("Compra 01", new BigDecimal("202.30"));

        ContaCorrente.Transacao transacao02 = conta.new Transacao
                ("Compra 02", new BigDecimal("349.99"));

        System.out.println(conta.getSaldo());

        for (ContaCorrente.Transacao transacao : conta.getTransacoes()) {
            System.out.printf("%s = %s%n", transacao.getDescricao(), transacao.getValor());
        }

    }
}
