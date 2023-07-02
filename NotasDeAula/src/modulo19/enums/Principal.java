package modulo19.enums;

public class Principal {
    public static void main(String[] args) {
        //método que retorna o numero int correspondente:
        System.out.println(StatusPedido.EMITIDO.ordinal());
        //método que retorna uma string com o nome do enum:
        System.out.println(StatusPedido.EMITIDO.name());

        //values() retorna um array com os enums:
        for (StatusPedido status : StatusPedido.values()) {
            System.out.printf("%d - %s%n", status.ordinal(), status.name());
        }
        //método valueof() captura uma string e verifica de faz parte dos enums:
        String textoStatus = "CANCELADO";
        StatusPedido status = StatusPedido.valueOf(textoStatus);
        System.out.println(status.ordinal() + " - " + status.name());
        //mecanismo para verificar um enum a partir de um inteiro:
        int numero = 1;
        StatusPedido status = StatusPedido.values()[numero];
        System.out.println(status.ordinal() + " - " + status.name());
    }
}
