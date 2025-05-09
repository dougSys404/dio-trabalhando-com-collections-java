package exercises.stream;

import java.util.Comparator;
import java.util.Map;

public class ComparatorByNameContact implements Comparator<Map.Entry<Integer, Contact>> {
    @Override
    public int compare(Map.Entry<Integer, Contact> contact1, Map.Entry<Integer, Contact> contact2) {
        return contact1.getValue().getName().compareToIgnoreCase(contact2.getValue().getName());
    }
}
