package question14;

import java.util.Arrays;
import java.util.Random;

public class ArraysSum {

    public static void main(String[] args) {
//        Criando os vetores: atribuindo o método gerarVetorAleatorio que ainda será implementado.
        int[] array1 = gerarVetorAleatorio(5);
        int[] array2 = gerarVetorAleatorio(5);
//        Ordenando cada vetor individualmente
        Arrays.sort(array1);
        Arrays.sort(array2);
//        Combinação dos vetores
        int[] arrayNew = combinarVetoresOrdenados(array1, array2);
//        Imprimindo os vetores
        System.out.println("Vetor 1: " + Arrays.toString(array1));
        System.out.println("Vetor 2: " + Arrays.toString(array2));
        System.out.println("Novo vetor: " + Arrays.toString(arrayNew));
    }

    //     Função para gerar um vetor com valores inteiros aleatórios
    public static int[] gerarVetorAleatorio(int tamanho) {
        Random generator = new Random();
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = generator.nextInt(100) + 1;
        }
        return vetor;
    }

    //    Função para combinar dois vetores ordenados em um novo vetor ordenado
    public static int[] combinarVetoresOrdenados(int[] array1, int[] array2) {
        int[] novoVetor = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                novoVetor[k++] = array1[i++];
            } else {
                novoVetor[k++] = array2[j++];
            }
        }
        while (i < array1.length) {
            novoVetor[k++] = array1[i++];
        }
        while (j < array2.length) {
            novoVetor[k++] = array2[j++];
        }
        return novoVetor;
    }
}
