package kapittel10.Madlibs;

/**
 *1. Opprette en klasse Frukt
 * Klassen skal inneholde variablene Kalorier og metode kalt makeJuice()
 * metoden skal skrive ut innholdsfortegnelsen
 * ***********************************************************************************
 * 2. Lag 2 underklasser av frukt med noen frukter
 * lag spesifike metoder i klassene relatert den enkelte frukten
 * Sett inn kaloriverdiene i konstruktører i subklassene
 * Override makeJuice() metoden til å skrive ut spesifike typer juice som skal lages
 * **************************************************************************************
 * 3. Lag en Markes klasse som tester polymorfismen med flere variasjoner av disse objektene
 */

public class Banan extends Frukt {

    public static void skrellBanan(){
        System.out.println(" Bananene skrellse ");
        System.out.println("Bananene er tilsatt vann før pressing ");
        System.out.println("Bananene er klare til pressing ");
    }

    public static void pressFrukten(){
        System.out.println(" Produksjonsstatus: Saften presses ut");
        System.out.print(".");
        System.out.println(" Produksjonsstatus: Saften tappes på flaske");
        Frukt.setKalorier(3000);
        System.out.println("Det er : " + Frukt.getKalorier() + " K kalorier i denne saften per porsjon på 220 mml.");
    }

}
