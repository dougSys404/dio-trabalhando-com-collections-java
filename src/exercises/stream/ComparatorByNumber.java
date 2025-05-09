package exercises.stream;

import java.util.Comparator;
import java.util.Map;

public class ComparatorByNumber implements Comparator<Map.Entry<Integer, Contact>> {
    @Override
    public int compare(Map.Entry<Integer, Contact> contact1, Map.Entry<Integer, Contact> contact2) {
        return Integer.compare(contact1.getValue().getNumber(), contact2.getValue().getNumber());
    }
}
