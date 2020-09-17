package no.nav.iftikhar.kapittel8;

public class TekstBehandler {

   private static String tekst = ("Identhåndtering i NAV går automatisk, ved at Identadministrator legger inn bestilling i Identrutinen i Remedy. Via en AD-integrasjon, \\n\" +\n" +
           "         \" som legger til, endrer eller sletter gruppetilganger, går dette så videre til Jira.\n");
   private static String linje = ("DetteErEnTekstSomIkkeInneHolderMellomRom,MenDetSkalProgrammetTaSegAv.");
  private static String frukt = ("avacado");

    public static void main(String args[]){

        avocado(frukt);
        telleOrd(tekst);
        skrivBaklengs(tekst);
        leggTilMellomrom(linje);
    }

    private static void avocado(String frukt) {
        var gronnsak = frukt.split("a");
        System.out.println(frukt.length());
        System.out.println("**************************************************");
        int lengde = frukt.length();
        for (int i = 0; i < frukt.length(); i++) {
            System.out.println(gronnsak[i]);
        }
    }


    /**
     * Splitter en streng inn i en tabell ved å "tokenizing" den.
     * Teller alle ord og skriver ut alle ordene
     * @param tekst Fulle strengen som skal deles opp
     */
    public static void telleOrd(String tekst){
        var ord = tekst.split(" ");
        int summenAvOrd = ord.length;

        String melding = String.format(" Teksten inneholder %d ord", summenAvOrd);
        System.out.println(melding);
        for (int i = 0; i < summenAvOrd; i++){
            System.out.println(ord[i]);
        }
    }

    /**
     * Skriver en tekststreng baklengs
     * @param tekst er strengen som tas med inn som parameter og reverseres
     */
    public static void skrivBaklengs(String tekst){
        for (int i = TekstBehandler.tekst.length() -1; i >=0; i--){
            System.out.print(tekst.charAt(i));
        }
    }

    /**
     * Legger til mellomrom i en tekstreng
     * Bruker stor bokstav til å skille ord fra hverandre
     * @param linje  tekst uten mellomrom
     */
    private static void leggTilMellomrom(String linje) {
        var endretTekst = new StringBuilder(linje);
        for (int i = 0; i < endretTekst.length(); i++){
            if (i !=0 && Character.isUpperCase(endretTekst.charAt(i))){
                endretTekst.insert(i, " ");
                i++;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(endretTekst);
    }
}
