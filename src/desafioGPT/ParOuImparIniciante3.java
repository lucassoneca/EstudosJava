package desafioGPT;

import java.util.Scanner;

public class ParOuImparIniciante3 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Digite um número e eu direi se ele é par ou ímpar");
        int numeroDigitado = numero.nextInt();

        // % = operador modulo
        //verifica se o número é divisível por 2, se for o resto é igual a 0 ( == 0 )
        if (numeroDigitado % 2 == 0) {
            System.out.println("O número " + numeroDigitado + " é PAR.");
        } else {
            System.out.println("O número " + numeroDigitado + " é ÍMPAR.");
        }
    }
}
