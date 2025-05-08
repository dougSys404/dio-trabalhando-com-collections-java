package exercises.set;

import java.util.Objects;

public class Series implements Comparable<Series> {

    private String name;
    private String genre;
    private Integer episodeLength;

    public Series(String name, String genre, Integer episodeLength) {
        this.name = name;
        this.genre = genre;
        this.episodeLength = episodeLength;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getEpisodeLength() {
        return episodeLength;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", episodeLength=" + episodeLength +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return Objects.equals(name, series.name) && Objects.equals(genre, series.genre) && Objects.equals(episodeLength, series.episodeLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, genre, episodeLength);
    }

    @Override
    public int compareTo(Series serie) {
        int tempoEp = Integer.compare(this.getEpisodeLength(), serie.getEpisodeLength());
        if (tempoEp != 0) return tempoEp;
        return this.genre.compareTo(serie.getGenre());

    }
}
