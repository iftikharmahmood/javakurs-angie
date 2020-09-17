package no.nav.iftikhar.kapittel3;

import java.util.Scanner;

/*
IF setninger:
Alle selgere tjener 10000,00 kr pr uke.
Selgere som har flere en 10 salg pr uke får en tilleggsbonus på 2500,00 kroner.
 */
public class SalaryCalculator {

    public static void main(String args[]){
        //1. deklarere kjente variabler og verdier
        int lonn = 10000;
        int bonus = 2500;
        int kvote = 10;

        //2. innhente ukjente verdier
        System.out.println(" Hvor mange salg har den aktuelle selgeren gjennomført denne uken ?");
        Scanner scanner = new Scanner(System.in);
        int antallSalg = scanner.nextInt();
        scanner.close();

        //3. avklare bonusinntjening
        if (antallSalg > kvote){
            lonn = lonn + bonus;

        }

        //4. kalkulere og levere lønnsresultat
        System.out.println(" Den ansattes lønn for beregningsuken blir: " + lonn +" kroner, inkludert eventuelle bonuser, NB grunnlønn for inntil 10 salg i uken er 10000,00 kroner.");
    }
}
