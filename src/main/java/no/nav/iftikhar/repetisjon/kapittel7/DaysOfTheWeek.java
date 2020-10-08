/*
 * Make an array that holds its actual values of the days of the week,
 * and then have the user input a number corresponding to some day of the week.
 * Assume that the week starts on Monday.
 * Your program should output the String that represents the day of the week that corresponds to the number that the user input.
 * For example, if the user inputs the number 1, your program should print “Monday”.
 *
 *
 * Dette er MAD LIBs oppgave fra kapittel 7 i Angie kurset
 */



package no.nav.iftikhar.repetisjon.kapittel7;

import java.util.Arrays;
import java.util.Scanner;

public class DaysOfTheWeek {

    private static Scanner scanner = new Scanner(System.in);
    private static String[] daysOfTheWeek = new String[]{"Mandag", "Tirsdag", "Onsdag", "Torsdag", "Fredag", "Lørdag", "Søndag"};

    public static void main(String[] args){

        System.out.println(" tast et heltall mellom 1 og 7 ");
        int tall = scanner.nextInt();
        scanner.close();
        System.out.println();

        System.out.println(" Tallet du tastet tilsvarer : " + finnDag(tall) + " som er den " + tall + " dagen i uka");
        System.out.println();

        System.out.println(" Sum antall dager er " +  sum() +" i uka");
        System.out.println();

        uka();

        sort();

    }

    private static String finnDag( int tall) {
        tall = tall - 1;
        String dag = daysOfTheWeek[tall];
        return dag;
    }

    private static int sum() {
        return (daysOfTheWeek.length);
    }

    private static void uka(){
        System.out.println();
        System.out.println(" Hele uka ser slik ut : ");
        for (int teller = 0; teller < daysOfTheWeek.length; teller++){
            System.out.println(daysOfTheWeek[teller]);
        }

    }

    private static void sort() {
        Arrays.sort(daysOfTheWeek);
        System.out.println();
        System.out.println(" Hele uken alfabetisk sortert blir slik : ");
        for (int teller = 0; teller < daysOfTheWeek.length; teller++){
            System.out.println(daysOfTheWeek[teller]);
        }
    }

}
