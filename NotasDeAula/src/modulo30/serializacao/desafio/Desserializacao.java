package modulo30.serializacao.desafio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Desserializacao {

    public static void main(String[] args) {

        try (var fileinputstream = new ObjectInputStream
                (new FileInputStream("cliente01.txt"))) {
            Cliente cliente = (Cliente) fileinputstream.readObject();
            System.out.println(cliente);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
