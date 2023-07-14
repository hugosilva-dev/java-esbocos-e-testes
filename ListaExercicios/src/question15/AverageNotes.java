package question15;

import java.util.Scanner;

public class AverageNotes {

    public static void main(String[] args) {
        System.out.println("Digite as três notas das avaliações realizadas:");
        Scanner leitura = new Scanner(System.in);
        double nota1 = leitura.nextDouble();
        double nota2 = leitura.nextDouble();
        double nota3 = leitura.nextDouble();

        double media = calcularMedia(nota1, nota2, nota3);

        System.out.printf("A nota média é de: %.2f%n", media);
        System.out.println("Situação do aluno: " + Status.getStatus(media));

    }

    private static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3)/3;
    }

    enum Status {
        APROVADO, PROVA_FINAL, REPROVADO;

        public static String getStatus(double media) {
            String status;
            if (media >= 6.0) status = Status.APROVADO.name();
            else if (media >= 4.0) status = Status.PROVA_FINAL.name();
            else status = Status.REPROVADO.name();
            return status;
        }
    }

}
