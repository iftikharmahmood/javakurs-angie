package no.nav.iftikhar.kapittel5;
import java.util.Scanner;

/*
* Metoder
* La et program som beregner faktura for telefon med
* grunnbeløp
* tellerskritt
* moms
* total
 */

//globale variabler


public class TelefonFaktura {

    static double mva = 0.15;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){

        // innhent grunnbeløp
        double grunnBelop = innhentGrunnBelop();

        // innhent tellerskritt
       double tellerSkritt =  innhentTellerSkritt();
        scanner.close();

        // beregn og svar
        beregn(grunnBelop, tellerSkritt);

    }

    public static double innhentGrunnBelop(){
        System.out.println(" Tast inn grunnbeløpet for denne måneden: ");
        double grunnBelop = scanner.nextDouble();
        return grunnBelop;
    }

    public static double innhentTellerSkritt() {
        System.out.println(" Tast inn denne månedens tellerskritt: ");
        double tellerSkritt = scanner.nextDouble();
        return tellerSkritt;
    }

    public static void beregn(double grunnBelop, double tellerSkritt){
        double saldo = grunnBelop + tellerSkritt;
        double skatt = saldo * mva;
        double faktura = saldo + skatt;

        System.out.println(" *********** Telefon faktura *********** ");
        System.out.println();
        System.out.println("             Faste kostnader: " + grunnBelop);
        System.out.println("+ Tellerskritt denne periode: " + tellerSkritt);
        System.out.println("+                    15% MVA: " + skatt);
        System.out.println(" =                 Total sum: " + faktura);
        System.out.println();
        System.out.println(" ***************************************** ");

    }

}
