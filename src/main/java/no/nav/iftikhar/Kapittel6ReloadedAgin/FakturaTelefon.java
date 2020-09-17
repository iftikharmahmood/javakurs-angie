package Kapittel6ReloadedAgin;

/*
*Driver programmet til TelefonFaktura3
 */

import java.util.Scanner;

public class FakturaTelefon {


    public static void main(String args[]) {

        int id;
        double fasteKostnader;
        double tellerskrittInkludert;
        double brukteTellerskritt;
        double mva;

        TelefonFaktura3 faktura = new TelefonFaktura3();

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Hvilket telefon nr gjelder regningen? ");
        id = scanner.nextInt();
        faktura.setId(id);

        System.out.println(" Hva er faste kostnader per måned: ");
        fasteKostnader = scanner.nextDouble();
        faktura.setFasteKostnader(fasteKostnader);

        System.out.println(" Hva er faste inkluderte tellerskritt per måned: ");
        tellerskrittInkludert = scanner.nextDouble();
        faktura.setTellerskrittInkludert(tellerskrittInkludert);

        System.out.println("Hvor mange tellerskritt er brukt denne måneden: ");
        brukteTellerskritt = scanner.nextDouble();
        faktura.setBrukteTellerskritt(brukteTellerskritt);

        System.out.println("Hva er gjeldende merverdiavgift sats: ");
        mva = scanner.nextDouble();
        faktura.setMva(mva);

        scanner.close();

        faktura.skrivUtFaktura();
    }

}
