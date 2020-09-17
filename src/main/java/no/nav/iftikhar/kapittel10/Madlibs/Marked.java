package kapittel10.Madlibs;

/**
 *1. Opprette en klasse Frukt
 * Klassen skal inneholde variablene Kalorier og metode kalt makeJuice()
 * metoden skal skrive ut innholdsfortegnelsen
 * 2. Lag 2 underklasser av frukt med noen frukter
 * lag spesifike metoder i klassene relatert den enkelte frukten
 * Sett inn kaloriverdiene i konstruktører i subklassene
 * Override makeJuice() metoden til å skrive ut spesifike typer juice som skal lages
 * **************************************************************************************
 * 3. Lag en Markes klasse som tester polymorfismen med flere variasjoner av disse objektene
 ************************************************************************************
 */


public class Marked {

    public static void main (String args[]){
        //Standar juice Eple
        System.out.println();
        Eple.fjernFro();
        System.out.println();
        Eple.pressFrukten();
        System.out.println();
        System.out.println(Eple.makeJuice("eple"));
        System.out.println();
        System.out.println(Frukt.makeJuice("eple"));

        //Standard Juice Banan
        System.out.println();
        Banan.skrellBanan();
        System.out.println();
        Banan.pressFrukten();
        System.out.println();
        System.out.println(Frukt.makeJuice("banan"));
        System.out.println();

        //Standard Appelsin juice
        System.out.println();
        Appelsin.skrellAppelsiner();
        System.out.println();
        Appelsin.pressFrukten();
        System.out.println();
        System.out.println(Appelsin.makeJuice("appelsin"));
        System.out.println();

        //Standard Sitron juice
        System.out.println();
        SitronLime.skrellSitrus();
        System.out.println();
        SitronLime.pressFrukten();
        System.out.println();
        System.out.println(SitronLime.makeJuice("sitron"));
        System.out.println();

// kalle makeJuice()
        System.out.println(Frukt.getKalorier());
        System.out.println();
        System.out.println(Appelsin.makeJuice("banan"));
        System.out.println();
        System.out.println(Eple.makeJuice("sitron"));
        System.out.println();
        System.out.println();SitronLime.makeJuice("appelsin");
        System.out.println();
        SitronLime.pressFrukten();
        System.out.println();
        System.out.println(Banan.makeJuice("sitron"));

    }
}
