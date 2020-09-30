/**
 * input the plan fee and the number of overage minutes. And then you're going to charge 25 cents for every minute that they've gone over, and then a 15% tax on the subtotal.
 *
 * I want you to create separate methods to calculate the tax, to calculate the overage fees, and to calculate and print the final total.
 *
 * Please print this as an itemized bill.
 * Enter base cost of the plan:
 * 82.45
 * Enter overage minutes:
 * 9
 * Phone Bill Statement
 * Plan: $82.45
 * Overage: $2.25
 * Tax: $12.71
 * Total: $97.41
 */

package no.nav.iftikhar.repetisjon.kapittel5;

import java.util.Scanner;

public class PhoneBill {
      static final int overforbrukSats = 25;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

       // inhente ukjente verdier
        double fasteKostnader = innHentFastKost();
        double overforbruk = innHentOverforbruk();
        double mva = innHentMOMS(fasteKostnader, overforbruk);
        scanner.close();

        //beregne
        double total = lagRegning(fasteKostnader, overforbruk, mva);

        //utskrift
        skrifUtFaktura(fasteKostnader, overforbruk, mva, total);

    }

    private static double innHentFastKost() {
        System.out.println(" Hva er de faste kostnadene for abbonementet inkludert faste ringeminutter");
        double fasteKostnader = scanner.nextDouble();
        return fasteKostnader;
    }

    private static double innHentOverforbruk() {
        System.out.println(" Tast inn tellerskritt du kar brukt over inkluderte minutter ( 1 tellerskitt minutt = 25 krone ) ");
        double overforbruk = scanner.nextDouble();
        overforbruk = overforbruk * overforbrukSats;
        return overforbruk;
    }

    private static double innHentMOMS(double fasteKostnader, double overforbruk) {
        System.out.println(" Tast inn merverdiavgiftsatsen for telefoni fo inneværende år : ");
        double mva = scanner.nextDouble();
        mva = ((fasteKostnader + overforbruk)*(mva))/100;
        return mva;
    }

    private static double lagRegning(double fasteKostnader, double overforbruk, double mva) {
        double total = fasteKostnader + overforbruk +mva;
        return total;
    }

    private static void skrifUtFaktura(double fasteKostnader, double overforbruk, double mva, double total) {
        System.out.println(" *******************************************************************************************");
        System.out.println(" ****************************** TELEFONREGNING *********************************************");
        System.out.println("");
        System.out.println("                                                                         Faktura dat 090920");
        System.out.println("                                                                   Gjeldende temin 2020- 09");
        System.out.println("                                                                   ID 971, Enhet 4795055971");
        System.out.println("    .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   ");
        System.out.println(" Faste kostnader denne termin              = " + fasteKostnader + " kroner.");
        System.out.println(" overforbruk denne termin                  = " + overforbruk + " kroner.");
        System.out.println(" Merverdig avgift                          = " + mva + " kroner.");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(" Totalt å betale denne termin              = " + total + " kroner.");
        System.out.println("============================================================================================");
    }
}
