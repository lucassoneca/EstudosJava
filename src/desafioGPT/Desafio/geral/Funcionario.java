package desafioGPT.Desafio.geral;

import java.util.Scanner;

public class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static void main(String[] args) {
        Funcionario coloboraddores = new Funcionario();
        Scanner nomes = new Scanner(System.in);

        String nomeFuncionario = nomes.nextLine();
        coloboraddores.setNome(nomeFuncionario);

        int idadeFuncionario = nomes.nextInt();
        coloboraddores.setIdade(idadeFuncionario);

        double salarioFuncionario = nomes.nextDouble();
        coloboraddores.setSalario(salarioFuncionario);
    }
}
