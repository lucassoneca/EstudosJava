package desafioGPT;

import java.util.Scanner;

public class menuBancario {
    public static void main(String[] args) {
        double saldo = 1000;
        Scanner escolha = new Scanner(System.in);

        System.out.println("----------------------");
        System.out.println("1. Ver saldo");
        System.out.println("2. Sacar");
        System.out.println("3. Depositar");
        System.out.println("4. Sair");
        System.out.println("----------------------");

        int escolhaNumero = escolha.nextInt();
        switch (escolhaNumero) {
            case 1:
                System.out.println("Seu saldo é de: R$" + saldo);
                break;
            case 2:
                System.out.println("Quanto deseja sacar?");
                double valorSacado = escolha.nextDouble();
                    if (valorSacado > saldo) {
                        System.out.println("Impossível continuar o saque, valor insuficiente");
                    } else {
                        saldo -= valorSacado;
                        System.out.println("Seu saldo atual é de: R$" + saldo);
                    }
                break;
            case 3:
                System.out.println("Qual o valor deseja depositar?");
                double valorDepositado = escolha.nextDouble();
                saldo += valorDepositado;
                System.out.println("Seu saldo atualizado é de: R$" + saldo);
                break;
            case 4:
                System.out.println("Operação encerrada.");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        escolha.close();
    }
}

