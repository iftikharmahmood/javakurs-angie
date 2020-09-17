package kapittel4;
import java.util.Scanner;

/*
*FOR LOOP
* lag et program som kan lese inn et gitt antall varer og summere prisen.
 */

public class Kasserer {
    public static void main(String args[]){

        //hent inn antall varer som skal leses inn
        System.out.println(" Dette er en selvbetjent varescanner, Tast inn antall varer som skal scannes inn: ");
        Scanner scanner = new Scanner(System.in);
        int antall = scanner.nextInt();

        double totalSum = 0;

        //lag løkke for å iterere gjennom alle varene og akkumulere prisen

        for (int i=1; i <= antall; i++){
            System.out.println("tast inn prisen på vare nr: " + i);
            double pris = scanner.nextDouble();

            totalSum = totalSum + pris;
        }

        //Svar ut.

        scanner.close();
        System.out.println(" Totalsummen på varene blir: " + totalSum);
        System.out.println();
        System.out.println(" Antall varer som er scannet inn er: " + antall);

    }
}