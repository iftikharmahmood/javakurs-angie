package kapittel7Reloaded;

/*
 * Et program som skriver ut en tilfeldig tallrekke på 11 heltall, av en serie på 10 rader.
 */

import java.util.Arrays;
import java.util.Random;

public class LottoKupong {

    private static final int LENGDE = 6;
    private static final int MAX_LOTTO_TALL = 69;

    public static void main(String args[]) {

       // int[] tallRekke = genererTall();
       // Arrays.sort(tallRekke);

       // skrivUtLottoKupong(tallRekke);

        int[] kupongRekke = genererTall();
        Arrays.sort(kupongRekke);
        skrivUtTallRekke(kupongRekke);
    }

    public static int[] genererTall(){

        int[] tallRekke = new int[LENGDE];

        Random random = new Random();

        for (int i = 0; i < LENGDE; i++) {
            int tilfeldigTall;
            /*
            * Generere et tilfeldig tall, deretter søke etter om talle finnes fra før, hvis det finnes
            * generer et nytt tall.
             */
            do {
               tilfeldigTall = random.nextInt(MAX_LOTTO_TALL) + 1;
            } while(sok(tallRekke, tilfeldigTall));
// Tallet er unikt hvis det kummer ut hit, legges til i rekken av tilfeldige tall
            tallRekke[i] = tilfeldigTall;
        }
        return tallRekke;

    }

    /**
     * Gjør et sekvensielt søk i tabbelen
     * @param tabell Tabellen det skal søkes igjennom
     * @param sokEtterTallet  Verdien det skal søkes etter
     * @return Returnerer sann hvis funnet og usan hvis ikke funnet
     */
    public static boolean sok(int[] tabell, int sokEtterTallet ){
        // Enhansed loop
        for (int verdi : tabell){
            if (verdi == sokEtterTallet){
                return true;
            }
        }
        // hvis dette punktet er nådd, er hele tabellen søkt igjennom uten å finne sant resultatet
        return false;
    }

    public static boolean binerSok(int[] tabell, int sokEtterTallet){
        //For denne søkemetoden må tabellen sorteres først
        Arrays.sort(tabell);
        int index = Arrays.binarySearch(tabell, sokEtterTallet);
        if (index >=0){
            return true;
        }
        else return false;

    }
    public static void skrivUtTallRekke(int[] tallRekke){
         for (int i = 0; i < LENGDE; i++) {
            System.out.print(tallRekke[i] + " | ");
         }
    }

    private static void skrivUtLottoKupong(int[] kupongRekke) {
        for (int kupong = 0; kupong < 9; kupong++){
            int[] tallRekke = genererTall();
            Arrays.sort(tallRekke);
            System.out.println("Talrekke nr. : " + (kupong +1));
            skrivUtTallRekke(tallRekke);
            System.out.println();
        }
    }
}

