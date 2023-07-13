package question08;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Informe o número de dígitos da sequência de Fibonacci: ");
        Scanner leitura = new Scanner(System.in);
        int n = leitura.nextInt();
        int valorAtual = 0;
        int valorAnterior = 0;
        System.out.print(valorAtual + "\t");

        for (int i = 1; i < n; i++) {
            if (i == 1) {
                valorAtual = 1;
                valorAnterior = 0;
            } else {
                valorAtual += valorAnterior;
                valorAnterior = valorAtual - valorAnterior;
            }
            System.out.print(valorAtual + "\t");
        }
    }
}
