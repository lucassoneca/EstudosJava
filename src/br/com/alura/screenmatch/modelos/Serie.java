package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int episodioPorTempora;
    private int minutosPorEpisodio;

    public Serie(int anoDeLancamento, String nome) {
        super(anoDeLancamento, nome);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodioPorTempora() {
        return episodioPorTempora;
    }

    public void setEpisodioPorTempora(int episodioPorTempora) {
        this.episodioPorTempora = episodioPorTempora;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getAnoDeLancamento() {
        return super.getAnoDeLancamento();
    }
}
