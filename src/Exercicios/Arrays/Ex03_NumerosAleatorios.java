package Exercicios.Arrays;

import java.util.Random;

public class Ex03_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numAleatorios = new int[20];

        for(int i = 0; i < numAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numAleatorios[i] = numero;
        }

        System.out.println("Os números aleatórios são:");
        for ( int numero: numAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.println("\nOs sucessores de cada número aleatório são:");
        for ( int numero: numAleatorios) {
            System.out.print((numero + 1) + " ");
        }
    }
}
