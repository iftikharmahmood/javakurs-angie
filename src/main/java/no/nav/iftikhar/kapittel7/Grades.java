package no.nav.iftikhar.kapittel7;

import java.util.Scanner;

/*
 * Create a program that allows a user to enter any
 * number of grades and provides them with their
 * average score, as well as the highest and lowest scores.
 */

public class Grades {

    private static int karakterer[];
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String args[]) {

        System.out.println("Hvor mange karakterer vil du taste inn ? ");
        karakterer = new int[scanner.nextInt()];

        getKarakteter();

        System.out.println("Gjennomsnittelig karakter: " + String.format("%.2f", gjennomsnitt()));
        System.out.println("Høyeste karakter: " + getHoyeste());
        System.out.println("Laveste karakter: " + getLaveste());


    }

    private static void getKarakteter() {

        for (int i = 0; i < karakterer.length; i++) {
            karakterer[i] = scanner.nextInt();
        }
    }
    public static int summer(){
        int sum = 0;
        for (int karakter : karakterer){
            sum = sum + karakter;
        }
        return sum;
    }
    public static double gjennomsnitt(){
        return summer()/ karakterer.length;
    }
    public static int getHoyeste(){
        int hoyest = karakterer[0];
        for (int karakter: karakterer){
            if (karakter > hoyest){
                hoyest = karakter;
            }
        }
        return hoyest;
    }
    public static int getLaveste(){
        int lavest = karakterer[0];
        for (int karakter : karakterer){
            if (karakter < lavest){
                lavest = karakter;
            }
        }
        return lavest;
    }
}
