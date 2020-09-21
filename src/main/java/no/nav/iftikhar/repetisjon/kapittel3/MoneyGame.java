package no.nav.iftikhar.repetisjon.kapittel3;

import java.util.Scanner;

/**
 * You'll ask player for ammount of ører in coins that make up 1 krone
 * What your program is going to do is count up the value of all of the change that they answered.
 * If it's exactly one krone then they win the game.
 * If it's more than one krone, then you need to tell them that it's more than one dollar
 * and how much they went over.
 * If it's less than one krone, tell them how much they went under.
 */

public class MoneyGame {

    public static void main(String arg[]){

        System.out.println(" ********* *********  SPILL   ********* ********* ");
        System.out.println(" Målet med spillet er å oppnå en sum av 1 krone ved å summere 1, 2, 5, 10, 25 og 50 ører");
        System.out.println(" Når du målet har du vunnet. Hvis summen er over eller under 1 krone har du tapt");
        System.out.println(" ********* *********  SPILL   ********* ********* ");
        System.out.println(" Tast inn antall 1 øringer");

        Scanner scanner = new Scanner(System.in);
        int tall= scanner.nextInt();
        int beløp = tall;
        System.out.println(" Tast inn antall 2 øringer");
        tall = scanner.nextInt();
        beløp = beløp  + (tall * 2);
        System.out.println(" Tast inn antall 5 øringer");
        tall = scanner.nextInt();
        beløp = beløp + (tall * 5);
        System.out.println(" Tast inn antall 10 øringer");
        tall = scanner.nextInt();
        beløp = beløp + (tall * 10 );
        System.out.println(" Tast inn antall 25 øringer");
        tall = scanner.nextInt();
        beløp = beløp + (tall * 25);
        System.out.println(" Tast inn antall 50 øringer");
        tall = scanner.nextInt();
        beløp = beløp + (tall * 50);

        if (beløp == 100){
            System.out.println(" *********   GRATULERER DU VANT SPILLET   ********* ");
        } else if (beløp > 100){
            System.out.println(" Spille er tapt, du gikk " + (beløp - 100) + " ører over 1 krone");
        } else {
            System.out.println(" Spille er tapt,  du er  " + (100 - beløp) + " under 1 krone");
        }

    }

}
