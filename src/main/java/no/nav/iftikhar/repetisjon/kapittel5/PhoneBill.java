/**
 * input the plan fee and the number of overage minutes.
 * And then you're going to charge 25 cents for every minute that they've gone over, and then tax on the subtotal.
 * I want you to create separate methods to calculate the tax, to calculate the overage fees,
 * and to calculate and print the final total.
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

import java.io.InputStream;
import java.util.Scanner;

public class PhoneBill {

    private final int OVERFORBRUK_SATS = 25;
    private double fasteKostnader;
    private double overforbruk;
    private double mva;
    private double total;
    private Scanner scanner;


    public PhoneBill(InputStream in){
        this.scanner = new Scanner(in);
    }

    public PhoneBill(Scanner scanner){
        this.scanner = scanner;
    }

    public PhoneBill(){
        this.scanner = new Scanner(System.in);
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void lagFaktura(){

       // inhente ukjente verdier
        double fasteKostnader = innHentFastKost();
        double overforbruk = innHentOverforbruk();
        double mva = innHentMOMS(fasteKostnader, overforbruk);

        //beregne
        double total = lagRegning(fasteKostnader, overforbruk, mva);

        //utskrift
        skrifUtFaktura(fasteKostnader, overforbruk, mva, total);
    }

    public double innHentFastKost() {
        System.out.println(" Hva er de faste kostnadene for abonementet innkludert faste ringeminutter");
        //fasteKostnader = getScanner();
        fasteKostnader = scanner.nextDouble();
        return fasteKostnader;
    }

    public double innHentOverforbruk() {
        System.out.println(" Tast inn tellerskritt du kar brukt over inkluderte minutter ( 1 tellerskitt minutt = 25 krone ) ");
        overforbruk = scanner.nextDouble();
        overforbruk = overforbruk * OVERFORBRUK_SATS;
        return overforbruk;
    }

    public double innHentMOMS(double fasteKostnader, double overforbruk) {
        System.out.println(" Tast inn merverdiavgiftsatsen for telefoni for inneværende år : ");
        mva = scanner.nextDouble();
        mva = ((fasteKostnader + overforbruk)*(mva))/100;
        return mva;
    }

    public double lagRegning(double fasteKostnader, double overforbruk, double mva) {
        total = fasteKostnader + overforbruk +mva;
        return total;
    }

    public void skrifUtFaktura(double fasteKostnader, double overforbruk, double mva, double total) {
        System.out.println(" *******************************************************************************************");
        System.out.println(" ****************************** TELEFONREGNING *********************************************");
        System.out.println("");
        System.out.println("                                                                         Faktura dato 090920");
        System.out.println("                                                                   Gjeldende temin 2020- 09");
        System.out.println("                                                                   ID 971, Enhet 4795055971");
        System.out.println("    .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   ");
        System.out.println(" Faste kostnader denne termin              = " + fasteKostnader + " kroner.");
        System.out.println(" overforbruk denne termin                  = " + overforbruk + " kroner.");
        System.out.println(" Herav merverdig avgift                    = " + mva + " kroner.");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(" Totalt å betale denne termin              = " + total + " kroner.");
        System.out.println("============================================================================================");
    }
}
