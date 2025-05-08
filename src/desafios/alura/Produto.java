package desafios.alura;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double percentual) {
        double desconto = preco * percentual/100;
        preco -= desconto;
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Celular", 2000);

        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getPreco());

        produto.aplicarDesconto(30);
        System.out.println("Consigo fazer o " + produto.getNome() + " por " + produto.getPreco());
        System.out.println("Desconto bom da zorra");
    }
}
