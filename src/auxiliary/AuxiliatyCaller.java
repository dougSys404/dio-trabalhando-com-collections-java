package auxiliary;

import exercises.ListExercise;

import java.util.Scanner;

public class AuxiliatyCaller {

    Scanner sc = new Scanner(System.in);
    ListExercise listExercise = new ListExercise();

    public void caller(){
        System.out.println("Choose: ");
        System.out.println("1 - ListExercise (1)");
        System.out.println("0 - Quit");
        System.out.print("Option: ");
        int option = sc.nextInt();

        switch (option){
            case 1: listExercise.showListExercise();
        }
    }
}
