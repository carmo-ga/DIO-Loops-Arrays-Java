package Exercicios.Loops;

import java.util.Scanner;

public class Ex03_MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0;

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            soma += numero;

            if(numero > maior) maior = numero;

            count++;
        } while(count < 5);

        System.out.println("Maior número digitado: " + maior);
        System.out.println("Soma dos números digitados: " + (soma / count));
    }
}
