package kapittel4;
/*
*WHILE LOOP
* hver butikkansatt tjener 150 kr pr time. Lag et program som tillater ansatte å taste inn antall arbeidstimer utført pr uke.
* Ikke tillat overtid.
 */

import java.util.Scanner;

public class GrossPayInputValdidation {

    public static void main(String args[]){

        //variabel deklarasjon
        int timePris = 150;
        int maksTimer = 40;


        //innhente ukjente variabler
        System.out.println(" Hvor mange timer har du jobbet denne uka?");
        Scanner scanner = new Scanner(System.in);
        double utførteArbeidsTimer = scanner.nextDouble();

        // Validering av inn data
        while (utførteArbeidsTimer > maksTimer || utførteArbeidsTimer < 1){
            System.out.println("Feil data inntastet, dine arbeidstimer kan kun være et tall fra 1 til 40. Prøv igjen");
            utførteArbeidsTimer = scanner.nextDouble();
        }

        scanner.close();

        // beregn lønn
        double lonn = timePris * utførteArbeidsTimer;
        System.out.println("Lønn for uken blir: " + lonn);

    }
}
