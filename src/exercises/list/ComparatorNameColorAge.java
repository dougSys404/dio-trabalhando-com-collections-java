package exercises.list;

import java.util.Comparator;

public class ComparatorNameColorAge implements Comparator<Cat> {
    @Override
    public int compare(Cat g1, Cat g2) {
        int nome = g1.getName().compareToIgnoreCase(g2.getName());
        if (nome != 0) return nome;


        int color = g1.getColor().compareToIgnoreCase(g2.getColor());

        if (color != 0) return color;

        return Integer.compare(g1.getAge(), g2.getAge());
    }
}
