package no.nav.iftikhar.kapittel7Madlibs;

/*
* The program output the String that represents the day of the week that corresponds to the number that the user input.
* For example, if the user inputs the number 1, your program should print “Monday”.
 */

import java.util.Scanner;

public class DayOfTheWeek {

    public static void main (String args[]) {

        // have the user input a number corresponding to some day of the week.
        // And assume that the week starts on Monday.

        System.out.println(" Tast inn et heltall mellom 1 og 7:  ");
        Scanner scanner = new Scanner(System.in);
        int dagNr = scanner.nextInt();

    //Make an array that holds its actual values of the days of the week

        String[] dag = new String[8];
        dag[1] = ("Mandag");
        dag[2] = ("Tirsdag");
        dag[3] = ("Onsdag");
        dag[4] = ("Torsdag");
        dag[5] = ("Fredag");
        dag[6] = ("Lørdag");
        dag[7] = ("Søndag");

        System.out.println(" Nummeret du tastet inn tilsvarer: " + dag[dagNr]);
    }
}
