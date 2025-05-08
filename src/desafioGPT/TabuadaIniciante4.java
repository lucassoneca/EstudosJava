package desafioGPT;

import java.util.Scanner;

public class TabuadaIniciante4 {

    public static void main(String[] args) {
        Scanner numeroSolicitado = new Scanner(System.in);

        System.out.println("Digite um número para ver a tabuada: ");
        int numeroCalculo = numeroSolicitado.nextInt();

        System.out.println("\nTabuada do " + numeroCalculo + ":");

        for (int i = 0; i <= 10; i++) {
            int resultado = numeroCalculo * i;
            System.out.println(numeroCalculo + " x " + i + " = " + resultado);
        }
    }
}
