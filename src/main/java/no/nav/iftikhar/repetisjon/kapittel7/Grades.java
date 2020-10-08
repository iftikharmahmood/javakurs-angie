package no.nav.iftikhar.repetisjon.kapittel7;

import java.util.Arrays;
import java.util.Scanner;

public class Grades {

    private static int grades[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println(" Hvor mange karakterer skal legges inn i tabellen ? ");
        grades = new int[scanner.nextInt()];

        grades();

        System.out.println(" Sum karakterer: " +calculateSum());

        calculateAverage();

        System.out.println(" Snittskarakter " + String.format("%.2f", calculateAverage()));
        System.out.println(" Høyeste karakter: " +getHighest());
        System.out.println(" Laveste karakter: " +getLowest());
    }

    private static double calculateAverage() {
        return calculateSum() / grades.length;
    }


    private static void grades() {
        for (int i = 0; i < grades.length; i++){
            System.out.println("Legg inn karakter nr. :" + (i+1));
            grades[i] = scanner.nextInt();
        }
    }

    private static int calculateSum() {
        int sum = 0;
        for (int grade : grades){
            sum = sum + grade;
        }
        return sum;
    }

    public static int getHighest(){
        int highest = grades[0];
        for (int grade : grades){
            if (grade > highest){
                highest = grade;
            }
        }
        return highest;
    }

    public static int getLowest(){
        int lowest = grades[0];
        for (int grade : grades){
            if (grade < lowest){
                lowest = grade;
            }
        }
        return lowest;
    }


}
