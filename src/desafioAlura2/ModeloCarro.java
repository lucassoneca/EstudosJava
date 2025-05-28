package desafioAlura2;

public class ModeloCarro  extends Carro {
    private String cor;
    private boolean quatroPorQuatro;
    private int quantasRodas;

    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirModelo("Sedan");
        meuCarro.definirPrecos(30000, 32000, 35000);
        meuCarro.exibirInfo();
    }
}
