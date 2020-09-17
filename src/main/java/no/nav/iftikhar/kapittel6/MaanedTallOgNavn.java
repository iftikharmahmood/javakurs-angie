package no.nav.iftikhar.kapittel6;

import java.util.Scanner;

/*
* Driverprogram for Maaned og metoder som kaller på metodene i Maaned
 */
public class MaanedTallOgNavn {


    public static void main(String args[]){
        System.out.println(Maaned.getMaaned(2));
        System.out.println(Maaned.getMaaned("Januar"));

        System.out.println("Tast inn navnet på en måned");
        Scanner scanner = new Scanner(System.in);
        String navn = scanner.next();
        System.out.println("Måned navnet du tastet inn tilsvarer: " + Maaned.getMaaned(navn));

        System.out.println(" Tast inn tallet på en måned ( Heltall mellom 1 og 12");
        int nr = scanner.nextInt();
        scanner.close();
        int feil;
        System.out.println("Måned navnet du tastet inn tilsvarer: " + Maaned.getMaaned(nr)+ " i tall.");
        feil = nr;
        if (feil == -1){
            System.out.println("Feil!, vennligst oppgi gyldig månedsnavn mellom januar og desember");
        }

    }


}
