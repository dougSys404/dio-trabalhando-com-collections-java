package exercises.set;

import java.util.Comparator;

public class ComparatorIde implements Comparator<FavoriteLanguage> {
    @Override
    public int compare(FavoriteLanguage o1, FavoriteLanguage o2) {
        return o1.getIde().compareToIgnoreCase(o2.getIde());
    }
}
