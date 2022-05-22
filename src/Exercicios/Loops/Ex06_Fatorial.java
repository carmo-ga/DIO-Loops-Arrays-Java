package Exercicios.Loops;

import java.util.Scanner;

public class Ex06_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int resultado = 1;

        System.out.println("Digite um número inteiro para calcular seu fatorial.");
        numero = scan.nextInt();

        for(int i = numero; i > 1 ; i--) {
            resultado *= i;
        }
        System.out.println("O resultado de " + numero + "! é: " + resultado);
    }
}
