package question04;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Sale sale1 = new Sale("Vanish", new BigDecimal("20"), 5);
        BigDecimal valorComDesconto = DiscountAmount.discount
                (sale1.getPreco(), sale1.getQuantidade());
        System.out.printf("Produto: %s;%nValor Total: %s.", sale1.getNome(), valorComDesconto);
    }
}
