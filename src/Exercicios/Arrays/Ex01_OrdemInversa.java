package Exercicios.Arrays;

public class Ex01_OrdemInversa {
    public static void main(String[] args) {

        int count = 0;
        int[] vetor = {1, 5, 3, 20, -2, 9};

        System.out.println("Ordem original: ");

        while(count < vetor.length) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.println("\nOrdem inversa: ");

        for(int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
