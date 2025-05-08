package exercises.set;

import java.util.*;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/
public class Exercise02 {

    public void showFavoriteLanguages(){
        System.out.println("Mostrando a lista criada com HashSet");
        Set<FavoriteLanguage> myFavoriteLanguage = new HashSet<>();
        myFavoriteLanguage.add(new FavoriteLanguage("Python", 1991, "Pycharm"));
        myFavoriteLanguage.add(new FavoriteLanguage("JavaScript", 1995, "IntelliJ"));
        myFavoriteLanguage.add(new FavoriteLanguage("Java", 1991, "Visual Studio Code"));
        System.out.println(myFavoriteLanguage.toString());

        System.out.println();
        System.out.println("--------\tOrdem de Inserção\t--------");
        Set<FavoriteLanguage> myFavoriteLanguage1 = new LinkedHashSet<>(
                Arrays.asList(
                        new FavoriteLanguage("Python", 1991, "Pycharm"),
                        new FavoriteLanguage("JavaScript", 1995, "IntelliJ"),
                        new FavoriteLanguage("Java", 1991, "Visual Studio Code")
                )
        );
        for (FavoriteLanguage language : myFavoriteLanguage1) System.out.println(language.toString());

        System.out.println();
        System.out.println("--------\tOrdem Natural: Nome\t--------");
        Set<FavoriteLanguage> myFavoriteLanguage2 = new TreeSet<>(myFavoriteLanguage);
        for (FavoriteLanguage language : myFavoriteLanguage2) System.out.println(language.toString());

        System.out.println();
        System.out.println("--------\tOrdem IDE\t--------");
        Set<FavoriteLanguage> myFavoriteLanguage3 = new TreeSet<FavoriteLanguage>(new ComparatorIde());
        myFavoriteLanguage3.addAll(myFavoriteLanguage);
        for (FavoriteLanguage language : myFavoriteLanguage3) System.out.println(language.toString());

        System.out.println();
        System.out.println("--------\tOrdem Ano de Criacao e Nome\t--------");
        Set<FavoriteLanguage> minhasLinguagensFavoritas4 = new TreeSet<FavoriteLanguage>(new ComparatorYearCreationName());
        minhasLinguagensFavoritas4.addAll(myFavoriteLanguage);
        for (FavoriteLanguage language : minhasLinguagensFavoritas4) System.out.println(language.toString());

        System.out.println();
        System.out.println("--------\tOrdem Nome - Ano de Criacao - IDE\t--------");
        Set<FavoriteLanguage> minhasLinguagensFavoritas5 = new TreeSet<FavoriteLanguage>(new ComparatorNameYearCreationIde());
        minhasLinguagensFavoritas5.addAll(myFavoriteLanguage3);
        for (FavoriteLanguage language : minhasLinguagensFavoritas5) System.out.println(language.toString());
    }
}
