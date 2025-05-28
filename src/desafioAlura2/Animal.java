package desafioAlura2;

public class Animal {
    public void emitirSom() {
        System.out.println("Barulho");
    }

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.abanarRabo();
        cachorro.emitirSom();

        Gato gato = new Gato();
        gato.arranharMoveis();
        gato.emitirSom();
    }
}
