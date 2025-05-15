package desafioGPT.Desafio.geral;

import java.util.Scanner;

public class Gerente extends Funcionario {
    private double bonusAnual;

    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    Gerente coloboradores = new Gerente();
    Scanner coisasGerente = new Scanner(System.in);

    public void nomeGerente() {
        String nomeGerente = coisasGerente.nextLine();
        coloboradores.setNome(nomeGerente);
    }

    public void IdadeGerente() {
        int idadeGerente = coisasGerente.nextInt();
        coloboradores.setIdade(idadeGerente);
        System.out.println(idadeGerente);
    }

    public void salariodoGerente() {
        double salarioGerente = getSalario();
        double bonusSalario = 450;
        double salario = salarioGerente + bonusSalario;
        System.out.println("O salário do gerente é de: " + salario);
    }
}
