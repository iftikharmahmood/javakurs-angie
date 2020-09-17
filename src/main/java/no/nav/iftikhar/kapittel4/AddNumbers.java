package no.nav.iftikhar.kapittel4;
import java.util.Scanner;

/*
*DO WHILE LOOP  :
* LAG ET PROGRAM SOMLAR BRUKEREN TASTE INN TO TALL, DERETTER SUMMERER TALLENE.
* BRUKEREN KAN HOLDE PÅ MED DETTE INNTIL DET SIGNALISERES AT DET ER NOK.
 */

public class AddNumbers {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        boolean repeter;
        do {
           System.out.println(" Tast inn det første tallet");
           double tall1 = scanner.nextDouble();
            System.out.println(" Tast inn det andre tallet");
            double tall2 = scanner.nextDouble();
            double sum = tall1+tall2;
            System.out.println(" Summen av tallene er: " +sum);

            System.out.println("Tast true, hvis du vil prøve igjen eller tast false for å avslutte.");
            repeter = scanner.nextBoolean();

        } while (repeter);

        scanner.close();

    }

}

