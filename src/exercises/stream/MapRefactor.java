package exercises.stream;

import java.util.*;
import java.util.function.Function;

/*Dadas os sequintes informações
de id e contato, ense um gicsonarze e
ordene este dicionário exibindo (Nome id - Nome contato)
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contate = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/
public class MapRefactor {

    public void showRefactor(){
        System.out.println();
        System.out.println("--\tOrdem aleatória\t--");
        Map<Integer, Contact> contactBook = new HashMap<>() {{
            put(1, new Contact("Simba", 5555));
            put(2, new Contact("Maria", 1111));
            put(3, new Contact("John", 2222));

        }};
        System.out.println(contactBook.toString());

        System.out.println();
        System.out.println("--\tOrdem Inserção\t--");
        Map<Integer, Contact> agenda1 = new LinkedHashMap<>() {{
            put(1, new Contact("Simba", 5555));
            put(4, new Contact("Cami", 1111));
            put(3, new Contact("Jon", 2222));
        }};
        System.out.println(agenda1);
        for (Map.Entry<Integer, Contact> entry: agenda1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getName());
        }

        System.out.println();
        System.out.println("--\tOrdem id\t--");
        Map<Integer, Contact> agenda2 = new TreeMap<>(contactBook);
        System.out.println(agenda2);
        for (Map.Entry<Integer, Contact> entry: agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getName());
        }

        System.out.println();
        System.out.println("--\tOrdem número telefone\t--");
        //precisamos organizar os valores. Logo:

        // usando lambida
        Set<Map.Entry<Integer, Contact>> set = new TreeSet<>(Comparator.comparing(
                contactEntry -> contactEntry.getValue().getNumber()));



        // usando classe anonima
        /*Set<Map.Entry<Integer, Contact>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contact>>() {
            @Override
            public int compare(Map.Entry<Integer, Contact> contactEntry1, Map.Entry<Integer, Contact> contactEntry2) {
                return Integer.compare(contactEntry1.getValue().getNumber(), contactEntry2.getValue().getNumber());
            }
        });*/

        /*
        // usando função anonima
        Set<Map.Entry<Integer, Contact>> set = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<Integer, Contact>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<Integer, Contact> contactEntry) {
                        return contactEntry.getValue().getNumber();
                    }
                }));*/

        set.addAll(contactBook.entrySet());
        for (Map.Entry<Integer, Contact> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumber() +
                    ": " +entry.getValue().getName());
        }

        System.out.println();
        System.out.println("--\tOrdem nome contato\t--");
        //precisamos organizar os valores. Logo:

        //usando lambda
        Set<Map.Entry<Integer, Contact>> set1 = new TreeSet<>(Comparator.comparing(
                contact -> contact.getValue().getName()
        ));

        //Set<Map.Entry<Integer, Contact>> set1 = new TreeSet<>(new ComparatorByNameContact());
        set1.addAll(contactBook.entrySet());
        for (Map.Entry<Integer, Contact> entry: set1) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getName());
        }
    }

}
