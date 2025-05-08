package exercises.set;

import java.util.Comparator;

public class ComparatorTempoEp implements Comparator<Series> {

    @Override
    public int compare(Series serie1, Series serie2) {
        return Integer.compare(serie1.getEpisodeLength(), serie2.getEpisodeLength());
    }
}
