package no.nav.iftikhar.repetisjon.kapittel6;

import java.util.Scanner;

public class UtskriftTelefonRegning {

    private static double tellerskritt;
    private static double subtotal;
    private static double merverdiavgift;
    private static double total;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        objekt1();
        System.out.println();

        objekt2();
        System.out.println();

        brukerbestemObjekt();
        scanner.close();
    }

    public static void objekt1() {

        //Utskrift Dummy objekt 1
        // Konstrukere objekt 1 ("Dummy2 Dummy2", 2222 )
        //TelefonRegning telefonRegning = //
        new TelefonRegning("Dummy2 Dummy2", 2222, 22222222, 25, 2000, 500);
        // sette basiskostnaden
        BasisKostnadTelefon fasteKostnader = new BasisKostnadTelefon(500);
        System.out.println("Navn " + TelefonRegning.getNavn() + " ID nr " + TelefonRegning.getId() + " Telefon nr " + TelefonRegning.getTlfNr());
        System.out.println("MVA sats " + TelefonRegning.getSkatteSats());
        System.out.println("Faste kostnader " + BasisKostnadTelefon.getBasisKostnad());
        System.out.println("Brukte tellerskritt " + TelefonRegning.getBrukteTellerskritt());
        System.out.println("Inkluderte ringeminutter " + TelefonRegning.getGratisTellerskritt());
        System.out.println("*********************************************************************************************");

        //Beregninger
        if (TelefonRegning.getBrukteTellerskritt() < TelefonRegning.getGratisTellerskritt()) {
            tellerskritt = 0;
        } else {
            tellerskritt = (TelefonRegning.getBrukteTellerskritt() - TelefonRegning.getGratisTellerskritt());
        }

        subtotal = (BasisKostnadTelefon.getBasisKostnad() + tellerskritt);
        merverdiavgift = subtotal * (TelefonRegning.getSkatteSats() / 100);
        total = (subtotal + (subtotal * (TelefonRegning.getSkatteSats() / 100)));
        System.out.println();
        System.out.println(" Subtotal " + subtotal);
        System.out.println("_____________________________________________________________________________________________");
        System.out.println("Totalt å betale " + total);
        System.out.println("=============================================================================================");
        System.out.println("Herav merverdiavgift " + merverdiavgift);
        System.out.println("*********************************************************************************************");
        System.out.println("*********************************************************************************************");
    }


    public static void objekt2() {
        //Utskrift Dummy objekt 2
        // Konstrukere objekt 2 ("Dummy2 case ID ukjent)
        //TelefonRegning telefonRegning = //
        new TelefonRegning(2222);
        // sette basiskostnaden
        new BasisKostnadTelefon(500);
        System.out.println("Navn " + TelefonRegning.getNavn() + " ID nr " + TelefonRegning.getId() + " Telefon nr " + TelefonRegning.getTlfNr());
        System.out.println("MVA sats " + TelefonRegning.getSkatteSats());
        System.out.println("Faste kostnader " + BasisKostnadTelefon.getBasisKostnad());
        System.out.println("Brukte tellerskritt " + TelefonRegning.getBrukteTellerskritt());
        System.out.println("Inkluderte ringeminutter " + TelefonRegning.getGratisTellerskritt());
        System.out.println("*********************************************************************************************");

        //Beregninger
        if (TelefonRegning.getBrukteTellerskritt() < TelefonRegning.getGratisTellerskritt()) {
            tellerskritt = 0;
        } else {
            tellerskritt = (TelefonRegning.getBrukteTellerskritt() - TelefonRegning.getGratisTellerskritt());
        }

        subtotal = (BasisKostnadTelefon.getBasisKostnad() + tellerskritt);
        merverdiavgift = subtotal * (TelefonRegning.getSkatteSats() / 100);
        total = (subtotal + (subtotal * (TelefonRegning.getSkatteSats() / 100)));
        System.out.println();
        System.out.println(" Subtotal " + subtotal);
        System.out.println("_____________________________________________________________________________________________");
        System.out.println("Totalt å betale " + total);
        System.out.println("=============================================================================================");
        System.out.println("Herav merverdiavgift " + merverdiavgift);
        System.out.println("*********************************************************************************************");
        System.out.println("*********************************************************************************************");
    }

        public static void brukerbestemObjekt(){

        //Utskrift brukerlaget objekt
        // Konstrukere objekt 3 (brukerbestemt )

        System.out.println(" Tast inn navnet på abonenten NB ingen mellomrom");
        String navn = scanner.next();
        System.out.println(" Tast inn Fakturaens ID nr fire siffre");
        int id = scanner.nextInt();
        System.out.println(" Tast inn telefon nummeret fakturaen gjelder 8 siffre ");
        int tlfNr= scanner.nextInt();
        System.out.println(" Tast inn gjeldende MVA sats for telefoni ");
        double skatteSats = scanner.nextDouble();
        System.out.println(" Tast inn telleskritt bruk for abonenten ");
        double brukteTellerskritt = scanner.nextDouble();
        System.out.println(" Tast inn inkluderte telleskritt som skal trekkes fra ");
        double gratisTellerskritt = scanner.nextDouble();
        System.out.println(" Tast inn de faste kostnadene ");
        double basisKostnad = scanner.nextDouble();


        new TelefonRegning(navn, id, tlfNr, skatteSats, brukteTellerskritt, gratisTellerskritt);
        new BasisKostnadTelefon(basisKostnad);

        System.out.println();
        System.out.println();
        System.out.println("*********************************************************************************************");

        System.out.println("Navn " + TelefonRegning.getNavn() + " ID nr " + TelefonRegning.getId() + " Telefon nr " + TelefonRegning.getTlfNr());
        System.out.println("MVA sats " + TelefonRegning.getSkatteSats());
        System.out.println("Faste kostnader " + BasisKostnadTelefon.getBasisKostnad());
        System.out.println("Brukte tellerskritt " + TelefonRegning.getBrukteTellerskritt());
        System.out.println("Inkluderte ringeminutter " + TelefonRegning.getGratisTellerskritt());
        System.out.println("*********************************************************************************************");

        //Beregninger
        if (TelefonRegning.getBrukteTellerskritt() < TelefonRegning.getGratisTellerskritt()) {
            tellerskritt = 0;
        } else {
            tellerskritt = (TelefonRegning.getBrukteTellerskritt() - TelefonRegning.getGratisTellerskritt());
        }

        subtotal = (BasisKostnadTelefon.getBasisKostnad() + tellerskritt);
        merverdiavgift = subtotal * (TelefonRegning.getSkatteSats() / 100);
        total = (subtotal + (subtotal * (TelefonRegning.getSkatteSats() / 100)));
        System.out.println();
        System.out.println(" Subtotal " + subtotal);
        System.out.println("_____________________________________________________________________________________________");
        System.out.println("Totalt å betale " + total);
        System.out.println("=============================================================================================");
        System.out.println("Herav merverdiavgift " + merverdiavgift);
        System.out.println("*********************************************************************************************");
        System.out.println("*********************************************************************************************");
    }

}
