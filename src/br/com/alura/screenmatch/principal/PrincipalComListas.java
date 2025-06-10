package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        Filme outroFilme = new Filme("Avatar", 2023);
        Serie lost = new Serie(2000, "Lost");

        ArrayList<Titulo > listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(filmeDoPaulo);
        listaDeAssistidos.add(meuFilme);
        listaDeAssistidos.add(outroFilme);
        listaDeAssistidos.add(lost);
        listaDeAssistidos.forEach(titulo -> System.out.println(listaDeAssistidos));
            Filme filme = (Filme) item;
            System.out.println("Certificação " + filme.getClassificacao());
        }
    }
}
