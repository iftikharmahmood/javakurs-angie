package no.nav.iftikhar.repetisjon.kapittel7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    public static final int ANTALL_LOTTO_TALL = 10;
    public static final int ANTALL_RADER= 10;
    public static final int MAX_TALL = 98;

    public static void main(String[] args){

       int[] tall = tallGenerator();
        Arrays.sort(tall);
        utskriftLottoKupong(tall);

        int[][] tabell = genererTabell();
        utskriftTabell(tabell);
    }


    public static int[] tallGenerator(){

        int[] tall = new int[ANTALL_LOTTO_TALL];
        Random random = new Random();

        for (int i = 0; i < ANTALL_LOTTO_TALL; i++){
            int tilfeldigTall;
            do {
                tilfeldigTall = random.nextInt(MAX_TALL) + 1;
            } while (search(tall, tilfeldigTall));

            tall[i] = tilfeldigTall;
        }

        return tall;
    }

    /**
     * Does a sequential search on the array to find a value
     * @param tall er tabellen det skal søkes igjennom
     * @param sokeTall verdien det søkes etter
     * @return returverdi: sann hvis funnet, usann hvis ikke funnet
     */

    public static boolean search(int[] tall, int sokeTall){

         /*This is called an enhanced loop.
          It iterates through 'array' and
          each time assigns the current element to 'value'
         */
        for (int verdi : tall){

            if (verdi == sokeTall){
                return true;
            }
        }
         /*If we've reached this point, then the entire array was searched
          and the value was not found
         */
        return false;
    }


    public static boolean binaerSok(int[] tall, int sokeTall){
        Arrays.sort(tall);
        int index = Arrays.binarySearch(tall, sokeTall);
        if (index >= 0){
            return true;
        }
        else return false;
    }


    private static void utskriftLottoKupong(int tall[]) {
        for (int i = 0; i < ANTALL_LOTTO_TALL; i++){
            System.out.print(tall[i] + " | ");
        }
        System.out.println();
        System.out.println("********************************************************************************************");
        System.out.println();
    }

    public static int[][] genererTabell(){

        Random random = new Random();
        int[][] tabell = new int[ANTALL_LOTTO_TALL][ANTALL_RADER];

        for (int r = 0; r < ANTALL_RADER; r++) {

            for (int i = 0; i < ANTALL_LOTTO_TALL; i++) {
                tabell[r][i] = random.nextInt(MAX_TALL) + 1;
            }
        }

        return tabell;
    }

    private static void utskriftTabell(int[][] tabell) {
        for (int r= 0; r < ANTALL_RADER; r++){
            System.out.println(" Rad nr. " + r + ": ");
            for (int i = 0; i < ANTALL_LOTTO_TALL; i++) {
                System.out.print(tabell[r][i] + " | ");
            }
            System.out.println();
        }
    }
}
