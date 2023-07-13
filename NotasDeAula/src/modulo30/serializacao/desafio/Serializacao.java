package modulo30.serializacao.desafio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

public class Serializacao {

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua das Ameixas", "1000", "Centro");
        Cliente cliente = new Cliente("João da Silva", endereco, new BigDecimal("100000"));

        System.out.println(cliente);

        try (var outputstream = new ObjectOutputStream
                (new FileOutputStream("cliente01.txt"))) {
            outputstream.writeObject(cliente);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}