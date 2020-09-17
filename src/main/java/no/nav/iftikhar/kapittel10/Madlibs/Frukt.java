package kapittel10.Madlibs;

/**
 *1. Opprette en klasse Frukt
 * Klassen skal inneholde variablene Kalorier og metode kalt makeJuice()
 * metoden skal skrive ut innholdsfortegnelsen
 * **************************************************************************
 * 2. Lag 2 underklasser av frukt med noen frukter
 * lag spesifike metoder i klassene relatert den enkelte frukten
 * Sett inn kaloriverdiene i konstruktører i subklassene
 * Override makeJuice() metoden til å skrive ut spesifike typer juice som skal lages
 * 3. Lag en Markes klasse som tester polymorfismen med flere variasjoner av disse objektene
 */


public class Frukt {

    public static double kalorier;

    public static double getKalorier() {
        return kalorier;
    }

    public static void setKalorier(double kalorier) {
        Frukt.kalorier = kalorier;
    }

    public static String makeJuice(String frukt){
        String melding;
        switch (frukt){
            case "eple":
                melding = "Detter er eplejuice og inneholder eplejuice";
                return melding;
            case "banan":
                melding = "Dette er banan juice og inneholder banan";
                return melding;
            case "appelsin":
                melding = " Detter er appelsing juice og inneholder appelsin";
            return melding;
            case "sitron":
                melding = " Detter er sitron og lime juice og inneholder sitron og lime";
                return melding;
            default: return "****************** Nei denslags lages ikke saft av, Fyyyy, gå og vask munnen ***********";
        }
    }
}
