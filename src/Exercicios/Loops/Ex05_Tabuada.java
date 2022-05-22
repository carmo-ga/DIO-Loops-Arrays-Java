package Exercicios.Loops;

import java.util.Scanner;

public class Ex05_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroTabuada;

        System.out.println("Deseja gerar a tabuada de qual número?");
        numeroTabuada = scan.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(numeroTabuada + " X " + i + " = " + (numeroTabuada * i));
        }
    }
}
