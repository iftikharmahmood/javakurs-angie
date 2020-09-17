package no.nav.iftikhar.kapittel7;

import java.util.Random;

public class LottoKupong {

    public static void main(String args[]){

        int[] lottoRekke = new int[6];
        Random random = new Random();

        for (int i=0; i < 6; i++){
            lottoRekke [i] = random.nextInt(69)+1;
        }
        for (int i = 0; i < 6; i++){
            System.out.print(lottoRekke [i] + " | ");
        }
    }
}
