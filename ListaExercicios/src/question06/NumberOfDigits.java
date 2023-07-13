package question06;

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        int i = 0;
        System.out.print("Digite um número qualquer: ");
        Scanner leitura = new Scanner(System.in);
        String numero = leitura.nextLine();

        while (i < numero.length()) i++;
        System.out.println("numero de digitos = " + i);

//      System.out.println("A quantidade de dígitos é: " + numero.length());
    }

}
