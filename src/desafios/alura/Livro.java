package desafios.alura;

import java.util.Scanner;

public class Livro {
    private String titulo;
    private String autor;

    public void Livro() {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes() {
        System.out.println("O nome do livro é: " + getTitulo() + " e o autor é: " + getAutor());
    }

    public static void main(String[] args) {
        Scanner atributosLivro = new Scanner(System.in);

        Livro ler = new Livro();
        System.out.println("Qual o nome do autor?");
        String nomeAutor = atributosLivro.nextLine();
        ler.setAutor(nomeAutor);

        System.out.println("Qual o nome do livro?");
        String nomeTitulo = atributosLivro.nextLine();
        ler.setTitulo(nomeTitulo);

        ler.exibirDetalhes();
    }


}
