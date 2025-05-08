package exercises.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);

Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/
public class SortingSetExample {

    public void getSortingSet(){
        System.out.println();
        System.out.println("Ordem aleatória");
        Set<Series> mySeries = new HashSet<>(){{
            add(new Series("got", "fantasia", 60));
            add(new Series("dark", "drama", 60));
            add(new Series("that '70s show", "comédia", 25));
        }};
        for (Series serie : mySeries) System.out.println(serie.getName()
                + " - " + serie.getGenre() + " - " + serie.getEpisodeLength());
        System.out.println("Para ordem aleatória, usamos o HashSet");

        System.out.println();
        System.out.println("Ordem inserção");
        Set<Series> mySeries1 = new LinkedHashSet<>(){{
            add(new Series("got", "fantasia", 60));
            add(new Series("dark", "drama", 60));
            add(new Series("that '70s show", "comédia", 25));
        }};
        for (Series serie : mySeries1) System.out.println(serie.getName()
                + " - " + serie.getGenre() + " - " + serie.getEpisodeLength());
        System.out.println("Para ordem de inserção, usamos o LinkedHasSet");

        System.out.println();
        System.out.println("Ordem natural (TempoEpisodio)");
        Set<Series> mySeries2 = new TreeSet<>(mySeries1);
        for (Series serie : mySeries2) System.out.println(serie.getName()
                + " - " + serie.getGenre() + " - " + serie.getEpisodeLength());
        System.out.println("Para ordem natural usamos o TreeSet, mas ele pede o comparable "
            + "implementado na classe Series");
        System.out.println("got e dark tem o mesmo tempo de epsódio, por isso dar não foi mostrado");
        System.out.println("Neste caso, uma lóigica de critério de desempate foi " +
                "colocado no método compare da classe Serie");

        System.out.println();
        System.out.println("Ordem Nome/Gênero/TempoEpisodio");
        Set<Series> mySeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        mySeries3.addAll(mySeries);
        for (Series serie : mySeries3) System.out.println(serie.getName()
                + " - " + serie.getGenre() + " - " + serie.getEpisodeLength());
        System.out.println("Comparator foi criado para verificar se:");
        System.out.println("Nomes são iguals, se sim");
        System.out.println("compara pelo genero, se sim");
        System.out.println("Compara pelo tempo de ep");
        System.out.println("Se tudo for igual, então é o mesmo objeto");

        System.out.println();
        System.out.println("Douglas fazendo......");

        System.out.println();
        System.out.println("--\tOrdem gênero\t--");
        Set<Series> mySeries4 = new TreeSet<>(new ComparatorGenero());
        mySeries4.addAll(mySeries);
        for (Series serie : mySeries4) System.out.println(serie.getName()
                + " - " + serie.getGenre() + " - " + serie.getEpisodeLength());

        System.out.println();
        System.out.println("--\tOrdem Tempo Episódio\t--");
        Set<Series> mySeries5 = new TreeSet<>(new ComparatorTempoEp());
        mySeries5.addAll(mySeries);
        for (Series serie : mySeries5) System.out.println(serie.getName()
                + " - " + serie.getGenre() + " - " + serie.getEpisodeLength());



    }
}
