package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
*Faça um programa que receba a temperatura meédia dos 6 primeiros meses do ano e armazena-as
* em uma lista. Após isso, calcule a média semestral das temperaturas e mostre todas
* as temperaturas acima desta média, e em que mês que elas ocorreram, mostrar o mês por
* extenso: 1 - Janeiro, 2 Fevereiro e etc).
 */

public class Ex03_CalculateWeather {

    private String month;
    private double weather;
    private String[] months = {
            "1 - January", "2 - February", "3 - March", "4 - April", "5 - May", "6 - June"
    };

    public Ex03_CalculateWeather(){}

    public Ex03_CalculateWeather(String month, double weather){
        this.month = month;
        this.weather = weather;
    }

    List<Ex03_CalculateWeather> weathers = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void calculateWeather(){
       for (String month : months){
           System.out.print("Enter " + month + "'s weather: ");
           double weather = sc.nextDouble();

           Ex03_CalculateWeather entry = new Ex03_CalculateWeather(month, weather);

           weathers.add(entry);
       }

        System.out.println();
        System.out.println("Data: ");
        System.out.println(weathers.toString());

        System.out.println();
        System.out.print("Average temperature: " + averageWeather());
        System.out.println();
        System.out.println();
        compareWeather();
    }

    public double averageWeather(){

        double sum = 0.0;

        for (Ex03_CalculateWeather weatherEntry : weathers){
            sum += weatherEntry.weather;
        }

        return sum / weathers.size();
    }

    public void compareWeather(){

        double averageWeather = averageWeather();

        System.out.println("Temperatures above average " + averageWeather);

        for (Ex03_CalculateWeather weatherEntry : weathers){
            if (weatherEntry.weather > averageWeather){
                System.out.println(weatherEntry.month + " - " + weatherEntry.weather);
            }
        }
    }

    @Override
    public String toString() {
        return "{" +
                "month='" + month + '\'' +
                ", weather=" + weather +
                '}';
    }
}
