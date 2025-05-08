package exercises.set;

import java.util.Comparator;

public class ComparatorYearCreationName implements Comparator<FavoriteLanguage> {
    @Override
    public int compare(FavoriteLanguage o1, FavoriteLanguage o2) {
        int yearCreation = Integer.compare(o1.getCreationYear(), o2.getCreationYear());

        if (yearCreation != 0) return yearCreation;

        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
