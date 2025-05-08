package exercises.set;

import java.util.Comparator;

public class ComparatorGenero implements Comparator<Series> {
    @Override
    public int compare(Series serie1, Series serie2) {
        return serie1.getGenre().compareTo(serie2.getGenre());
    }
}
