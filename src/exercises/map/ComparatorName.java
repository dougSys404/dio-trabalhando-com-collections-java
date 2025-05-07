package exercises.map;

import java.util.Comparator;
import java.util.Map;

public class ComparatorName implements Comparator<Map.Entry<String, Book>> {


    @Override
    public int compare(Map.Entry<String, Book> livro1, Map.Entry<String, Book> livro2) {
        return livro1.getValue().getName().compareToIgnoreCase(livro2.getValue().getName());
    }
}
