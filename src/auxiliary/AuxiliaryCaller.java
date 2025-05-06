package auxiliary;

import exercises.Ex01_ListExercise;
import exercises.Ex02_OrderingList;

import java.util.Scanner;

public class AuxiliaryCaller {

    Scanner sc = new Scanner(System.in);
    Ex01_ListExercise listExercise01 = new Ex01_ListExercise();
    Ex02_OrderingList listExercise02 = new Ex02_OrderingList();

    public void caller(){
        System.out.println("Choose: ");
        System.out.println("1 - ListExercise (1)");
        System.out.println("2 - ListExercise (2) - Ordering List");
        System.out.println("0 - Quit");
        System.out.print("Option: ");
        int option = sc.nextInt();

        switch (option){
            case 1: listExercise01.showListExercise();
            case 2: listExercise02.showOrderingList();
            case 0: System.out.println("Exiting program...");
            default:
                System.out.println("Invalid option!");
        }
    }
}
