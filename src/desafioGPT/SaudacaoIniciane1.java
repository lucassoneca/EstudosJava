package desafioGPT;

import java.util.Scanner;

public class SaudacaoIniciane1 {
    public static void main(String[] args) {
        Scanner nome = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String meuNome = nome.nextLine();

        System.out.println("Olá, " + meuNome + "! Seja bem-vindo ao mundo Java.");
    }
}
