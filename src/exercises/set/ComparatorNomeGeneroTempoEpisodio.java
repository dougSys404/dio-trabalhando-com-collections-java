package exercises.set;

import java.util.Comparator;

public class ComparatorNomeGeneroTempoEpisodio implements Comparator<Series> {
    @Override
    public int compare(Series serie1, Series serie2) {
        int nome = serie1.getName().compareTo(serie2.getName());
        if (nome != 0) return nome;

        int genre = serie1.getGenre().compareTo(serie2.getGenre());
        if (genre != 0) return genre;

        int tempoEpisodio = Integer.compare(serie1.getEpisodeLength(), serie2.getEpisodeLength());

        return tempoEpisodio;

    }
}
