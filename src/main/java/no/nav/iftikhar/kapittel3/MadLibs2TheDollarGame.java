package no.nav.iftikhar.kapittel3;

import java.util.Scanner;

/*
*SPILL
* dette programme leser inn verdier fra bruker i form av antall mynter med forskjellig verdi.
* Verdien av de samlede myntene skal komme nærmest 1 krone.
* Hvis samlet verdi av myntene er over over 1 krone, er spillet tapt og det skal vises som resultat hvor mye over 1 krone den samlede verdien var.
* Det samme gjelder hvis gjelder hvis den samlede verdien er under 1 krone.
* det er lov med negative verdier.
 */
public class MadLibs2TheDollarGame {
    public static void main(String[] args){


        //Variabel deklarasjon (Initializing)
        int etOre;
        int toOrer;
        int femOrer;
        int tiOrer;
        int tjueFemOrer;
        int femtiOrer;
        int krone = 100;

        //Bruker info (out)
        System.out.println(" <*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*> ");
        System.out.println(" <*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*> ");
        System.out.println(" ************************************   SPILL   ******************************************************");
        System.out.println(" <*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*> ");
        System.out.println(" <*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*> ");
        System.out.println();
        System.out.println();
        System.out.println("Du skal samle mynter nok til å få en krone");
        System.out.println();
        System.out.println();
        System.out.println(" <*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*> ");
        System.out.println(" <*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*> ");

        // innhente data (in)
        System.out.println("Hvor mange ettøringer vil du ha?");
        Scanner scanner = new Scanner(System.in);
        etOre = scanner.nextInt();

        System.out.println("Hvor mange toøringer vil du ha?");
        toOrer = scanner.nextInt();

        System.out.println("Hvor mange femøringer vil du ha?");
        femOrer = scanner.nextInt();

        System.out.println("Hvor mange tiøringer vil du ha?");
        tiOrer = scanner.nextInt();

        System.out.println("Hvor mange tjuefemøringer vil du ha?");
        tjueFemOrer = scanner.nextInt();

        System.out.println("Hvor mange femtiøringer vil du ha?");
        femtiOrer = scanner.nextInt();
        scanner.close();

        //beregne innkommne verdier (Calcuate)
        int result = (etOre + (toOrer * 2) + (femOrer * 5) + (tiOrer * 10) + (tjueFemOrer *25) + (femtiOrer * 50));

        //logikk og svare bruker (Out)
        if (result == krone) {
            System.out.println(" <*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*> ");
            System.out.println(" <*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*> ");
            System.out.println("               *********** Gratulerer du har VUNNET spillet ***********");
            System.out.println("          *********** Du samlet akkurat nok mynter til en krone ***********");
            System.out.println(" <*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*> ");
            System.out.println(" <*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*> ");
        }
        else if (result > krone){
            System.out.println(" <*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*> ");
            System.out.println("                                      Du har tapt spillet ");
            System.out.println("*********** Du samlet mynter som tilsammen blir mer en en krone ***********");
            System.out.println("Resultatet ble at du hadde : " + (result - krone) + " formange ører over en hel krone");

        }
        else {
            System.out.println(" <*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*>*><*><*><*> ");
            System.out.println("                                      Du har tapt spillet ");
            System.out.println("*********** Du samlet for få mynter til å få en hel krone ***********");
            System.out.println("Resultatet ble at du manglet : " + (krone -result) + "ører for å få til en hel korone");

        }

    }
}