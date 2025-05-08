package desafios.alura;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public Aluno() {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public void calcularMedia() {
        double somaNotas = nota1 + nota2 + nota3 + nota4;
        double mediaNotas = somaNotas/4;
        System.out.println("A média é " + mediaNotas);
    }

    public static void main(String[] args) {
        Aluno media = new Aluno();

        Scanner atributosAluno = new Scanner(System.in);

        System.out.println("Qual o nome do aluno?");
        String nomeAluno = atributosAluno.nextLine();
        media.setNome(nomeAluno);

        System.out.println("Nome do aluno: " + media.getNome());

        media.setNota1(5.2);
        media.setNota2(6.4);
        media.setNota3(7.1);
        media.setNota4(4.6);

        media.calcularMedia();
    }
}
