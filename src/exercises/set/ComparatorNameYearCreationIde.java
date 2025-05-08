package exercises.set;

import java.util.Comparator;

public class ComparatorNameYearCreationIde implements Comparator<FavoriteLanguage> {
    @Override
    public int compare(FavoriteLanguage o1, FavoriteLanguage o2) {
        int name = o1.getName().compareToIgnoreCase(o2.getName());
        int yearCreation = Integer.compare(o1.getCreationYear(), o2.getCreationYear());
        if (name != 0) return name;
        if (yearCreation != 0) return yearCreation;
        return o1.getIde().compareToIgnoreCase(o2.getIde());
    }
}
