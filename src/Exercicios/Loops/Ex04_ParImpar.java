package Exercicios.Loops;

import java.util.Scanner;

public class Ex04_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdNumeros;
        int count = 0;
        int numero;
        int qtdPar = 0, qtdImpar = 0;

        System.out.println("Quantidade de números: ");
        qtdNumeros = scan.nextInt();

        do {
            System.out.println("Digite o número: ");
            numero = scan.nextInt();

            if(numero % 2 == 0) qtdPar++;
            else qtdImpar++;

            count++;
        } while(count < qtdNumeros);

        System.out.println("Foram digitados " + qtdPar + " números pares.");
        System.out.println("Foram digitados " + qtdImpar + " números ímpares.");
    }
}
