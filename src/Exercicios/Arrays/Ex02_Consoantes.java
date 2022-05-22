package Exercicios.Arrays;

import java.util.Scanner;

public class Ex02_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] caracteres = new String[6];
        int qtdConsoantes = 0;
        int count = 0;

        do {
            System.out.println("Digite uma letra: ");
            String letra = scan.next();

            caracteres[count] = letra;
            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))) {
                qtdConsoantes++;
            }
            count++;
        } while(count < caracteres.length);

        System.out.println("Foram digitadas as letras:");
        for(int i = 0; i <= (caracteres.length - 1); i++) {
            System.out.print(caracteres[i] + " ");
        }

        System.out.println("\nAs consoantes digitadas foram: ");
        for( String consoante : caracteres ) {
            if(!(consoante.equalsIgnoreCase("a")) &&
               !(consoante.equalsIgnoreCase("e")) &&
               !(consoante.equalsIgnoreCase("i")) &&
               !(consoante.equalsIgnoreCase("o")) &&
               !(consoante.equalsIgnoreCase("u")) ) {
                System.out.print(consoante + " ");
            }
        }

        System.out.println("\nForam digitadas " + qtdConsoantes + " consoantes.");
    }
}
