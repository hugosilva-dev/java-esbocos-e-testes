package question13;

import java.util.Arrays;
import java.util.Random;

public class Random100 {
    public static void main(String[] args) {
        Random gerador = new Random();
        int[] numeros = new int[100];
        for (int i = 0; i < 100; i++) {
            numeros[i] = gerador.nextInt(1000);
        }
        Arrays.sort(numeros);
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }
    }
}
