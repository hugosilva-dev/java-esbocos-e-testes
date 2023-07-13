package modulo24.nestedclasses.desafio;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Principal24 {

    private final static NumberFormat FORMATADOR_MOEDA = NumberFormat.getCurrencyInstance(
            new Locale("pt", "BR"));

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Hugo");
        Pedido pedido = new Pedido(cliente);

        Pedido.Item item1 = pedido.adicionarItem("Papel Report 500", 2, new BigDecimal("20"));
        Pedido.Item item2 = pedido.adicionarItem("Caneta BIC", 5, new BigDecimal("1.25"));

        imprimirResumo(pedido);

        System.out.println("---");

        item1.setQuantidade(5);
        imprimirResumo(pedido);

        pedido.emitir();
        item1.setQuantidade(20); // Não pode alterar pedido após ser emitido
    }

    private static void imprimirResumo(Pedido pedido) {
        for (Pedido.Item item : pedido.getItens()) {
            System.out.printf("%dx %s (%s) = %s%n",
                    item.getQuantidade(), item.getDescricao(),
                    FORMATADOR_MOEDA.format(item.getValorUnitario()),
                    FORMATADOR_MOEDA.format(item.getValorTotal()));
        }

        System.out.printf("Total: %s%n", FORMATADOR_MOEDA.format(pedido.getValorTotal()));
    }

}
