package auxiliary;

import exercises.list.Ex01_ListExercise;
import exercises.list.Ex02_OrderingList;
import exercises.list.Ex03_CalculateWeather;
import exercises.list.Ex04_Crime;
import exercises.map.CarConsumption;
import exercises.map.CollectionPopulation;
import exercises.map.DesafioDado;
import exercises.map.SortingMap;


import java.util.Scanner;

public class AuxiliaryCaller {

    Scanner sc = new Scanner(System.in);
    Ex01_ListExercise listExercise01 = new Ex01_ListExercise();
    Ex02_OrderingList listExercise02 = new Ex02_OrderingList();
    Ex03_CalculateWeather listExercise03 = new Ex03_CalculateWeather();
    Ex04_Crime listExercise04 = new Ex04_Crime();
    CarConsumption carConsumption = new CarConsumption();
    SortingMap sortingMap = new SortingMap();
    CollectionPopulation collectionPopulation = new CollectionPopulation();
    DesafioDado desafioDado = new DesafioDado();

    public void caller(){
        System.out.println("Choose: ");
        System.out.println("1 - List Exercises");
        System.out.println("2 - Map Exercises");
        System.out.println("3 - Book Map Exercise");
        System.out.println("0 - Quit");
        System.out.println();
        System.out.print("Option: ");
        int option = sc.nextInt();

        switch (option){
            case 1: listCaller();
            case 2: mapCaller();
            case 3: sortingMap.showSorting();
        }
    }

    public void listCaller(){
        System.out.println();
        System.out.println("1 - ListExercise (1)");
        System.out.println("2 - ListExercise (2) - Ordering List");
        System.out.println("3 - ListExercise (3) - Calculate weather");
        System.out.println("4 - ListExercise (4) - Investigate crime");
        System.out.println("0 - Quit");
        System.out.print("Option: ");
        int option = sc.nextInt();

        switch (option){
            case 1 -> listExercise01.showListExercise();
            case 2 -> listExercise02.showOrderingList();
            case 3 -> listExercise03.calculateWeather();
            case 4 -> listExercise04.investigate();
            case 0 -> System.out.println("Exiting program...");
            default -> System.out.println("Invalid option!");
        }
    }

    public void mapCaller(){
        System.out.println();
        System.out.println("Choose:");
        System.out.println("1 - Car consumption");
        System.out.println("2 - Book Map Exercise");
        System.out.println("3 - State Population Exercise");
        System.out.println("4 - Block Toy Exercise");
        System.out.println("0 - Quit");
        System.out.println();
        System.out.print("Option: ");
        int option = sc.nextInt();

        switch (option){
            case 1 -> carConsumption.getConsumption();
            case 2 -> sortingMap.showSorting();
            case 3 -> collectionPopulation.getPopulation();
            case 4 -> desafioDado.desafioDado();
            default -> System.out.println("Invalid Option!");
        }

    }
}
