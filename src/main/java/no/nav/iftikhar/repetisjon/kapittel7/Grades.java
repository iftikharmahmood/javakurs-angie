package no.nav.iftikhar.repetisjon.kapittel7;

import java.util.Scanner;

public class Grades {

    private int points[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        Grades karakterer = new Grades();


        System.out.println(" Hvor mange karakterer skal legges inn i tabellen ? ");
        karakterer.points = new int[scanner.nextInt()];

        karakterer.grades();

        System.out.println(" Sum karakterer: " +karakterer.calculateSum());

        karakterer.calculateAverage();

        System.out.println(" Snittskarakter " + String.format("%.2f", karakterer.calculateAverage()));
        System.out.println(" Høyeste karakter: " +karakterer.getHighest());
        System.out.println(" Laveste karakter: " +karakterer.getLowest());
    }

    public double calculateAverage() {

        return calculateSum() / points.length;
    }


    public void grades() {
        for (int i = 0; i < points.length; i++){
            System.out.println("Legg inn karakter nr. :" + (i+1));
            points[i] = scanner.nextInt();
        }
    }

    public int calculateSum() {
        int sum = 0;
        for (int grade : points){
            sum = sum + grade;
        }
        return sum;
    }

    public int getHighest(){
        int highest = points[0];
        for (int grade : points){
            if (grade > highest){
                highest = grade;
            }
        }
        return highest;
    }

    public int getLowest(){
        int lowest = points[0];
        for (int grade : points){
            if (grade < lowest){
                lowest = grade;
            }
        }
        return lowest;
    }
}
