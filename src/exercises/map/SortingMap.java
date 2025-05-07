package exercises.map;
/*Dadas as seguintes informações sobre meus livros favoritos e seus autores
geie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);
Cavalcante, Today • New Class
Autor = Hawking, Stephen - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah- Livro = 21 Lições Para o Século 21, páqinas: 432
*/

import java.util.*;

public class SortingMap {


    public void showSorting(){


        System.out.println("Ordem aleatória: ");

        Map<String, Book> livros = new HashMap<>(){{
            put("Hawking, Stephen", new Book("Uma Breve História do Tempo.", 256));
            put("Duhigg, Charles", new Book("O Poder do Hábito,", 408));
            put("Harari, Yuval Noah", new Book("21 Lições Para o Século 21", 432));
        }};
        for (Map.Entry<String, Book> livro : livros.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getName());
        }

        System.out.println();
        System.out.println("Ordem inserção: ");
        Map<String, Book> livros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Book("Uma Breve História do Tempo.", 256));
            put("Duhigg, Charles", new Book("O Poder do Hábito,", 408));
            put("Harari, Yuval Noah", new Book("21 Lições Para o Século 21", 432));
        }};
        for (Map.Entry<String, Book> livro : livros1.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getName());
        }

        System.out.println();
        System.out.println("Ordem alfabética autores: ");
        Map<String, Book> livros2 = new TreeMap<>(livros1);
        for (Map.Entry<String, Book> livro : livros2.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getName());
        }

        System.out.println();
        System.out.println("Ordem alfabética nome dos livros: ");
        Set<Map.Entry<String, Book>> livros3 = new TreeSet<>(new ComparatorName());
        livros3.addAll(livros.entrySet());
        for (Map.Entry<String, Book> livro : livros3){
            System.out.println(livro.getKey() + " - " + livro.getValue().getName());
        }


        //System.out.println();
        //System.out.println("Ordem número de página: ");
    }
}
