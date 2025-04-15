package desafioGPT;

import java.util.Scanner;

public class CalculadoraIniciante2 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Bem vindo a calculadora! Digite um número: ");
        int meuNumero = numero.nextInt();
        System.out.println("Qual operação deseja fazer?");
        System.out.println("1. soma \n2. subtração \n3. multiplicação \n4. divisão");
        int escolha = numero.nextInt();
        System.out.println("Escolha o segundo número:");
        int meuNumero2 = numero.nextInt();

        if (escolha == 1) {
            int resultado = meuNumero += meuNumero2;
            System.out.println("O resultado da sua operação é de: " + resultado);
        } else if (escolha == 2) {
            int resultado = meuNumero -= meuNumero2;
            System.out.println("O resultado da sua operação é de: " + resultado);
        } else if (escolha == 3) {
            int resultado = meuNumero *= meuNumero2;
            System.out.println("O resultado da sua operação é de: " + resultado);
        } else if (escolha == 4) {
            if (meuNumero2 == 0 || meuNumero == 0) {
                System.out.println("Erro, divisão por 0");
            }
            int resultado = meuNumero /= meuNumero2;
            System.out.println("O resultado da sua operação é de: " + resultado);
        } else {
            System.out.println("Operação desconhecida.");
        }
    }
}
