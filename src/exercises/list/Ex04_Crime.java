package exercises.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex04_Crime {

    private String question;
    private String response;


    List<Ex04_Crime> crimes = new ArrayList<>();

    public Ex04_Crime(){}

    public Ex04_Crime(String question, String response){
        this.question = question;
        this.response = response;
    }

    public void investigate(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Iniciando a investigação...");
        System.out.println();
        for (String question : getQuestions()){
            System.out.print(question + " (S/N): ");
            String response = sc.next().trim().toUpperCase();

            crimes.add(new Ex04_Crime(question, response));

        }

        System.out.println();
        System.out.println("Compilando as informações.....");
        System.out.println("Resultado: " + classifySuspect());
    }

    public String[] getQuestions(){
        return new String[] {
                "1 - Telefonou para a vítima?",
                "2 - Esteve no local do crime?",
                "3 - Morava perto da vítima?",
                "4 - Devia para a vítima?",
                "5 - Já trabalhou para a vítima?"
        };
    }

    private String classifySuspect(){
        int positiveResponse = 0;
        for (Ex04_Crime reponse : crimes){
            if (reponse.response.equals("S")){
                positiveResponse++;
            }
        }

        return switch (positiveResponse){
            case 2 -> "Supeito";
            case 3, 4 -> "Cúmplice";
            case 5 -> "Assassíno";
            default -> "Inocente";
        };
    }
}
