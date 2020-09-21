package no.nav.iftikhar.repetisjon.kapittel1og2;
/**
 * Create a program that asks a user for a season of the year, then a whole number,
 * then an adjective. And use the input to complete the sentence below. Output the result.
 */
import java.util.Scanner;

public class MadLibs {

    public static void main (String arg[]){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Hvilken årstid er det nå? ");
        String aarsTid = scanner.next();

        System.out.println(" Tast inn et heltall ");
        int tall= scanner.nextInt();

        scanner.close();

        System.out.println(" På en vanlig "+aarsTid + "dag, som denne, drikker jeg minst "+ tall +" kopper kaffe.");
    }
}
