package exercises;

import java.util.Comparator;

public class ComparatorColor implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getColor().compareToIgnoreCase(o2.getColor());
    }
}
