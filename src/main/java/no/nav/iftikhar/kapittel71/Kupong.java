package no.nav.iftikhar.kapittel71;

import java.util.Arrays;
import java.util.Random;

public class Kupong {
// Fields
    // private static final int LENGDE = 6;
    //  private static final int MAX_TALL_MENGDE = 69;
    // private static final int ANTALL_REKKER = 10;


    public static void main(String[] args) {


        // soter generert tall



        for (int lottRekke = 0; lottRekke < 10; lottRekke++) {
            System.out.println(" Lotto rekke nr. : " + (lottRekke + 1));

            // hent generert tall
            genererTall();


            //for (int i = 0; i < LENGDE; i++) {
            //  tallRekke[i] = random.nextInt(MAX_TALL_MENGDE) + 1;
            //    System.out.print(tallRekke[i] + " | ");
            //}
            System.out.println();
            //System.out.println();
        }

    }

    //Generere tall
    public static void genererTall() {
        Random random = new Random();
        int[] generertTall = new int[6];
        for (int i = 0; i < 6; i++) {
            generertTall[i] = random.nextInt(69) + 1;
            System.out.print("[ " + generertTall + " ] ");
        }
    }

    //sort
    public static boolean binerSok(int[] tallRekke, int sokEtterTallet) {
        //For denne søkemetoden må tabellen sorteres først
        Arrays.sort(tallRekke);
        int index = Arrays.binarySearch(tallRekke, sokEtterTallet);
        return index >= 0;
    }
}

