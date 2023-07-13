package question04;

import java.math.BigDecimal;

public class DiscountAmount {
    public static BigDecimal discount(BigDecimal preco, int quantidade) {
        BigDecimal valorTotal = preco.multiply(BigDecimal.valueOf(quantidade));
        if (quantidade < 0) System.out.println("Quantidade inválida");
        else if (quantidade >= 11 && quantidade <= 20)
            valorTotal = valorTotal.multiply(BigDecimal.valueOf(0.9));
        else if (quantidade >= 21 && quantidade <= 50)
            valorTotal = valorTotal.multiply(BigDecimal.valueOf(0.8));
        else valorTotal = valorTotal.multiply(BigDecimal.valueOf(0.75));
        return valorTotal;

    }
}
